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
public class Enrollment implements Comparable<Enrollment> {

    public static final String BLANK_STRING = "";
    public static final Course NULL_COURSE = null;

    private Date dateEnrolled;
    private String grade;
    private String semster;
    private List<Course> courses;

    public Enrollment(String semster, Date dateEnrolled) {
        super();
        this.dateEnrolled = dateEnrolled;
        this.grade = BLANK_STRING;
        this.semster = semster;
        this.courses = new ArrayList();
    }

    public Enrollment() {
        this(BLANK_STRING, new Date(System.currentTimeMillis()));
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public void addCourses(List<Course> courses) {
        for (Course course : courses) {
            this.courses.add(course);
        }
    }

    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getSemster() {
        return semster;
    }

    public void setSemster(String semster) {
        this.semster = semster;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 23 * hash + Objects.hashCode(this.grade);
        hash = 23 * hash + Objects.hashCode(this.semster);
        hash = 23 * hash + Objects.hashCode(this.courses);
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
        final Enrollment other = (Enrollment) obj;
        if (!Objects.equals(this.dateEnrolled, other.dateEnrolled)) {
            return false;
        }
        if (!Objects.equals(this.grade, other.grade)) {
            return false;
        }
        if (!Objects.equals(this.semster, other.semster)) {
            return false;
        }
        if (!Objects.equals(this.courses, other.courses)) {
            return false;
        }
        return true;
    }

    @Override
    public int compareTo(Enrollment other) {
        return this.dateEnrolled.compareTo(other.getDateEnrolled());
    }

    @Override
    public String toString() {
        return "Enrollment{" + "dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semster=" + semster + ", courses=" + courses + '}';
    }

}
