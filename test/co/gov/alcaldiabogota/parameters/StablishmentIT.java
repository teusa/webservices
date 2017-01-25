package co.gov.alcaldiabogota.parameters;

import co.gov.alcaldiabogota.ivcwebservice.InIvcWebService;
import java.util.Map;
import java.util.Optional;
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
public class StablishmentIT {
    
    public StablishmentIT() {
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
     * Test of Stablishment method, of class Stablishment.
     */
    @Test
    public void testStablishment() {
        System.out.println("Stablishment");
        Optional<InIvcWebService> inIvcWebService = Optional.ofNullable(null);
        Stablishment instance = new Stablishment();
        Map expResult = null;
        Map result = instance.Stablishment(inIvcWebService);
        assertEquals(result, expResult);       
    }

    /**
     * Test of setStablishmentParameters method, of class Stablishment.
     */
    @Test
    public void testSetStablishmentParameters() {
        System.out.println("setStablishmentParameters");
        //InIvcWebService inIvcWebService0 = null;
        Optional<InIvcWebService> inIvcWebService = Optional.ofNullable(null);
        Stablishment instance = new Stablishment();
        Map expResult = null;
        Map result = instance.setStablishmentParameters(inIvcWebService);
        assertEquals(expResult, result);
    }
    
}
