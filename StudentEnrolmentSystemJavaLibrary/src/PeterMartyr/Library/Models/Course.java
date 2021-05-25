/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.Objects;

/**
 *
 * @author 001091501
 */
public class Course {

    public static final String BLANK_STRING = "";
    public static final double ZERO_DOUBLE = 0.0;

    private String courseCode;
    private String courseName;
    private double cost;

    public Course(String courseCode, String courseName, double cost) {
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.cost = cost;
    }
    

    public Course() {
        this(BLANK_STRING,BLANK_STRING,ZERO_DOUBLE);
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.courseCode);
        hash = 67 * hash + Objects.hashCode(this.courseName);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.cost) ^ (Double.doubleToLongBits(this.cost) >>> 32));
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

    @Override
    public String toString() {
        return "Course{" + "courseCode=" + courseCode + ", courseName=" + courseName + ", cost=" + cost + '}';
    }
    
    
    

}
