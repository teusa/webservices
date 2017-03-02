package co.gov.alcaldiabogota.clients;

import co.gov.alcaldiabogota.connections.RestClient;
import co.gov.alcaldiabogota.connections.SoapClient;
import co.gov.alcaldiabogota.parameters.ParametersConfecamaras;
import co.gov.alcaldiabogota.parameters.StablishmentCCB;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.io.StringWriter;
import java.net.MalformedURLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.stream.XMLStreamException;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.apache.axiom.om.impl.dom.DocumentImpl;
import org.apache.axis2.AxisFault;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class SoapConfecamaras {

    private final static Logger LOGGER = Logger.getLogger(SoapConfecamaras.class.getName());

    public SoapConfecamaras() {
    }

    public static String clientSoap(String batch, RestClient request, Properties properties) throws MalformedURLException, XMLStreamException, AxisFault, IOException, TransformerException {

        Map<String, String> soapParameters = new HashMap<>();
        soapParameters.put("wsdlUrl", properties.getProperty("WsdlURLConfecamaras"));
        soapParameters.put("nameServiceName", properties.getProperty("SchemaConfecamaras"));
        soapParameters.put("valueServiceName", "ws_sync_server_nuevo");
        soapParameters.put("portName", "ws_sync_server_nuevoPort");

        soapParameters.put("nameOperation", properties.getProperty("SchemaConfecamaras"));
        soapParameters.put("valueOperation", "sincronizacionEntidadesIVC");

        String xml = "<soapenv:Envelope xmlns:xsi=\"http://www.w3.org/2001/XMLSchema-instance\" xmlns:xsd=\"http://www.w3.org/2001/XMLSchema\" xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\">\n"
                + "   <soapenv:Header/>\n"
                + "   <soapenv:Body>\n"
                + "      <sincronizacionEntidadesIVC soapenv:encodingStyle=\"http://schemas.xmlsoap.org/soap/encoding/\">\n"
                + "         <xmlEntrada xsi:type=\"xsd:string\">\n"
                + "		<![CDATA[\n"
                +               createXml(batch, request, properties)
                + "		]]>\n"
                + "	    </xmlEntrada>\n"
                + "      </sincronizacionEntidadesIVC>\n"
                + "   </soapenv:Body>\n"
                + "</soapenv:Envelope>";

        soapParameters.put("xml", xml);
        //LOGGER.log(Level.INFO, "URL: {0}, Response: {1}", new Object[]{"XML", xml});
        String response = SoapClient.connectSoapServer(soapParameters, properties);
        LOGGER.log(Level.INFO, "Soap: {0}, Response: {1}", new Object[]{properties.getProperty("WsdlURLConfecamaras"), response});
        return response;

    }

    private static String createXml(String batch, RestClient request, Properties properties) throws IOException, TransformerException {

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
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate localDate = LocalDate.now();
        Node fechaSincronizacion = xmlDoc.createElement("fechaSincronizacion");
        fechaSincronizacion.appendChild(xmlDoc.createTextNode(dtf.format(localDate)));
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
        numeroCamaraComercio.appendChild(xmlDoc.createTextNode("05"));
        sincronizacionIVC.appendChild(numeroCamaraComercio);

        /**
         * usuarioAutorizado
         */
        Node usuarioAutorizado = xmlDoc.createElement("usuarioAutorizado");
        usuarioAutorizado.appendChild(xmlDoc.createTextNode(properties.getProperty("LoginSoapConfecamaras")));
        sincronizacionIVC.appendChild(usuarioAutorizado);

        /**
         * claveUsuario
         */
        Node claveUsuario = xmlDoc.createElement("claveUsuario");
        claveUsuario.appendChild(xmlDoc.createTextNode(properties.getProperty("PasswordSoapConfecamaras")));
        sincronizacionIVC.appendChild(claveUsuario);

        /**
         * numeroRegistros
         */
        Node numeroRegistros = xmlDoc.createElement("numeroRegistros");
        String sizeListStablishment = Integer.toString(listStablishment.size());
        numeroRegistros.appendChild(xmlDoc.createTextNode(sizeListStablishment));
        sincronizacionIVC.appendChild(numeroRegistros);

        /*
        xmlEstablecimiento
         */
        for (StablishmentCCB stablishment : listStablishment) {
            sincronizacionIVC.appendChild(ParametersConfecamaras.xmlEstablishment(xmlDoc, stablishment));
        }

        /**
         * Save sincronizacionIVC
         */
        xmlDoc.appendChild(sincronizacionIVC);

        StringWriter stringWriter = new StringWriter();
        Source source = new DOMSource(xmlDoc);

        Transformer xformer = TransformerFactory.newInstance().newTransformer();
        xformer.transform(source, new StreamResult(stringWriter));

        return stringWriter.toString();
    }

}
