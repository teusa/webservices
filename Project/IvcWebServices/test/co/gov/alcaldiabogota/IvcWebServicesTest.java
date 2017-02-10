/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
public class IvcWebServicesTest {

    public IvcWebServicesTest() {
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

    /**
     * Test of synchronize method, of class IvcWebServices.
     * @throws java.lang.Exception
     */
    @Test
    public void testSynchronize() throws Exception {
        System.out.println("synchronize");

        String entity_id = "2";
        String table_name = "establishment";
        String consult_date = "2015/09/28";

        String xml = "<xsd:synchronize xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://ivcWebServices.alcaldiabogota.gov.co/xsd\">\n"
                + "         <xsd:entity_id>" + entity_id + "</xsd:entity_id>\n"
                + "         <xsd:table_name>" + table_name + "</xsd:table_name>\n"
                + "         <xsd:consult_date>" + consult_date + "</xsd:consult_date>\n"
                + "      </xsd:synchronize>";

        OMElement requestElement = AXIOMUtil.stringToOM(xml);
        IvcWebServices instance = new IvcWebServices();
        //OMElement expResult = AXIOMUtil.stringToOM("<ns:synchronizeResponse xmlns:ns=\"http://ivcWebServices.alcaldiabogota.gov.co/xsd\"><ns:return>Synchronize in process: establishment. OK</ns:return></ns:synchronizeResponse>");
        OMElement result = instance.synchronize(requestElement);
        //assertEquals(expResult, result);
        assertNotNull(result);
    }

}
