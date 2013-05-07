/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package adclassifier;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import adclassifier.*;

/**
 *
 * @author Karol
 */
public class AdTest {
    
    public AdTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Test
    public void testAdCountIncrementation() {
        assertEquals(0, Ad.adsCount);
        Ad a1 = new Ad();
        assertEquals(1, Ad.adsCount);
        assertNotNull(a1.getKeywords());
        assertNotNull(a1.getSimilarityVector());
        Ad a2 = new Ad();
        assertEquals(2, Ad.adsCount);
        assertNotNull(a2.getKeywords());
        assertNotNull(a2.getSimilarityVector());
        a2 = null;
        Ad a3 = new Ad();
        assertEquals(3, Ad.adsCount);
        assertNotNull(a3.getKeywords());
        assertNotNull(a3.getSimilarityVector());
    }

//    /**
//     * Test of getID method, of class Ad.
//     */
//    @Test
//    public void testGetID() {
//        System.out.println("getID");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setID method, of class Ad.
//     */
//    @Test
//    public void testSetID() {
//        System.out.println("setID");
//        int ID = 0;
//        Ad instance = new Ad();
//        instance.setID(ID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTitle method, of class Ad.
//     */
//    @Test
//    public void testGetTitle() {
//        System.out.println("getTitle");
//        Ad instance = new Ad();
//        String expResult = "";
//        String result = instance.getTitle();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setTitle method, of class Ad.
//     */
//    @Test
//    public void testSetTitle() {
//        System.out.println("setTitle");
//        String title = "";
//        Ad instance = new Ad();
//        instance.setTitle(title);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDescription method, of class Ad.
//     */
//    @Test
//    public void testGetDescription() {
//        System.out.println("getDescription");
//        Ad instance = new Ad();
//        String expResult = "";
//        String result = instance.getDescription();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDescription method, of class Ad.
//     */
//    @Test
//    public void testSetDescription() {
//        System.out.println("setDescription");
//        String description = "";
//        Ad instance = new Ad();
//        instance.setDescription(description);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCity method, of class Ad.
//     */
//    @Test
//    public void testGetCity() {
//        System.out.println("getCity");
//        Ad instance = new Ad();
//        String expResult = "";
//        String result = instance.getCity();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setCity method, of class Ad.
//     */
//    @Test
//    public void testSetCity() {
//        System.out.println("setCity");
//        String city = "";
//        Ad instance = new Ad();
//        instance.setCity(city);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getDistrict method, of class Ad.
//     */
//    @Test
//    public void testGetDistrict() {
//        System.out.println("getDistrict");
//        Ad instance = new Ad();
//        String expResult = "";
//        String result = instance.getDistrict();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setDistrict method, of class Ad.
//     */
//    @Test
//    public void testSetDistrict() {
//        System.out.println("setDistrict");
//        String district = "";
//        Ad instance = new Ad();
//        instance.setDistrict(district);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getStreet method, of class Ad.
//     */
//    @Test
//    public void testGetStreet() {
//        System.out.println("getStreet");
//        Ad instance = new Ad();
//        String expResult = "";
//        String result = instance.getStreet();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setStreet method, of class Ad.
//     */
//    @Test
//    public void testSetStreet() {
//        System.out.println("setStreet");
//        String street = "";
//        Ad instance = new Ad();
//        instance.setStreet(street);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPrice method, of class Ad.
//     */
//    @Test
//    public void testGetPrice() {
//        System.out.println("getPrice");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getPrice();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPrice method, of class Ad.
//     */
//    @Test
//    public void testSetPrice() {
//        System.out.println("setPrice");
//        int price = 0;
//        Ad instance = new Ad();
//        instance.setPrice(price);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getPricePerMeter method, of class Ad.
//     */
//    @Test
//    public void testGetPricePerMeter() {
//        System.out.println("getPricePerMeter");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getPricePerMeter();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setPricePerMeter method, of class Ad.
//     */
//    @Test
//    public void testSetPricePerMeter() {
//        System.out.println("setPricePerMeter");
//        int pricePerMeter = 0;
//        Ad instance = new Ad();
//        instance.setPricePerMeter(pricePerMeter);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBedroomsNo method, of class Ad.
//     */
//    @Test
//    public void testGetBedroomsNo() {
//        System.out.println("getBedroomsNo");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getBedroomsNo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBedroomsNo method, of class Ad.
//     */
//    @Test
//    public void testSetBedroomsNo() {
//        System.out.println("setBedroomsNo");
//        int bedroomsNo = 0;
//        Ad instance = new Ad();
//        instance.setBedroomsNo(bedroomsNo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getBathroomsNo method, of class Ad.
//     */
//    @Test
//    public void testGetBathroomsNo() {
//        System.out.println("getBathroomsNo");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getBathroomsNo();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setBathroomsNo method, of class Ad.
//     */
//    @Test
//    public void testSetBathroomsNo() {
//        System.out.println("setBathroomsNo");
//        int bathroomsNo = 0;
//        Ad instance = new Ad();
//        instance.setBathroomsNo(bathroomsNo);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFloor method, of class Ad.
//     */
//    @Test
//    public void testGetFloor() {
//        System.out.println("getFloor");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getFloor();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFloor method, of class Ad.
//     */
//    @Test
//    public void testSetFloor() {
//        System.out.println("setFloor");
//        int floor = 0;
//        Ad instance = new Ad();
//        instance.setFloor(floor);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getMeasurement method, of class Ad.
//     */
//    @Test
//    public void testGetMeasurement() {
//        System.out.println("getMeasurement");
//        Ad instance = new Ad();
//        double expResult = 0.0;
//        double result = instance.getMeasurement();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setMeasurement method, of class Ad.
//     */
//    @Test
//    public void testSetMeasurement() {
//        System.out.println("setMeasurement");
//        double measurement = 0.0;
//        Ad instance = new Ad();
//        instance.setMeasurement(measurement);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLastUpdate method, of class Ad.
//     */
//    @Test
//    public void testGetLastUpdate() {
//        System.out.println("getLastUpdate");
//        Ad instance = new Ad();
//        Date expResult = null;
//        Date result = instance.getLastUpdate();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLastUpdate method, of class Ad.
//     */
//    @Test
//    public void testSetLastUpdate() {
//        System.out.println("setLastUpdate");
//        Date lastUpdate = null;
//        Ad instance = new Ad();
//        instance.setLastUpdate(lastUpdate);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getConstructionYear method, of class Ad.
//     */
//    @Test
//    public void testGetConstructionYear() {
//        System.out.println("getConstructionYear");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getConstructionYear();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setConstructionYear method, of class Ad.
//     */
//    @Test
//    public void testSetConstructionYear() {
//        System.out.println("setConstructionYear");
//        int constructionYear = 0;
//        Ad instance = new Ad();
//        instance.setConstructionYear(constructionYear);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getFloorsInBuilding method, of class Ad.
//     */
//    @Test
//    public void testGetFloorsInBuilding() {
//        System.out.println("getFloorsInBuilding");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getFloorsInBuilding();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setFloorsInBuilding method, of class Ad.
//     */
//    @Test
//    public void testSetFloorsInBuilding() {
//        System.out.println("setFloorsInBuilding");
//        int floorsInBuilding = 0;
//        Ad instance = new Ad();
//        instance.setFloorsInBuilding(floorsInBuilding);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getLink method, of class Ad.
//     */
//    @Test
//    public void testGetLink() {
//        System.out.println("getLink");
//        Ad instance = new Ad();
//        String expResult = "";
//        String result = instance.getLink();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setLink method, of class Ad.
//     */
//    @Test
//    public void testSetLink() {
//        System.out.println("setLink");
//        String link = "";
//        Ad instance = new Ad();
//        instance.setLink(link);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getKeywords method, of class Ad.
//     */
//    @Test
//    public void testGetKeywords() {
//        System.out.println("getKeywords");
//        Ad instance = new Ad();
//        ArrayList expResult = null;
//        ArrayList result = instance.getKeywords();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setKeywords method, of class Ad.
//     */
//    @Test
//    public void testSetKeywords() {
//        System.out.println("setKeywords");
//        ArrayList<String> keywords = null;
//        Ad instance = new Ad();
//        instance.setKeywords(keywords);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getSimilarityVector method, of class Ad.
//     */
//    @Test
//    public void testGetSimilarityVector() {
//        System.out.println("getSimilarityVector");
//        Ad instance = new Ad();
//        HashMap expResult = null;
//        HashMap result = instance.getSimilarityVector();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setSimilarityVector method, of class Ad.
//     */
//    @Test
//    public void testSetSimilarityVector() {
//        System.out.println("setSimilarityVector");
//        HashMap<Integer, Integer> similarityVector = null;
//        Ad instance = new Ad();
//        instance.setSimilarityVector(similarityVector);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getParentID method, of class Ad.
//     */
//    @Test
//    public void testGetParentID() {
//        System.out.println("getParentID");
//        Ad instance = new Ad();
//        int expResult = 0;
//        int result = instance.getParentID();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of setParentID method, of class Ad.
//     */
//    @Test
//    public void testSetParentID() {
//        System.out.println("setParentID");
//        int parentID = 0;
//        Ad instance = new Ad();
//        instance.setParentID(parentID);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}