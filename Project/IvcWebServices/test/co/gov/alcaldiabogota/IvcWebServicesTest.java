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
     */
    @Test
    public void testSynchronize() throws Exception {
        System.out.println("synchronize");

        String xml = "<?xml version='1.0' encoding='UTF-8'?>"
                + "<soapenv:Envelope xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://ivcWebServices.alcaldiabogota.gov.co/\">\n"
                + "<soapenv:Header/>\n"
                + "<soapenv:Body>\n"
                + "<xsd:synchronize>\n"
                + "<xsd:entity_id>1</xsd:entity_id>\n"
                + "<xsd:table_name>Salud</xsd:table_name>\n"
                + "</xsd:synchronize>\n"
                + "</soapenv:Body>\n"
                + "</soapenv:Envelope>";
        OMElement requestElement = AXIOMUtil.stringToOM(xml);
        IvcWebServices instance = new IvcWebServices();
        String expResult = "Verify data => Entity: Null Value, Table: Null Value";
        OMElement result = instance.synchronize(requestElement);
        assertEquals(expResult, result);        
    }

}
