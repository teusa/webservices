package co.gov.alcaldiabogota.clients;

import co.gov.alcaldiabogota.connections.SoapClient;
import java.net.MalformedURLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import javax.xml.stream.XMLStreamException;
import org.apache.axis2.AxisFault;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class SoapEntities {

    public static String clientSoap(String entity_id, String soapObject, String consultDate, Properties properties) throws AxisFault, XMLStreamException, MalformedURLException, InterruptedException, Exception {
        if (entity_id.equals("2")) {
            Map<String, String> soapParameters = new HashMap<>();
            soapParameters.put("wsdlUrl", properties.getProperty("WsdlURLHealthEntity"));
            soapParameters.put("nameServiceName", properties.getProperty("SchemaHealthEntity"));
            soapParameters.put("valueServiceName", "WebServiceVigiaDC");
            soapParameters.put("portName", "WebServiceVigiaDCSoap12");
            switch (soapObject) {
                case "establishment":
                    // XML Request
                    String xml = "<tem:DatosServicio xmlns:soap=\"http://www.w3.org/2003/05/soap-envelope\" xmlns:tem=\"http://tempuri.org/\">\n"
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
                    soapParameters.put("nameOperation", properties.getProperty("SchemaHealthEntity"));
                    soapParameters.put("valueOperation", "DatosServicio");
                    soapParameters.put("xml", xml);
                    break;
                default:
                    break;
            }
            String response = SoapClient.connectSoapServer(soapParameters, properties);
            return response;
        } else {
            return null;
        }

    }

}