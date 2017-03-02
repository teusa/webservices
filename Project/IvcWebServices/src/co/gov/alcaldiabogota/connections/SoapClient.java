package co.gov.alcaldiabogota.connections;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.Properties;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;
import org.apache.axis2.transport.http.HTTPConstants;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.MultiThreadedHttpConnectionManager;
import org.apache.commons.httpclient.params.HttpConnectionManagerParams;

/**
 *
 * @author jesusrodriguezmiranda
 */
public final class SoapClient {
    
    //private final static Logger LOGGER = Logger.getLogger(SoapConfecamaras.class.getName());

    public SoapClient(){
    }
    public static String connectSoapServer(Map<String, String> soapParameters, Properties properties) throws MalformedURLException, XMLStreamException, AxisFault {
        // Default configuration to Axis2
        ConfigurationContext context = null;
        // URL Object from JDK
        URL wsdlURL = new URL(soapParameters.get("wsdlUrl"));
        // Can be null
        QName serviceName = new QName(soapParameters.get("nameServiceName"), soapParameters.get("valueServiceName"));
        // WSDL PortType
        String portName = soapParameters.get("portName");
        // Object to invoke	
        QName operation = new QName(soapParameters.get("nameOperation"), soapParameters.get("valueOperation"));
        // XML Request
        String xml = soapParameters.get("xml");
        //LOGGER.log(Level.INFO, "Soap: {0}, Response: {1}", new Object[]{wsdlURL, xml});
        // Get the request to send the web service
        StAXOMBuilder builder = new StAXOMBuilder(new ByteArrayInputStream(xml.getBytes()));
        OMElement request = builder.getDocumentElement();
        // Client call
        ServiceClient wsClient = new ServiceClient(context, wsdlURL, serviceName, portName);
        OMElement responseSoap = wsClient.sendReceive(operation, request);
        /*
            9 de febrero 2017 23:26
            Multithread to set context
         */
        wsClient.getServiceContext().getConfigurationContext().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, true);
        MultiThreadedHttpConnectionManager multiThreadedHttpConnectionManager = new MultiThreadedHttpConnectionManager();
        HttpConnectionManagerParams params = new HttpConnectionManagerParams();
        params.setDefaultMaxConnectionsPerHost(20);
        params.setMaxTotalConnections(20);
        params.setSoTimeout(20000);
        params.setConnectionTimeout(20000);
        multiThreadedHttpConnectionManager.setParams(params);
        HttpClient httpClient = new HttpClient(multiThreadedHttpConnectionManager);
        wsClient.getServiceContext().getConfigurationContext().setProperty(HTTPConstants.REUSE_HTTP_CLIENT, true);
        wsClient.getServiceContext().getConfigurationContext().setProperty(HTTPConstants.CACHED_HTTP_CLIENT, httpClient);
        // Clean up soap request
        wsClient.cleanup();
        return responseSoap.toString();
    }

}
