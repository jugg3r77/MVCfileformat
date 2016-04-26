/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacementFormatter.Model;

import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author nevarezfamily
 */
public class PlacementFileTest {
    
    public PlacementFileTest() {
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
     * Test of getClient method, of class PlacementFile.
     */
    @Test
    public void testGetClient() {
        System.out.println("getClient");
        PlacementFile instance = new PlacementFile();
        String expResult = "";
        String result = instance.getClient();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    /**
     * Test of setClient method, of class PlacementFile.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        String client = "";
        PlacementFile instance = new PlacementFile();
        instance.setClient(client);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of hashCode method, of class PlacementFile.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PlacementFile instance = new PlacementFile();
        int expResult = 0;
        int result = instance.hashCode();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class PlacementFile.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        PlacementFile instance = new PlacementFile();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class PlacementFile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PlacementFile instance = new PlacementFile();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

  
    /**
     * Test of getFilepath method, of class PlacementFile.
     */
    @Test
    public void testGetFilepath() {
        System.out.println("getFilepath");
        PlacementFile instance = new PlacementFile();
        String expResult = "";
        String result = instance.getFilepath();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFilepath method, of class PlacementFile.
     */
    @Test
    public void testSetFilepath() {
        System.out.println("setFilepath");
        String filepath = "";
        PlacementFile instance = new PlacementFile();
        instance.setFilepath(filepath);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
