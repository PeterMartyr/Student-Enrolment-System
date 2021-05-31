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
public class Enrollment implements Comparable<Enrollment> {

    public static final String BLANK_STRING = "";
    public static final Course NULL_COURSE = null;

    private Date dateEnrolled;
    private String grade;
    private String semster;
    private List<Course> courses;

    /**
     * the all argument constructor
     *
     * @param semster which half of year the enrollment covers
     * @param dateEnrolled The commencement date at the beginning of
     * qualification
     */
    public Enrollment(String semster, Date dateEnrolled) {
        super();
        this.dateEnrolled = dateEnrolled;
        this.grade = BLANK_STRING;
        this.semster = semster;
        this.courses = new LinkedList();
    }

    /**
     * The no argument constructor
     */
    public Enrollment() {
        this(BLANK_STRING, new Date(System.currentTimeMillis()));
    }

    /**
     *
     * @param course The single course to add to this Semester enrollments
     */
    public void addCourse(Course course) {
        courses.add(course);
    }

    /**
     *
     * @return The the date enrolled for the qualification
     */
    public Date getDateEnrolled() {
        return dateEnrolled;
    }

    /**
     *
     * @param dateEnrolled The the date enrolled for the qualification
     */
    public void setDateEnrolled(Date dateEnrolled) {
        this.dateEnrolled = dateEnrolled;
    }

    /**
     *
     * @return Whether the Student passed for the Semester??
     */
    public String getGrade() {
        return grade;
    }

    /**
     *
     * @param grade Sets Whether the Student passed for the Semester??
     */
    public void setGrade(String grade) {
        this.grade = grade;
    }

    /**
     *
     * @return First or Second Semester
     */
    public String getSemster() {
        return semster;
    }

    /**
     *
     * @param semster takes only First or Second Semester
     */
    public void setSemster(String semster) {
        this.semster = semster;
    }

    /**
     *
     * @return a List of Courses for this Semester enrollments
     */
    public List<Course> getCourses() {
        return courses;
    }

    /**
     *
     * @param courses Adds a List of Courses for this Semester enrollments
     */
    public void addCourses(List<Course> courses) {
        for (Course course : courses) {
            this.courses.add(course);
        }
    }

    /**
     *
     * @return a hash code value for the object. This method is supported for
     * the benefit of hash tables such as those provided by HashMap.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.dateEnrolled);
        hash = 23 * hash + Objects.hashCode(this.grade);
        hash = 23 * hash + Objects.hashCode(this.semster);
        hash = 23 * hash + Objects.hashCode(this.courses);
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

    /**
     *
     * @param other the object to compare
     * @return If the object is equal to the argument then 0 is returned. If the
     * object is less than the argument then -1 is returned. If the object is
     * greater than the argument then 1 is returned.
     */
    @Override
    public int compareTo(Enrollment other) {
        return this.dateEnrolled.compareTo(other.getDateEnrolled());
    }

    /**
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Enrollment{" + "dateEnrolled=" + dateEnrolled + ", grade=" + grade + ", semster=" + semster + ", courses=" + courses + '}';
    }

}
