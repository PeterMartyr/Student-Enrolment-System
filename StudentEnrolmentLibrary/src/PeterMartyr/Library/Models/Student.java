/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author PeterMartyr
 */
public class Student extends Person implements Comparable<Student> {

    /**
     * a empty string to use in the no args constructor to save memory
     */
    public static final String DEFAULT_TEXT = "";
    private static int numberOfStudents = 0;

    private int studentID;
    private String program;
    private Date dateRegistered;
    private List<Enrollment> enrollments;

    /**
     * The all argument constructor
     *
     * @param program The Primary Qualification FYI diploma
     * @param dateRegistered The date the student first started at the institution
     * @param name Both First and Last Name
     * @param email An Email Address
     * @param telNum Primary Phone Contact Number
     */
    public Student(String program, Date dateRegistered,
            String name, String email, String telNum) {
        super(name, email, telNum);
        this.studentID = ++numberOfStudents;
        this.program = program;
        this.dateRegistered = dateRegistered;
        enrollments = new LinkedList();
    }

    /**
     * The no argument constructor
     */
    public Student() {
        this(DEFAULT_TEXT, new Date(System.currentTimeMillis()), DEFAULT_TEXT, DEFAULT_TEXT, DEFAULT_TEXT);
    }

    /**
     * Add an enrollment for the Semester
     *
     * @param semster which half of year the enrollment covers
     * @param dateEnrolled The commencement date at the beginning of
     * qualification
     */
    public void addEnrollment(String semster, Date dateEnrolled) {
        enrollments.add(new Enrollment(semster, dateEnrolled));
    }

    /**
     *
     * @return a numerical identification number
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * the ID is auto increment use with care
     *
     * @param studentID a numerical identification number
     */
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    /**
     *
     * @return the Primary Qualification FYI diploma
     */
    public String getProgram() {
        return program;
    }

    /**
     *
     * @param program set the Primary Qualification FYI diploma
     */
    public void setProgram(String program) {
        this.program = program;
    }

    /**
     *
     * @return the date the student first started at the institution
     */
    public Date getDateRegistered() {
        return dateRegistered;
    }

    /**
     *
     * @param dateRegistered the date the student first started at the
     * institution
     */
    public void setDateRegistered(Date dateRegistered) {
        this.dateRegistered = dateRegistered;
    }

    /**
     *
     * @return a list of Enrollments
     */
    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    /**
     *
     * @param enrollments sets a list of Enrollments FYI priors
     */
    public void setEnrollments(List<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    /**
     *
     * @return a hash code value for the object. This method is supported for
     * the benefit of hash tables such as those provided by HashMap.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.studentID;
        hash = 83 * hash + Objects.hashCode(this.program);
        hash = 83 * hash + Objects.hashCode(this.dateRegistered);
        hash = 83 * hash + Objects.hashCode(this.enrollments);
        return hash;
    }

    /**
     *
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false
     * otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (this.studentID != other.studentID) {
            return false;
        }
        return true;
    }

    /**
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", program=" + program
                + ", dateRegistered=" + dateRegistered + ", enrollments="
                + enrollments + '}';
    }

    /**
     *
     * @param other the object to compare
     * @return If the object is equal to the argument then 0 is returned. If the
     * object is less than the argument then -1 is returned. If the object is
     * greater than the argument then 1 is returned.
     */
    @Override
    public int compareTo(Student other) {
        return this.studentID - other.studentID;
    }

}
