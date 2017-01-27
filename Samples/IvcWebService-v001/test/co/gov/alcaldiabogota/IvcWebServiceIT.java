package co.gov.alcaldiabogota;

import co.gov.alcaldiabogota.ivcwebservice.InIvcWebService;
import co.gov.alcaldiabogota.ivcwebservice.InIvcWebServiceResponse;
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
public class IvcWebServiceIT {
    
    public IvcWebServiceIT() {
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
     * Test of inIvcWebService method, of class IvcWebService.
     * @throws java.lang.Exception
     */
    @Test
    public void testInIvcWebService() throws Exception {
        System.out.println("inIvcWebService");
        InIvcWebService inIvcWebService0 = null;
        IvcWebService instance = new IvcWebService();
        InIvcWebServiceResponse expResult = null;
        InIvcWebServiceResponse result = instance.inIvcWebService(inIvcWebService0);
        assertEquals(expResult, result);
    }
    
}
