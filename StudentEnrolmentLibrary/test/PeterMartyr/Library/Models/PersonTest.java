/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.LinkedList;
import java.util.List;
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
public class PersonTest {

    public PersonTest() {
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
     * Test of addAdress method, of class Person.
     *
     * new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
     */
    @Test
    public void testAddAdress() {
        System.out.println("addAdress");
        String number = "56";
        String street = "Darebin Blvd";
        String suburb = "Resrvoir";
        String postcode = "5073";
        String state = "NSW";
        Person instance = new Person();
        instance.addAdress(number, street, suburb, postcode, state);
        Address result = new Address("56", "Darebin Blvd", "Resrvoir", "5073", "NSW");
        assertEquals(instance.getAddresses().get(0), result);

    }

    /**
     * Test of getName method, of class Person.
     *
     * Person(String name, String email, String telNum)
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Person instance = new Person("John Jones", "ManHunter@JusticeLeague.org", "1234 9854");
        String expResult = "John Jones";
        String result = instance.getName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setName method, of class Person.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "John Jones";
        Person instance = new Person();
        instance.setName(name);
        String result = instance.getName();
        assertEquals(name, result);
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new Person("John Jones", "ManHunter@JusticeLeague.org", "1234 9854");
        String expResult = "ManHunter@JusticeLeague.org";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "ManHunter@JusticeLeague.org";
        Person instance = new Person();
        instance.setEmail(email);
        String result = instance.getEmail();
        assertEquals(email, result);
    }

    /**
     * Test of getTelNum method, of class Person.
     */
    @Test
    public void testGetTelNum() {
        System.out.println("getTelNum");
        Person instance = new Person("John Jones", "ManHunter@JusticeLeague.org", "1234 9854");
        String expResult = "1234 9854";
        String result = instance.getTelNum();
        assertEquals(expResult, result);

    }

    /**
     * Test of setTelNum method, of class Person.
     */
    @Test
    public void testSetTelNum() {
        System.out.println("setTelNum");
        String telNum = "1234 9854";
        Person instance = new Person();
        instance.setTelNum(telNum);
        String result = instance.getTelNum();
        assertEquals(telNum, result);
    }

    /**
     * Test of getAddresses method, of class Person.
     */
    @Test
    public void testGetAddresses() {
        System.out.println("getAddresses");
        Person instance = new Person("John Jones", "ManHunter@JusticeLeague.org", "1234 9854");
        List<Address> expResult = new LinkedList();
        List<Address> result = instance.getAddresses();
        assertEquals(expResult, result);
    }

    /**
     * Test of hashCode method, of class Person.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Person instance = new Person();
        int expResult = new Person().hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Person.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = null;
        Person instance = new Person();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Person.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Person instance = new Person();
        String expResult = "Person{name=, email=, telNum=, addresses=[]}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

}
