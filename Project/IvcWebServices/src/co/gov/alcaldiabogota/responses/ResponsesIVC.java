/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota.responses;

import co.gov.alcaldiabogota.IvcWebServices;
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
    
    //private static final String SCHEMA_NAMESPACE = "http://ivcWebServices.alcaldiabogota.gov.co/xsd";
    private final OMFactory omFactory = OMAbstractFactory.getOMFactory();
    private final static Logger LOGGER = Logger.getLogger(ResponsesIVC.class.getName());

    public ResponsesIVC() {
    }
    
    
    /**
     * This method can be used to get values from request parameter
     *
     * @param requestElement top level element from request body, e.g.
     * "getPrice" element)
     * @param requestChildName request child element name, e.g. "symbol"
     * @return request parameter value
     */
    public String getRequestParam(OMElement requestElement, String requestChildName, Properties properties) {
        try {

            QName qname = new QName(properties.getProperty("SchemaIVC"), requestChildName);
            //LOGGER.log(Level.INFO, "Request Child Element: {0}, Q Name: {1}", new Object[]{requestChildName, qname.getLocalPart()});
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
     * e.g. "getPriceResponse"
     * @param responseChildName response element name, e.g. "return"
     * @param response OMNode representing a response (use omFactory to create
     * the OMNode object)
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


    public OMElement responseSoapEntities(String entity_id, String table_name, String consult_date, Properties properties) throws XMLStreamException, ParserConfigurationException, MalformedURLException, SAXException, InterruptedException, Exception {

        String responseText;
        

        if (Utils.isTableName(entity_id, table_name)) {

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

            OMNode response;

            if (!"Error: Web service don't exist".equals(responseText)) {
                response = omFactory.createOMText(responseText);
            } else {
                throw new UnsupportedOperationException(responseText);
            }

            return createResponse("synchronizeResponse", "return", response, properties);
        } else {
            throw new UnsupportedOperationException("Verify data => Entity: " + entity_id + ", Table: " + table_name);
        }

    }


}