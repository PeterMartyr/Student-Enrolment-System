/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.Objects;

/**
 *
 * @author PeterMartyr
 */
public class Course implements Comparable<Course> {

    /**
     *
     */
    public static final String BLANK_STRING = "";

    /**
     *
     */
    public static final double ZERO_DOUBLE = 0.0;

    private String courseCode;
    private String courseName;
    private double cost;

    /**
     * the all argument constructor
     *
     * @param courseCode alphabetic code for the course
     * @param courseName alphabetic name for the course
     * @param cost the monetary value of taking the course
     */
    public Course(String courseCode, String courseName, double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }

    /**
     * The no argument constructor
     */
    public Course() {
        this(BLANK_STRING, BLANK_STRING, ZERO_DOUBLE);
    }

    /**
     *
     * @return a alphabetic code for course usually an abbv. of the name
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     *
     * @param courseCode a alphabetic code for course usually an abbv. of the
     * name
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    /**
     *
     * @return The name of the course
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     *
     * @param courseName The name of the course
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    /**
     *
     * @return the cost of the Course ex: 599.99
     */
    public double getCost() {
        return cost;
    }

    /**
     *
     * @param cost the cost of the Course ex: 599.99
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     *
     * @return a hash code value for the object. This method is supported for
     * the benefit of hash tables such as those provided by HashMap.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.courseCode);
        hash = 67 * hash + Objects.hashCode(this.courseName);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
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
        final Course other = (Course) obj;
        if (Double.doubleToLongBits(this.cost) != Double.doubleToLongBits(other.cost)) {
            return false;
        }
        if (!Objects.equals(this.courseCode, other.courseCode)) {
            return false;
        }
        if (!Objects.equals(this.courseName, other.courseName)) {
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
    public int compareTo(Course other) {
        return this.courseCode.toUpperCase().compareTo(other.courseCode.toUpperCase());
    }

    /**
     *
     * @return a string representation of the object.
     */
    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
    }

}
