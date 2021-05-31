package PeterMartyr.Library.Models;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Claudio Pietromartire
 */
public class Search {

    /**
     *
     * @param students the List to do linear search on
     * @param studentID the item to search for
     * @return a Student object
     */
    public Student getStudentbyID(List<Student> students, int studentID) {

        for (Student student : students) {
            if (student.getStudentID() == studentID) {
                return student;
            }
        }

        return new Student();
    }

    /**
     *
     * @param courses the List to do linear search on
     * @param courseCode the item to search for
     * @return a Course object
     */
    public Course getCourseByCode(List<Course> courses, String courseCode) {

        courseCode = courseCode;//.toUpperCase();
        for (Course course : courses) {
            if (courseCode.equals(course.getCourseCode().toUpperCase())) {
                return course;
            }
        }
        return new Course();
    }

    /**
     *
     * @param courses the List to do linear search on
     * @param courseCode the item to search for
     * @return a Course object
     */
    public Course getCourseByCodeBinary(List<Course> courses, String courseCode) {

        Collections.sort(courses);

        courseCode = courseCode.toUpperCase();
        Course course;
        String code;
        int min = 0;
        int N = courses.size();
        int max = N - 1;
        do {
            int mid = (min + max) / 2;
            course = courses.get(mid);
            code = course.getCourseCode().toUpperCase();
            if (code.equals(courseCode)) {
                return course;
            } else if (code.compareTo(courseCode) < 0) {
                min = mid + 1;
            } else {
                max = mid - 1;
            }
            if (min > max) {
                break;
            }
        } while (min <= max);
        return new Course();
    }
}
