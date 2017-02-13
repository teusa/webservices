package co.gov.alcaldiabogota;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class IvcWebServicesTestEstablishment {

    public IvcWebServicesTestEstablishment() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

       
    /*
     * Test to establishment method, of class IvcWebServices.
     * @throws java.lang.Exception
     */
    @Test
    public void testEstablishment() throws Exception {
        System.out.println("establishment");
        IvcWebServices instance = new IvcWebServices();
        
        String xml = "<xsd:establishment xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://ivcWebServices.alcaldiabogota.gov.co/xsd\">\n" +
"         <xsd:upz>?</xsd:upz>\n" +
"         <xsd:lastname_owner>?</xsd:lastname_owner>\n" +
"         <xsd:lastname_legal_representative>?</xsd:lastname_legal_representative>\n" +
"         <xsd:ciiu1>?</xsd:ciiu1>\n" +
"         <xsd:ciiu2>?</xsd:ciiu2>\n" +
"         <xsd:ciiu3>?</xsd:ciiu3>\n" +
"         <xsd:address_commercial>?</xsd:address_commercial>\n" +
"         <xsd:address_standard>?</xsd:address_standard>\n" +
"         <xsd:address_notification>?</xsd:address_notification>\n" +
"         <xsd:stablishment_id>?</xsd:stablishment_id>\n" +
"         <xsd:date_end_commercial_registration>?</xsd:date_end_commercial_registration>\n" +
"         <xsd:date_commercial_registration>?</xsd:date_commercial_registration>\n" +
"         <xsd:formal>?</xsd:formal>\n" +
"         <xsd:digit_verification_establishment>?</xsd:digit_verification_establishment>\n" +
"         <xsd:digit_verification_owner>?</xsd:digit_verification_owner>\n" +
"         <xsd:digit_verification_legal_representative>?</xsd:digit_verification_legal_representative>\n" +
"         <xsd:locality>?</xsd:locality>\n" +
"         <xsd:email>?</xsd:email>\n" +
"         <xsd:commercial_registration>9004835710</xsd:commercial_registration>\n" +
"         <xsd:commercial_registration_owner>?</xsd:commercial_registration_owner>\n" +
"         <xsd:city>?</xsd:city>\n" +
"         <xsd:number_identification_establishment>?</xsd:number_identification_establishment>\n" +
"         <xsd:number_identification_owner>?</xsd:number_identification_owner>\n" +
"         <xsd:number_identificacion_legal_representative>?</xsd:number_identificacion_legal_representative>\n" +
"         <xsd:name_commercial>?</xsd:name_commercial>\n" +
"         <xsd:name_owner>?</xsd:name_owner>\n" +
"         <xsd:name_legal_representative>?</xsd:name_legal_representative>\n" +
"         <xsd:observation>?</xsd:observation>\n" +
"         <xsd:observation_history>?</xsd:observation_history>\n" +
"         <xsd:page_web>?</xsd:page_web>\n" +
"         <xsd:business_name>Test from SOAP 11 - 001</xsd:business_name>\n" +
"         <xsd:phone>?</xsd:phone>\n" +
"         <xsd:type_history>?</xsd:type_history>\n" +
"         <xsd:type_identification_establishment>?</xsd:type_identification_establishment>\n" +
"         <xsd:type_identification_owner>?</xsd:type_identification_owner>\n" +
"         <xsd:type_identification_legal_representative>?</xsd:type_identification_legal_representative>\n" +
"      </xsd:establishment>";
        
        OMElement requestElement = AXIOMUtil.stringToOM(xml);
        
        OMElement result = instance.establishment(requestElement);
        assertNotNull(result);
    }
}