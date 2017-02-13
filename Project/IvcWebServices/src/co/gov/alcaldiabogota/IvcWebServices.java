package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.connections.RestClient;
import co.gov.alcaldiabogota.parameters.PropertiesFile;
import co.gov.alcaldiabogota.parameters.Stablishment;
import co.gov.alcaldiabogota.responses.ResponsesIVC;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.axiom.om.*;
import javax.xml.stream.XMLStreamException;

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
     * This method to build establishment object and connect to rest in Yii
     * 
     * @param requestElement
     * @return
     * @throws XMLStreamException 
     */
    public OMElement establishment(OMElement requestElement) throws XMLStreamException {
        
        Stablishment parametersStablishment = new Stablishment();
        
        RestClient request = new RestClient();            
        String responseRequest = request.requestRestServer(properties.getProperty("RestApiFront"), parametersStablishment.setStablishmentParameters(requestElement, ivc, properties));
        
        OMNode response = omFactory.createOMText(responseRequest.toString());  
        return ivc.createResponse("establishmentResponse", "return", response, properties);
    }

}