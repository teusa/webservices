/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.gov.alcaldiabogota.utils;

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
public class UtilsTest {
    
    public UtilsTest() {
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
     * Test of isNumeric method, of class Utils.
     */
    @Test
    public void testIsNumeric() {
        System.out.println("isNumeric");
        String str = "1";
        boolean expResult = true;
        boolean result = Utils.isNumeric(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of isTableName method, of class Utils.
     */
    @Test
    public void testIsTableName() {
        System.out.println("isTableName");
        String entityId = "2";
        String tableName = "stablishment";
        boolean expResult = true;
        boolean result = Utils.isTableName(entityId, tableName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
