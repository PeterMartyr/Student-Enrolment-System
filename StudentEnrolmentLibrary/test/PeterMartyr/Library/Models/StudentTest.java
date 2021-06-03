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
public class StudentTest {

    public StudentTest() {
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
     * Test of addEnrollment method, of class Student.
     */
    @Test
    public void testAddEnrollment() {
        System.out.println("addEnrollment");
        String semster = "First Semester";
        Date dateEnrolled = convertStringtoDate("25-02-2525");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        instance.addEnrollment(semster, dateEnrolled);
        List<Enrollment> result = instance.getEnrollments();
        assertEquals(new Enrollment("First Semester", convertStringtoDate("25-02-2525")), result.get(0));
    }

    /**
     * Test of getStudentID method, of class Student.
     */
    @Test
    public void testGetStudentID() {
        System.out.println("getStudentID");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        int expResult = 2;
        int result = instance.getStudentID();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStudentID method, of class Student.
     */
    @Test
    public void testSetStudentID() {
        System.out.println("setStudentID");
        int studentID = 1;
        Student instance = new Student();
        instance.setStudentID(studentID);
        int result = instance.getStudentID();
        assertEquals(studentID, result);
    }

    /**
     * Test of getProgram method, of class Student.
     */
    @Test
    public void testGetProgram() {
        System.out.println("getProgram");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        String expResult = "Software Delevepment";
        String result = instance.getProgram();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProgram method, of class Student.
     */
    @Test
    public void testSetProgram() {
        System.out.println("setProgram");
        String program = "Software Delevepment";
        Student instance = new Student();
        instance.setProgram(program);
        String result = instance.getProgram();
        assertEquals(program, result);
    }

    /**
     * Test of getDateRegistered method, of class Student.
     */
    @Test
    public void testGetDateRegistered() {
        System.out.println("getDateRegistered");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        Date expResult = convertStringtoDate("25-02-2012");
        Date result = instance.getDateRegistered();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDateRegistered method, of class Student.
     */
    @Test
    public void testSetDateRegistered() {
        System.out.println("setDateRegistered");
        Date dateRegistered = convertStringtoDate("25-02-2012");;
        Student instance = new Student();
        instance.setDateRegistered(dateRegistered);
        Date result = instance.getDateRegistered();
        assertEquals(dateRegistered, result);
    }

    /**
     * Test of getEnrollments method, of class Student.
     */
    @Test
    public void testGetEnrollments() {
        System.out.println("getEnrollments");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        List<Enrollment> expResult = new LinkedList();
        List<Enrollment> result = instance.getEnrollments();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEnrollments method, of class Student.
     */
    @Test
    public void testSetEnrollments() {
        System.out.println("setEnrollments");
        List<Enrollment> enrollments = new LinkedList();
        Student instance = new Student();
        instance.setEnrollments(enrollments);
    }

    /**
     * Test of hashCode method, of class Student.
     */
    @Test
    public void testHashCode() {
        System.out.println("hashCode");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        int expResult = 870460214;
        int result = instance.hashCode();
        assertEquals(expResult, result);
    }

    /**
     * Test of equals method, of class Student.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object obj = new Student();
        Student instance = new Student();
        boolean expResult = false;
        boolean result = instance.equals(obj);
        assertEquals(expResult, result);

    }

    /**
     * Test of toString method, of class Student.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Student instance = new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478");
        String expResult = "Student{studentID=1, program=Software Delevepment, dateRegistered=Sat Feb 25 00:00:00 ACDT 2012, enrollments=[]}";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of compareTo method, of class Student.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Student other = new Student();
        Student instance = new Student();
        int expResult = 1;
        int result = instance.compareTo(other);
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
