/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlacementFormatter.Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
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
        String testPath = "/Users/nevarezfamily/Documents/placement_125_20160326_TEST.xlsx";
        String testClient = "Crown";
        PlacementFile instance = new PlacementFile(testPath,testClient);
        String expResult = "Crown";
        String result = instance.getClient();
        assertEquals(expResult, result);
 
    }


    /**
     * Test of setClient method, of class PlacementFile.
     */
    @Test
    public void testSetClient() {
        System.out.println("setClient");
        String client = "Cavalry";
        PlacementFile instance = new PlacementFile();
        instance.setClient(client);
        assertEquals(instance.getClient(),client);
  
    }

    /**
     * Test of hashCode method, of class PlacementFile.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        PlacementFile instance2 = new PlacementFile("/test/pathway","Crown");
        PlacementFile instance1 = new PlacementFile("/test/pathway","Crown");
        Assert.assertTrue(instance1.equals(instance2) && instance2.equals(instance1));
        Assert.assertTrue(instance1.hashCode()== instance2.hashCode());
    }

    /**
     * Test of equals method, of class PlacementFile.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new PlacementFile("/test/pathway","Crown");
        PlacementFile instance = new PlacementFile();
        instance.setClient("Crown");
        instance.setFilepath("/test/pathway");       
        boolean expResult = true;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class PlacementFile.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        PlacementFile instance1 = new PlacementFile("/test/pathway","Crown");
        String expResult = instance1.toString();
        PlacementFile instance2 = new PlacementFile();
        instance2.setClient("Crown");
        instance2.setFilepath("/test/pathway");
        String result = instance2.toString();
        assertEquals(expResult, result);
    }

  
    /**
     * Test of getFilepath method, of class PlacementFile.
     */
    @Test
    public void testGetFilepath() {
        System.out.println("getFilepath");
        String testPath = "/Users/nevarezfamily/Documents/placement_125_20160326_TEST.xlsx";
        String testClient = "Crown";
        PlacementFile instance = new PlacementFile(testPath,testClient);
        String expResult = "/Users/nevarezfamily/Documents/placement_125_20160326_TEST.xlsx";
        String result = instance.getFilepath();
        assertEquals(expResult, result);
    }

    /**
     * Test of setFilepath method, of class PlacementFile.
     */
    @Test
    public void testSetFilepath() {
        System.out.println("setFilepath");
        String filepath = "/tes/nevarezfamily/test.xlsx";
        PlacementFile instance = new PlacementFile();
        instance.setFilepath(filepath);
        instance.setClient("Crown");
        assertEquals(instance.getFilepath(),filepath);
    }
    
}
