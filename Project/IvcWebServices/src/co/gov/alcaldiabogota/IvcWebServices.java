/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.client.SoapEntities;
import co.gov.alcaldiabogota.connection.RestClient;
import co.gov.alcaldiabogota.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.axiom.om.*;
import javax.xml.stream.XMLStreamException;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class IvcWebServices {

    // please, check if schema namespace in wsdl file corresponds to this value: 
    private static final String SCHEMA_NAMESPACE = "http://ivcWebServices.alcaldiabogota.gov.co/xsd";
    private final static Logger LOGGER = Logger.getLogger(IvcWebServices.class.getName());

    private OMFactory omFactory = OMAbstractFactory.getOMFactory();
    private OMDocument doc;
    private OMFactory m_axiomFactory;

    /**
     * This method can be used to get values from request parameter
     *
     * @param requestElement top level element from request body, e.g.
     * "getPrice" element)
     * @param requestChildName request child element name, e.g. "symbol"
     * @return request parameter value
     */
    private String getRequestParam(OMElement requestElement, String requestChildName) {
        try {

            QName qname = new QName(SCHEMA_NAMESPACE, requestChildName);
            LOGGER.log(Level.INFO, "Request Child Element: {0}, Q Name: {1}", new Object[]{requestChildName, qname.getLocalPart()});
            OMElement requestChildElement = requestElement.getFirstChildWithName(qname);

            return requestChildElement.getText();
        } catch (Exception ex) {
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
    private OMElement createResponse(String responseElementName, String responseChildName, OMNode response) {
        OMNamespace omNs = omFactory.createOMNamespace(SCHEMA_NAMESPACE, "ns");
        OMElement responseElement = omFactory.createOMElement(responseElementName, omNs);
        OMElement responseChildElement = omFactory.createOMElement(responseChildName, omNs);
        responseChildElement.addChild(response);
        responseElement.addChild(responseChildElement);
        return responseElement;
    }

    public OMElement synchronize(OMElement requestElement) throws XMLStreamException, Exception {

        String entity_id = getRequestParam(requestElement, "entity_id");
        String table_name = getRequestParam(requestElement, "table_name");

        String responseText;

        if (Utils.isTableName(entity_id, table_name)) {

            switch (entity_id) {

                case "1": //Ambiente
                    responseText = "Synchronize in process: " + table_name.toLowerCase() + ". Error: Web service don't exist";
                    break;
                case "2": // Salud
                    String responseSoap = SoapEntities.clientSoap("2", table_name);
                    String textResponseSoap = SendDataToRest.processDataFromSoap(responseSoap, "Censo");
                    responseText = "Synchronize in process: " + table_name.toLowerCase() + ". Response: " + textResponseSoap;
                    LOGGER.log(Level.INFO, "Response: {0}", new Object[]{textResponseSoap});
                    break;
                default:
                    responseText = "Error: Web service don't exist";
                    break;

            }

            OMNode response = omFactory.createOMText(responseText);
            return createResponse("synchronizeResponse", "return", response);
        } else {
            throw new UnsupportedOperationException("Verify data => Entity: " + entity_id + ", Table: " + table_name);
        }

    }
}
