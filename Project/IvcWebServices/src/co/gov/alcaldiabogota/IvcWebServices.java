package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.connections.RestClient;
import co.gov.alcaldiabogota.parameters.PropertiesFile;
import co.gov.alcaldiabogota.parameters.Stablishment;
import co.gov.alcaldiabogota.parameters.StablishmentCCB;
import co.gov.alcaldiabogota.responses.ResponsesIVC;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.apache.axiom.om.*;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.axiom.om.impl.dom.DocumentImpl;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.InputSource;
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
     * This method to build establishment object and connect to REST Server in
     * Yii
     *
     * @param requestElement
     * @return
     * @throws XMLStreamException
     */
    public OMElement establishment(OMElement requestElement) throws XMLStreamException, IOException {
        String responseRequest = request.requestRestServer(properties.getProperty("RestApiFront"), parametersStablishment.setStablishmentParameters(requestElement, ivc, properties));
        OMNode response = omFactory.createOMText(responseRequest);
        return ivc.createResponse("establishmentResponse", "return", response, properties);
    }

    public OMElement update(OMElement requestElement) throws IOException, ParserConfigurationException, SAXException, TransformerException {
        String batch = ivc.getRequestParam(requestElement, "batch", properties);
        Map<String, String> parameters = null;
        String restURL = properties.getProperty("RestApiFront") + "?batch=" + batch;
        String responseRequest = request.requestRestServer(restURL, parameters);

        GsonBuilder gsonBuilder = new GsonBuilder();
        gsonBuilder.setDateFormat("M/d/yy hh:mm a");
        Gson gson = gsonBuilder.create();

        StablishmentCCB[] stablishmentCCB = gson.fromJson(responseRequest, StablishmentCCB[].class);
        List<StablishmentCCB> listStablishment = Arrays.asList(stablishmentCCB);
        
        Document xmlDoc = new DocumentImpl();                
        
        Element sincronizacionIVC = xmlDoc.createElement("sincronizacionIVC");
        
        /**
         * fechaSincronizacion
         */
        Node fechaSincronizacion = xmlDoc.createElement("fechaSincronizacion");
        fechaSincronizacion.appendChild(xmlDoc.createTextNode("AAAAMMDD"));
        sincronizacionIVC.appendChild(fechaSincronizacion);
        
        /**
         * tipoSincronizacion
         */
        Node tipoSincronizacion = xmlDoc.createElement("tipoSincronizacion");
        tipoSincronizacion.appendChild(xmlDoc.createTextNode("Masiva"));
        sincronizacionIVC.appendChild(tipoSincronizacion);
        
        /**
         * numeroCamaraComercio
         */
        Node numeroCamaraComercio = xmlDoc.createElement("numeroCamaraComercio");
        numeroCamaraComercio.appendChild(xmlDoc.createTextNode("04"));
        sincronizacionIVC.appendChild(numeroCamaraComercio);
        
        /**
         * usuarioAutorizado
         */
        Node usuarioAutorizado = xmlDoc.createElement("usuarioAutorizado");
        usuarioAutorizado.appendChild(xmlDoc.createTextNode("wsbta2017"));
        sincronizacionIVC.appendChild(usuarioAutorizado);
        
        /**
         * claveUsuario
         */
        Node claveUsuario = xmlDoc.createElement("claveUsuario");
        claveUsuario.appendChild(xmlDoc.createTextNode("bt@*2017"));
        sincronizacionIVC.appendChild(claveUsuario);
        
        /**
         * numeroRegistros
         */
        Node numeroRegistros = xmlDoc.createElement("numeroRegistros");
        claveUsuario.appendChild(xmlDoc.createTextNode(""));
        sincronizacionIVC.appendChild(claveUsuario);
        
        /**
         * Multiple node:
         * datosIdentificacion
         */                
        Node datosIdentificacion = xmlDoc.createElement("datosIdentificacion");
        /*
        Nombre
        */
        Node nombre = xmlDoc.createElement("nombre");
        nombre.appendChild(xmlDoc.createTextNode(listStablishment.get(0).getName_commercial()));     
        datosIdentificacion.appendChild(nombre);
        /*
        
        */
        
        sincronizacionIVC.appendChild(datosIdentificacion);
        
        /**
         * Save sincronizacionIVC
         */
        xmlDoc.appendChild(sincronizacionIVC);
        
        StringWriter stringWriter = new StringWriter();
        Source source = new DOMSource(xmlDoc); 
         
        Transformer xformer = TransformerFactory.newInstance().newTransformer();                        
        xformer.transform(source, new StreamResult(stringWriter));

        LOGGER.log(Level.INFO, "URL: {0}, Response: {1}", new Object[]{restURL, stringWriter.toString()});

        OMNode response = omFactory.createOMText(listStablishment.get(0).getName_commercial());
        return ivc.createResponse("updateResponse", "return", response, properties);
    }

}
