/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota.connection;

import java.util.HashMap;
import java.util.Map;
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
public class RestClientIT {
    
    public RestClientIT() {
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
     * Test of requestRestServer method, of class RestClient.
     */
    @Test
    public void testRequestRestServer() {
        System.out.println("requestRestServer");
        String serverRest = "http://192.168.88.244/apirest_ivc/backend/web/api/establishment";
        Map<String,String> parameters = new HashMap<>();
        parameters.put("business_name", "Test");
        RestClient instance = new RestClient();
        String expResult = "OK";
        String result = instance.requestRestServer(serverRest, parameters);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
