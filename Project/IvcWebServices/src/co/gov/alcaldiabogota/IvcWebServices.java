package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.clients.SoapConfecamaras;
import co.gov.alcaldiabogota.connections.RestClient;
import co.gov.alcaldiabogota.parameters.PropertiesFile;
import co.gov.alcaldiabogota.parameters.Stablishment;
import co.gov.alcaldiabogota.responses.ResponsesIVC;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.axiom.om.*;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.TransformerException;
import org.xml.sax.SAXException;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class IvcWebServices {

    private final static Logger LOGGER = Logger.getLogger(IvcWebServices.class.getName());
    private final OMFactory omFactory = OMAbstractFactory.getOMFactory();
    Properties properties = new Properties();
    PropertiesFile propertiesFile = new PropertiesFile();
    ResponsesIVC ivc = new ResponsesIVC();
    Stablishment parametersStablishment = new Stablishment();
    RestClient request = new RestClient();
    InputStream input = null;

    public IvcWebServices() throws FileNotFoundException, IOException, Exception {
        input = new FileInputStream(propertiesFile.propertiesFile);
        properties.load(input);
    }

    /**
     * This method to synchronize and connect soap client from the entities
     *
     * @param requestElement
     * @return
     * @throws XMLStreamException
     * @throws Exception
     */
    public OMElement synchronize(OMElement requestElement) throws XMLStreamException, Exception {
        String entity_id = ivc.getRequestParam(requestElement, "entity_id", properties);
        String table_name = ivc.getRequestParam(requestElement, "table_name", properties);
        String consult_date = ivc.getRequestParam(requestElement, "consult_date", properties);
        LOGGER.log(Level.INFO, "Entity: {0}, Table: {1}, Date: {2}, Rest: {3}", new Object[]{entity_id, table_name, consult_date, properties.getProperty("RestApiFront")});
        return ivc.responseSoapEntities(entity_id, table_name, consult_date, properties);
    }

    /**
     * This method to build establishment object and connect to REST Server in Yii
     *
     * @param requestElement
     * @return
     * @throws XMLStreamException
     * @throws java.io.IOException
     */
    public OMElement establishment(OMElement requestElement) throws XMLStreamException, IOException {
        String responseRequest = request.requestRestServer(properties.getProperty("RestApiFront"), parametersStablishment.setStablishmentParameters(requestElement, ivc, properties));
        OMNode response = omFactory.createOMText(responseRequest);
        return ivc.createResponse("establishmentResponse", "return", response, properties);
    }

    /**
     * 
     * @param requestElement
     * @return
     * @throws IOException
     * @throws ParserConfigurationException
     * @throws SAXException
     * @throws TransformerException
     * @throws MalformedURLException
     * @throws XMLStreamException 
     */
    public OMElement update(OMElement requestElement) throws IOException, ParserConfigurationException, SAXException, TransformerException, MalformedURLException, XMLStreamException {
        String batch = ivc.getRequestParam(requestElement, "batch", properties);
        String responseSoapConfecamaras = SoapConfecamaras.clientSoap(batch, request, properties);
        OMNode response = omFactory.createOMText(responseSoapConfecamaras);
        return ivc.createResponse("updateResponse", "return", response, properties);
    }

}
