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
import static org.junit.Assert.assertNotNull;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author jesusrodriguezmiranda
 */
public class IvcWebServicesTestUpdate {

    public IvcWebServicesTestUpdate() {
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
     *
     * @throws java.lang.Exception
     */
    @Test
    public void testUpdate() throws Exception {
        System.out.println("update");

        String batch = "1";
        
        String xml = "<xsd:update xmlns:soapenv=\"http://schemas.xmlsoap.org/soap/envelope/\" xmlns:xsd=\"http://ivcWebServices.alcaldiabogota.gov.co/xsd\">\n"                
                + "<xsd:batch>" + batch + "</xsd:batch>\n"
                + "</xsd:update>";

        OMElement requestElement = AXIOMUtil.stringToOM(xml);
        IvcWebServices instance = new IvcWebServices();
        OMElement result = instance.update(requestElement);
        //assertEquals(expResult, result);
        assertNotNull(result);
    }

}
