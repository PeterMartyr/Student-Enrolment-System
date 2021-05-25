/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author 001091501
 */
public class Student  extends Person implements Comparable<Student>  {

    public static final String BLANK_STRING = "";
    private static int numberOfStudents  = 0;

    private int studentID;
    private String program;
    private String dateRegistered;
    private List<Enrollment> enrollments;

    public Student(String program, String name, String email, String telNum) {
        super(name, email, telNum);
        this.studentID = ++numberOfStudents;
        this.program = program;
        this.dateRegistered  = new SimpleDateFormat("dd/MM/yyy").toString();
        enrollments = new ArrayList();
    }

    public Student() {
        this(BLANK_STRING,BLANK_STRING,BLANK_STRING,BLANK_STRING);
    }
    
    public void addEnrollment (String semster, Date dateEnrolled){
        enrollments.add(new Enrollment (semster, dateEnrolled));
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getDateRegistered() {
        return dateRegistered;
    }

    public List<Enrollment> getEnrollments() {
        return enrollments;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.studentID;
        hash = 83 * hash + Objects.hashCode(this.program);
        hash = 83 * hash + Objects.hashCode(this.dateRegistered);
        hash = 83 * hash + Objects.hashCode(this.enrollments);
        return hash;
    }

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

    @Override
    public String toString() {
        return "Student{" + "studentID=" + studentID + ", program=" + program + ", dateRegistered=" + dateRegistered + ", enrollments=" + enrollments + '}';
    }
    
    @Override
     public int compareTo(Student other )
    {
         return this.studentID - other.studentID;
    }

   
}
