/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class EnrollmentTest {
    
    public EnrollmentTest() {
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
     * Test of addCourse method, of class Enrollment.
     */
    @Test
    public void testAddCourse() {
        System.out.println("addCourse");
        Course course = new Course("5CEP", "Copyright and Ethics", 300.00);
        Enrollment instance = new Enrollment();
        instance.addCourse(course);
        assertEquals(instance.getCourses().get(0), new Course("5CEP", "Copyright and Ethics", 300.00));
    }

    /**
     * Test of getDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testGetDateEnrolled() {
        System.out.println("getDateEnrolled");
        Enrollment instance = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        Date expResult = convertStringtoDate("01-02-2019");
        Date result = instance.getDateEnrolled();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateEnrolled method, of class Enrollment.
     */
    @Test
    public void testSetDateEnrolled() {
        System.out.println("setDateEnrolled");
        Date dateEnrolled = convertStringtoDate("01-02-2019");
        Enrollment instance = new Enrollment();
        instance.setDateEnrolled(dateEnrolled);
        Date result = instance.getDateEnrolled();
        assertEquals(dateEnrolled, result);
    }

    /**
     * Test of getGrade method, of class Enrollment.
     */
    @Test
    public void testGetGrade() {
        System.out.println("getGrade");
        Enrollment instance = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        instance.setGrade("PASS");
        String expResult = "PASS";
        String result = instance.getGrade();
        assertEquals(expResult, result);
    }

    /**
     * Test of setGrade method, of class Enrollment.
     */
    @Test
    public void testSetGrade() {
        System.out.println("setGrade");
        String grade = "PASS";
        Enrollment instance = new Enrollment();
        instance.setGrade(grade);
        String result = instance.getGrade();
        assertEquals(grade, result);

    }

    /**
     * Test of getSemster method, of class Enrollment.
     */
    @Test
    public void testGetSemster() {
        System.out.println("getSemster");
        Enrollment instance = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        String expResult = "Semester 1";
        String result = instance.getSemster();
        assertEquals(expResult, result);

    }

    /**
     * Test of setSemster method, of class Enrollment.
     */
    @Test
    public void testSetSemster() {
        System.out.println("setSemster");
        String semster = "AAAAAAA";
        Enrollment instance = new Enrollment();
        instance.setSemster(semster);
        String result = instance.getSemster();
        assertEquals(semster, result);
    }

    /**
     * Test of getCourses method, of class Enrollment.
     */
    @Test
    public void testGetCourses() {
        System.out.println("getCourses");
        Enrollment instance = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        List<Course> expResult = new LinkedList();
        List<Course> result = instance.getCourses();
        assertEquals(expResult, result);;
    }


    /**
     * Test of hashCode method, of class Enrollment.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Enrollment instance = new Enrollment();
        int expResult = new Enrollment().hashCode();
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Enrollment.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        Enrollment instance = new Enrollment();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Enrollment.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Enrollment other = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        Enrollment instance = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        int expResult = 0;
        int result = instance.compareTo(other);
        assertEquals(expResult, result);
   ;
    }

    /**
     * Test of toString method, of class Enrollment.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Enrollment instance = new Enrollment("Semester 1", convertStringtoDate("01-02-2019"));
        String expResult = "Enrollment{dateEnrolled=Fri Feb 01 00:00:00 ACDT 2019, grade=, semster=Semester 1, courses=[]}";
        String result = instance.toString();
        assertEquals(expResult, result);

    }
    
    
    private static Date convertStringtoDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(ddMMyyyy);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }
    
}
