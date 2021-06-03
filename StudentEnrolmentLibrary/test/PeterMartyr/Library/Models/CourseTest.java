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
public class CourseTest {
    
    public CourseTest() {
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
     * Test of getCourseCode method, of class Course.
     */
    @Test
    public void testGetCourseCode() {
        System.out.println("getCourseCode");
        Course instance = new Course("5JAW", "Java Web", 600.0);
        String expResult = "5JAW";
        String result = instance.getCourseCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseCode method, of class Course.
     */
    @Test
    public void testSetCourseCode() {
        System.out.println("setCourseCode");
        String courseCode = "5JAW";
        Course instance = new Course();
        instance.setCourseCode(courseCode);
        String result = instance.getCourseCode();
        assertEquals(courseCode, result);
    }

    /**
     * Test of getCourseName method, of class Course.
     */
    @Test
    public void testGetCourseName() {
        System.out.println("getCourseName");
        Course instance = new Course("5JAW", "Java Web", 600.0);
        String expResult = "Java Web";
        String result = instance.getCourseName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setCourseName method, of class Course.
     */
    @Test
    public void testSetCourseName() {
        System.out.println("setCourseName");
        String courseName = "Java Web";
        Course instance = new Course();
        instance.setCourseName(courseName);
        String result = instance.getCourseName();
        assertEquals(courseName, result);
    }

    /**
     * Test of getCost method, of class Course.
     */
    @Test
    public void testGetCost() {
        System.out.println("getCost");
        Course instance = new Course("5JAW", "Java Web", 600.0);
        double expResult = 600.0;
        double result = instance.getCost();
        assertEquals(expResult, result, 600.0);
    }

    /**
     * Test of setCost method, of class Course.
     */
    @Test
    public void testSetCost() {
        System.out.println("setCost");
        double cost = 0.0;
        Course instance = new Course();
        instance.setCost(cost);
        double result = instance.getCost();
        assertEquals(cost, result, 600.0);
    }

    /**
     * Test of hashCode method, of class Course.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Course instance = new Course("5JAW", "Java Web", 600.0);
        int expResult = new Course("5JAW", "Java Web", 600.0).hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Course.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Course("5JAW", "Java Web", 600.0);
        Course instance = new Course("5JAW", "Java Web", 200.0);
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Course.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Course other = new Course("5JAW", "Java Web", 600.0);
        Course instance = new Course("5JAW", "Java Web", 600.0);
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
    }

    /**
     * Test of toString method, of class Course.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Course instance = new Course("5JAW", "Java Web", 600.0);
        String expResult = "Course{" + "courseCode=5JAW, courseName=Java Web, cost=600.0}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
