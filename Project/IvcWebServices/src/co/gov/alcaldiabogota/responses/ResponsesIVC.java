package co.gov.alcaldiabogota.responses;

import co.gov.alcaldiabogota.clients.SoapEntities;
import co.gov.alcaldiabogota.connections.SendDataToRest;
import co.gov.alcaldiabogota.utils.Utils;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMAbstractFactory;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.OMException;
import org.apache.axiom.om.OMFactory;
import org.apache.axiom.om.OMNamespace;
import org.apache.axiom.om.OMNode;
import org.xml.sax.SAXException;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class ResponsesIVC {
    
    private final OMFactory omFactory = OMAbstractFactory.getOMFactory();
    private final static Logger LOGGER = Logger.getLogger(ResponsesIVC.class.getName());
    
    private String responseText;
    private OMNode response;
    
    public ResponsesIVC() {
    }

    /**
     * This method can be used to get values from request parameter
     *
     * @param requestElement top level element from request body, e.g.
     * "getParam" element)
     * @param requestChildName request child element name, e.g. "symbol"
     * @param properties
     * @return request parameter value
     */
    public String getRequestParam(OMElement requestElement, String requestChildName, Properties properties) {
        try {            
            QName qname = new QName(properties.getProperty("SchemaIVC"), requestChildName);
            OMElement requestChildElement = requestElement.getFirstChildWithName(qname);            
            return requestChildElement.getText();
        } catch (OMException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }        
        return "Null Value";
    }

    /**
     * This method can be used to generate response
     *
     * @param responseElementName element name for top level response element,
     * e.g. "createResponse"
     * @param responseChildName response element name, e.g. "return"
     * @param response OMNode representing a response (use omFactory to create
     * the OMNode object)
     * @param properties
     * @return request parameter value
     */
    public OMElement createResponse(String responseElementName, String responseChildName, OMNode response, Properties properties) {
        OMNamespace omNs = omFactory.createOMNamespace(properties.getProperty("SchemaIVC"), "ns");
        OMElement responseElement = omFactory.createOMElement(responseElementName, omNs);
        OMElement responseChildElement = omFactory.createOMElement(responseChildName, omNs);
        responseChildElement.addChild(response);
        responseElement.addChild(responseChildElement);
        return responseElement;
    }

    /**
     * This method can be used to generate response
     *
     * @param entity_id
     * @param table_name
     * @param properties
     * @param consult_date
     * @return response of each soap server
     * @throws javax.xml.stream.XMLStreamException
     * @throws javax.xml.parsers.ParserConfigurationException
     * @throws java.net.MalformedURLException
     * @throws org.xml.sax.SAXException
     * @throws java.lang.InterruptedException
     */
    public OMElement responseSoapEntities(String entity_id, String table_name, String consult_date, Properties properties) throws XMLStreamException, ParserConfigurationException, MalformedURLException, SAXException, InterruptedException, Exception {
        if (Utils.isTableName(entity_id, table_name)) {
            this.switchSoapEntities(entity_id, table_name, consult_date, properties);
            if (!"Error: Web service don't exist".equals(this.responseText)) {
                this.response = omFactory.createOMText(this.responseText);
            } else {
                throw new UnsupportedOperationException(this.responseText);
            }
            return createResponse("synchronizeResponse", "return", this.response, properties);
        } else {
            throw new UnsupportedOperationException("Verify data => Entity: " + entity_id + ", Table: " + table_name);
        }
    }
    
    /**
     * 
     * @param entity_id
     * @param table_name
     * @param consult_date
     * @param properties
     * @return
     * @throws XMLStreamException
     * @throws MalformedURLException
     * @throws InterruptedException
     * @throws Exception 
     */
    private String switchSoapEntities(String entity_id, String table_name, String consult_date, Properties properties) throws XMLStreamException, MalformedURLException, InterruptedException, Exception {   
        switch (entity_id) {
            case "1": //Ambiente
                responseText = "Synchronize in process: " + table_name.toLowerCase() + ". Error: Web service don't exist";
                break;
            case "2": // Salud
                String responseSoap = SoapEntities.clientSoap("2", table_name, consult_date, properties);
                String response = SendDataToRest.processDataFromSoap(responseSoap, "Censo", properties);
                responseText = "Synchronize in process: " + table_name.toLowerCase() + ". " + response;
                LOGGER.log(Level.INFO, "Response Soap: {0}", new Object[]{responseText});
                break;
            default:
                responseText = "Error: Web service don't exist";
                break;
        }
        return responseText;
    }
}