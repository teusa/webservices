package co.gov.alcaldiabogota.clients;

import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.net.URL;
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
public class SoapEntities {

    public static String clientSoap(String entity_id, String soapObject, String consultDate, Properties properties) throws AxisFault, XMLStreamException, MalformedURLException, InterruptedException, Exception {

        if (entity_id.equals("2")) {

            // Default configuration to Axis2
            ConfigurationContext context = null;
             
            // URL Object from JDK
            URL wsdlURL;
            wsdlURL = new URL(properties.getProperty("WsdlURLHealthEntity"));

            // Can be null
            QName serviceName = new QName(properties.getProperty("SchemaHealthEntity"), "WebServiceVigiaDC");

            // WSDL PortType
            String portName = "WebServiceVigiaDCSoap12";

            QName operation = null;
            String xml = null;

            switch (soapObject) {
                case "establishment":
                    // Object to invoke	
                    operation = new QName(properties.getProperty("SchemaHealthEntity"), "DatosServicio");
                    // XML Request
                    xml = "<tem:DatosServicio xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n"
                            + "         <tem:Servicio>ServicioCensoEstablecimientosIVC</tem:Servicio>\n"
                            + "         <tem:Login>" + properties.getProperty("LoginSoapHealthEntity") + "</tem:Login>\n"
                            + "         <tem:Contraseña>" + properties.getProperty("PasswordSoapHealthEntity") + "</tem:Contraseña>\n"
                            + "         <tem:Parametros>\n"
                            + "         <![CDATA[\n"
                            + "            <FECHA>\n"
                            + "               <Dia>" + consultDate + "</Dia>\n"
                            + "            </FECHA>\n"
                            + "         ]]>\n"
                            + "         </tem:Parametros>\n"
                            + "      </tem:DatosServicio>";
                    break;
                default:
                    break;
            }
            
            // Get the request to send the web service of Entity Salud
            StAXOMBuilder builder = new StAXOMBuilder(new ByteArrayInputStream(xml.getBytes()));
            OMElement request = builder.getDocumentElement();

            // Client call
            ServiceClient wsClient = new ServiceClient(context, wsdlURL, serviceName, portName);
            OMElement responsesoap = wsClient.sendReceive(operation, request);            
            
            /*
            Solución poderosa, aquí está el poder los hilos
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

            return responsesoap.toString();

        } else {
            return null;
        }

    }

}
