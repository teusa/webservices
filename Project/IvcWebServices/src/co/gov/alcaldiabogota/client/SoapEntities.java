package co.gov.alcaldiabogota.client;

import co.gov.alcaldiabogota.IvcWebServices;
import java.io.ByteArrayInputStream;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.impl.builder.StAXOMBuilder;
import org.apache.axis2.AxisFault;
import org.apache.axis2.client.ServiceClient;
import org.apache.axis2.context.ConfigurationContext;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class SoapEntities {

    private final static Logger LOGGER = Logger.getLogger(IvcWebServices.class.getName());
    private static final String SCHEMA_NAMESPACE = "http://tempuri.org/";

    public static String clientSoap(String entity_id, String soapObject) throws AxisFault, XMLStreamException, MalformedURLException {

        if (entity_id.equals("2")) {

            // Default configuration to Axis2
            ConfigurationContext context = null;

            java.net.URL wsdlURL;
            wsdlURL = new java.net.URL("http://dev.saludcapital.gov.co/sivigiladcpruebas/WebServiceVigiaDC.asmx?wsdl");

            // Can be null
            QName serviceName = new QName(SCHEMA_NAMESPACE, "WebServiceVigiaDC");

            // WSDL PortType
            String portName = "WebServiceVigiaDCSoap12";

            QName operation = null;
            String xml = null;

            switch (soapObject) {
                case "stablishment":
                    // Object to invoke	
                    operation = new QName(SCHEMA_NAMESPACE, "DatosServicio");
                    // XML Request
                    xml = "<tem:DatosServicio xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n"
                            + "         <tem:Servicio>ServicioCensoEstablecimientosIVC</tem:Servicio>\n"
                            + "         <tem:Login>pruebasIVC</tem:Login>\n"
                            + "         <tem:Contraseña>Usu123</tem:Contraseña>\n"
                            + "         <tem:Parametros>\n"
                            + "         <![CDATA[\n"
                            + "            <FECHA>\n"
                            + "re               <Dia>2016/12/27</Dia>\n"
                            + "            </FECHA>\n"
                            + "         ]]>\n"
                            + "         </tem:Parametros>\n"
                            + "      </tem:DatosServicio>";
                    break;
                default:
                    break;
            }

            //LOGGER.log(Level.INFO, "WSDL: {0}, Service: {1}, Operation: {2}", new Object[]{wsdlURL.getFile(), serviceName.getLocalPart(), operation.getLocalPart()});

            // Get the request to send the web service of Entity Salud
            StAXOMBuilder builder = new StAXOMBuilder(new ByteArrayInputStream(xml.getBytes()));
            OMElement request = builder.getDocumentElement();

            // Client call
            ServiceClient wsClient = new ServiceClient(context, wsdlURL, serviceName, portName);

            OMElement responsesoap = wsClient.sendReceive(operation, request);
            
            wsClient.cleanup();

            //LOGGER.log(Level.INFO, "XML from soap: {0}, Response: {1}", new Object[]{xml, responsesoap});

            return responsesoap.toString();

        } else {           
            return  null;            
        }

    }

}
