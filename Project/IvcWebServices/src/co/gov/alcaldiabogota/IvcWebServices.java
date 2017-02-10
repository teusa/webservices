package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.parameters.PropertiesFile;
import co.gov.alcaldiabogota.responses.ResponsesIVC;
import java.io.FileInputStream;
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
    Properties properties = new Properties();
    ResponsesIVC ivc = new ResponsesIVC();
    InputStream input = null;

    public IvcWebServices() {
        PropertiesFile propFile = new PropertiesFile();
        propFile.toString();
    }

    public OMElement synchronize(OMElement requestElement) throws XMLStreamException, Exception {
        
        input = new FileInputStream("config.properties");
        properties.load(input);	

        String entity_id = ivc.getRequestParam(requestElement, "entity_id", properties);
        String table_name = ivc.getRequestParam(requestElement, "table_name", properties);
        String consult_date = ivc.getRequestParam(requestElement, "consult_date", properties);
        
        LOGGER.log(Level.INFO, "Entity: {0}, Table: {1}, Date: {2}, Rest: {3}", new Object[]{entity_id, table_name, consult_date, properties.getProperty("RestApiFront")});

        return ivc.responseSoapEntities(entity_id, table_name, consult_date, properties);
    }
    
    public void establishment() {
        
        
        
    }
    
}