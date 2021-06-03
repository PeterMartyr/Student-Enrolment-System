/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pmart
 */
public class AddressTest {

    public AddressTest() {
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
     * Test of getNumber method, of class Address.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        String expResult = "56";
        String result = instance.getNumber();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNumber method, of class Address.
     */
    @Test
    public void testSetNumber() {
        System.out.println("setNumber");
        String number = "42";
        Address instance = new Address();
        instance.setNumber(number);
        assertEquals(number, instance.getNumber());
    }

    /**
     * Test of getStreet method, of class Address.
     */
    @Test
    public void testGetStreet() {
        System.out.println("getStreet");
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        String expResult = "Darebin Blvd";
        String result = instance.getStreet();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStreet method, of class Address.
     */
    @Test
    public void testSetStreet() {
        System.out.println("setStreet");
        String street = "Darebin Blvd";
        Address instance = new Address();
        instance.setStreet(street);
        String result = instance.getStreet();
        assertEquals(street, result);
    }

    /**
     * Test of getSuburb method, of class Address.
     */
    @Test
    public void testGetSuburb() {
        System.out.println("getSuburb");
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        String expResult = "Resrvoir";
        String result = instance.getSuburb();
        assertEquals(expResult, result);
    }

    /**
     * Test of setSuburb method, of class Address.
     */
    @Test
    public void testSetSuburb() {
        System.out.println("setSuburb");
        String suburb = "Noarlunga Downs";
        Address instance = new Address();
        instance.setSuburb(suburb);
        assertEquals(suburb, instance.getSuburb());
    }

    /**
     * Test of getPostcode method, of class Address.
     */
    @Test
    public void testGetPostcode() {
        System.out.println("getPostcode");
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        String expResult = "5073";
        String result = instance.getPostcode();
        assertEquals(expResult, result);

    }

    /**
     * Test of setPostcode method, of class Address.
     */
    @Test
    public void testSetPostcode() {
        System.out.println("setPostcode");
        String postcode = "5000";
        Address instance = new Address();
        instance.setPostcode(postcode);
        String result = instance.getPostcode();
        assertEquals(postcode, result);
    }

    /**
     * Test of getState method, of class Address.
     */
    @Test
    public void testGetState() {
        System.out.println("getState");
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        String expResult = "NSW";
        String result = instance.getState();
        assertEquals(expResult, result);

    }

    /**
     * Test of setState method, of class Address.
     */
    @Test
    public void testSetState() {
        System.out.println("setState");
        String state = "NSW";
        Address instance = new Address();
        instance.setState(state);
        String result = instance.getState();
        assertEquals(state, result);

    }

    /**
     * Test of hashCode method, of class Address.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Address instance = new Address();
        int expResult = new Address().hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Address.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Address.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Address instance = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        String expResult = "Address{number=56, street=Darebin Blvd, suburb=Resrvoir, postcode=5073, state=NSW}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
