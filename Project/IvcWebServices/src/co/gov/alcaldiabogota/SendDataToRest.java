/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.connection.RestClient;
import co.gov.alcaldiabogota.utils.Utils;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.stream.XMLStreamException;
import org.apache.axiom.om.OMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class SendDataToRest {

    private final static Logger LOGGER = Logger.getLogger(IvcWebServices.class.getName());
    private static final String SERVER_REST = "http://192.168.88.244/apirest_ivc/backend/web/api/establishment";

    public static String processDataFromSoap(String xml, String requestChildName) throws XMLStreamException, ParserConfigurationException, SAXException, IOException {
        try {

            //String childValue;
            //String IdSecretaria;
            //String IdEstablecimientoSDS;
            String RazonSocial= "";
            String NombreComercial= "";
            String NITEstablecimiento= "";
            String Sede= "";
            String Direccion= "";
            String codLocalidad= "";
            String NombreLocalidad= "";
            String codUPZ= "";
            String NombreUPZ= "";
            String CodBarrio= "";
            String NombreBarrio= "";
            String Telefono1= "";
            String Telefono2= "";
            String CorreoElectronico= "";
            String NombrePropietario= "";
            String TipoDocumentoPropietario= "";
            String NumeroDocumentoPropietario= "";
            String NombreRepLegal= "";
            String TipoDocumentoRepLegal= "";
            String NumeroDocumentoRepLegal= "";
            String NumeroMatriculaEstablecimiento= "";
            String CodTipoEstablecimiento= "";
            String NombreTipoEstablecimiento= "";
            String CodCIIU= "";
            String NombreActividadEconomica= "";

            Map<String, String> parameters = new HashMap<>();

            String xmlReplace = xml.replace("&lt;", "<").replace("&gt;", ">");

            LOGGER.log(Level.INFO, "XML Replace: {0}", new Object[]{xmlReplace});

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            InputSource input = new InputSource();
            input.setCharacterStream(new StringReader(xmlReplace));

            Document document = db.parse(input);
            NodeList node = document.getElementsByTagName(requestChildName);

            if (node.getLength() >= 1) {
                //childValue = Utils.getCharacterDataFromElement((Element) node.item(0));
                for (int i = 0; i < node.getLength(); i++) {

                    /*Element element0 = (Element) node.item(i);
                    NodeList line0 = element0.getElementsByTagName("IdSecretaria");
                    Element tag0 = (Element) line0.item(0);
                    IdSecretaria = Utils.getCharacterDataFromElement(tag0);

                    Element element1 = (Element) node.item(i);
                    NodeList line1 = element1.getElementsByTagName("IdEstablecimientoSDS");
                    Element tag1 = (Element) line1.item(0);
                    IdEstablecimientoSDS = Utils.getCharacterDataFromElement(tag1);*/

                    Element element2 = (Element) node.item(i);
                    NodeList line2 = element2.getElementsByTagName("RazonSocial");
                    Element tag2 = (Element) line2.item(0);
                    RazonSocial = Utils.getCharacterDataFromElement(tag2);
                    parameters.put("business_name", RazonSocial);

                    Element element3 = (Element) node.item(i);
                    NodeList line3 = element3.getElementsByTagName("NombreComercial");
                    Element tag3 = (Element) line3.item(0);
                    NombreComercial = Utils.getCharacterDataFromElement(tag3);
                    parameters.put("name_commercial", NombreComercial);
                    
                    Element element4 = (Element) node.item(i);
                    NodeList line4 = element4.getElementsByTagName("NITEstablecimiento");
                    Element tag4 = (Element) line4.item(0);
                    NITEstablecimiento = Utils.getCharacterDataFromElement(tag4);
                    parameters.put("number_identification_establishment", NITEstablecimiento);
                    
                    Element element5 = (Element) node.item(i);
                    NodeList line5 = element5.getElementsByTagName("Sede");
                    Element tag5 = (Element) line5.item(0);
                    Sede = Utils.getCharacterDataFromElement(tag5);
                    parameters.put("subsidiary", Sede);
                    
                    Element element6 = (Element) node.item(i);
                    NodeList line6 = element6.getElementsByTagName("Direccion");
                    Element tag6 = (Element) line6.item(0);
                    Direccion = Utils.getCharacterDataFromElement(tag6);
                    parameters.put("address_commercial", Direccion);
                    
                    Element element7 = (Element) node.item(i);
                    NodeList line7 = element7.getElementsByTagName("codLocalidad");
                    Element tag7 = (Element) line7.item(0);
                    codLocalidad = Utils.getCharacterDataFromElement(tag7);
                    parameters.put("locality_code", codLocalidad);
                    
                    Element element8 = (Element) node.item(i);
                    NodeList line8 = element8.getElementsByTagName("NombreLocalidad");
                    Element tag8 = (Element) line8.item(0);
                    NombreLocalidad = Utils.getCharacterDataFromElement(tag8);
                    parameters.put("locality_name", NombreLocalidad);
                    
                    Element element9 = (Element) node.item(i);
                    NodeList line9 = element9.getElementsByTagName("codUPZ");
                    Element tag9 = (Element) line9.item(0);
                    codUPZ = Utils.getCharacterDataFromElement(tag9);
                    parameters.put("upz_code", codUPZ);
                    
                    Element element10 = (Element) node.item(i);
                    NodeList line10 = element10.getElementsByTagName("NombreUPZ");
                    Element tag10 = (Element) line10.item(0);
                    NombreUPZ = Utils.getCharacterDataFromElement(tag10);
                    parameters.put("upz", NombreUPZ);
                    
                    Element element11 = (Element) node.item(i);
                    NodeList line11 = element11.getElementsByTagName("CodBarrio");
                    Element tag11 = (Element) line11.item(0);
                    CodBarrio = Utils.getCharacterDataFromElement(tag11);
                    parameters.put("neighborhood_code", CodBarrio);
                    
                    Element element12 = (Element) node.item(i);
                    NodeList line12 = element12.getElementsByTagName("NombreBarrio");
                    Element tag12 = (Element) line12.item(0);
                    NombreBarrio = Utils.getCharacterDataFromElement(tag12);
                    parameters.put("neighborhood", NombreBarrio);
                    
                    Element element13 = (Element) node.item(i);
                    NodeList line13 = element13.getElementsByTagName("Telefono1");
                    Element tag13 = (Element) line13.item(0);
                    Telefono1 = Utils.getCharacterDataFromElement(tag13);
                    parameters.put("phone", Telefono1);
                    
                    Element element14 = (Element) node.item(i);
                    NodeList line14 = element14.getElementsByTagName("Telefono2");
                    Element tag14 = (Element) line14.item(0);
                    Telefono2 = Utils.getCharacterDataFromElement(tag14);
                    parameters.put("phone_two", Telefono2);
                    
                    Element element15 = (Element) node.item(i);
                    NodeList line15 = element15.getElementsByTagName("CorreoElectronico");
                    Element tag15 = (Element) line15.item(0);
                    CorreoElectronico = Utils.getCharacterDataFromElement(tag15);
                    parameters.put("email", CorreoElectronico);
                    
                    Element element16 = (Element) node.item(i);
                    NodeList line16 = element16.getElementsByTagName("NombrePropietario");
                    Element tag16 = (Element) line16.item(0);
                    NombrePropietario = Utils.getCharacterDataFromElement(tag16);
                    parameters.put("name_owner", NombrePropietario);
                    
                    Element element17 = (Element) node.item(i);
                    NodeList line17 = element17.getElementsByTagName("TipoDocumentoPropietario");
                    Element tag17 = (Element) line17.item(0);
                    TipoDocumentoPropietario = Utils.getCharacterDataFromElement(tag17);
                    parameters.put("type_identification_owner", TipoDocumentoPropietario);
                    
                    Element element18 = (Element) node.item(i);
                    NodeList line18 = element18.getElementsByTagName("NumeroDocumentoPropietario");
                    Element tag18 = (Element) line18.item(0);
                    NumeroDocumentoPropietario = Utils.getCharacterDataFromElement(tag18);
                    parameters.put("number_identification_owner", NumeroDocumentoPropietario);
                    
                    Element element19 = (Element) node.item(i);
                    NodeList line19 = element19.getElementsByTagName("NombreRepLegal");
                    Element tag19 = (Element) line19.item(0);
                    NombreRepLegal = Utils.getCharacterDataFromElement(tag19);
                    parameters.put("name_legal_representative", NombreRepLegal);
                    
                    Element element20 = (Element) node.item(i);
                    NodeList line20 = element20.getElementsByTagName("TipoDocumentoRepLegal");
                    Element tag20 = (Element) line20.item(0);
                    TipoDocumentoRepLegal = Utils.getCharacterDataFromElement(tag20);
                    parameters.put("type_identification_legal_representative", TipoDocumentoRepLegal);
                    
                    Element element21 = (Element) node.item(i);
                    NodeList line21 = element21.getElementsByTagName("NumeroDocumentoRepLegal");
                    Element tag21 = (Element) line21.item(0);
                    NumeroDocumentoRepLegal = Utils.getCharacterDataFromElement(tag21);
                    parameters.put("number_identificacion_legal_representative", NumeroDocumentoRepLegal);
                    
                    Element element22 = (Element) node.item(i);
                    NodeList line22 = element22.getElementsByTagName("NumeroMatriculaEstablecimiento");
                    Element tag22 = (Element) line22.item(0);
                    NumeroMatriculaEstablecimiento = Utils.getCharacterDataFromElement(tag22);
                    parameters.put("commercial_registration", NumeroMatriculaEstablecimiento);
                    
                    Element element23 = (Element) node.item(i);
                    NodeList line23 = element23.getElementsByTagName("CodTipoEstablecimiento");
                    Element tag23 = (Element) line23.item(0);
                    CodTipoEstablecimiento = Utils.getCharacterDataFromElement(tag23);
                    parameters.put("type_establishment_code", CodTipoEstablecimiento);
                    
                    Element element24 = (Element) node.item(i);
                    NodeList line24 = element24.getElementsByTagName("NombreTipoEstablecimiento");
                    Element tag24 = (Element) line24.item(0);
                    NombreTipoEstablecimiento = Utils.getCharacterDataFromElement(tag24);
                    parameters.put("name_type_establishment", NombreTipoEstablecimiento);
                    
                    Element element25 = (Element) node.item(i);
                    NodeList line25 = element25.getElementsByTagName("CodCIIU");
                    Element tag25 = (Element) line25.item(0);
                    CodCIIU = Utils.getCharacterDataFromElement(tag25);
                    parameters.put("ciiu1", CodCIIU);
                    
                    Element element26 = (Element) node.item(i);
                    NodeList line26 = element26.getElementsByTagName("NombreActividadEconomica");
                    Element tag26 = (Element) line26.item(0);
                    NombreActividadEconomica = Utils.getCharacterDataFromElement(tag26);
                    parameters.put("name_economic_activity", NombreActividadEconomica);

                    //LOGGER.log(Level.INFO, "Id: {0}, Id: {0}", new Object[]{RazonSocial});
                    RestClient request = new RestClient();
                    request.requestRestServer(SERVER_REST, parameters);

                }
            }


            return node.toString();
        } catch (OMException ex) {
            LOGGER.log(Level.SEVERE, null, ex);
        }

        return "Null Value";
    }

}
