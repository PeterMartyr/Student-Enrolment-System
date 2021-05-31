/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.List;

/**
 *
 * @author PeterMartyr
 */
public class Sort {
    
    
    public void sortStudentByID(List<Student> students) {
        
        Student temp;
        for (int j = 0; j <= students.size() - 2; j++) {
            for (int i = 0; i <= students.size() - 2; i++) {
                if (students.get(i).getStudentID() > students.get(i + 1).getStudentID()) {
                    temp = students.get(i + 1);
                    students.set(i + 1, students.get(i));
                    students.set(i, temp);
                }
            }
        }
    }
    
    /**
     * does not duplicate the List to save memory but sorts the 
     * actual List by Student ID  Ascending.
     * 
     * @param students the list to sort
     */

    public void sortStudentByName(List<Student> students) {
        Student temp;
        for (int j = 0; j <= students.size() - 2; j++) {
            for (int i = 0; i <= students.size() - 2; i++) {
                if (students.get(i).getName().compareTo(students.get(i + 1).getName()) > 0) {
                    temp = students.get(i + 1);
                    students.set(i + 1, students.get(i));
                    students.set(i, temp);
                }
            }
        }
    }
    
    /**
     * does not duplicate the List to save memory but sorts the 
     * actual List by the Course Code Ascending.
     * 
     * @param courses the list to sort
     */

    public void sortCoursesByName(List<Course> courses) {
        Course temp;
        for (int j = 0; j <= courses.size() - 2; j++) {
            for (int i = 0; i <= courses.size() - 2; i++) {
                if (courses.get(i).getCourseName().compareTo(courses.get(i + 1).getCourseName()) > 0) {
                    temp = courses.get(i + 1);
                    courses.set(i + 1, courses.get(i));
                    courses.set(i, temp);
                }
            }
        }
    }
    /**
     * does not duplicate the List to save memory but sorts the 
     * actual List by Date Ascending.
     * 
     * @param enrollments the list to sort
     */
    public void sortEnrollmentsByDate(List<Enrollment> enrollments) {
        Enrollment temp;
        for (int j = 0; j <= enrollments.size() - 2; j++) {
            for (int i = 0; i <= enrollments.size() - 2; i++) {
                if (enrollments.get(i).getDateEnrolled().compareTo(enrollments.get(i + 1).getDateEnrolled()) > 0) {
                    temp = enrollments.get(i + 1);
                    enrollments.set(i + 1, enrollments.get(i));
                    enrollments.set(i, temp);
                }
            }
        }
    }
}
