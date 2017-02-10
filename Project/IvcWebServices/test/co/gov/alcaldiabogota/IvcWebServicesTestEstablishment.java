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
        
        String xml = "<xsd:establishment xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://ivcWebServices.alcaldiabogota.gov.co/xsd\">\n"
                + "         <xsd:business_name>Prueba Test 001</xsd:business_name>\n"
                + "         <xsd:commercial_registration>900483571-0</xsd:commercial_registration>\n"
                + "         <xsd:number_identification_owner>79249757</xsd:number_identification_owner>\n"
                + "      </xsd:establishment>";

        OMElement requestElement = AXIOMUtil.stringToOM(xml);
        
        OMElement result = instance.establishment(requestElement);
        assertNotNull(result);
    }
}
