/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_App;

import PeterMartyr.Library.Models.Course;
import PeterMartyr.Library.Models.Enrollment;
import PeterMartyr.Library.Models.Sort;
import PeterMartyr.Library.Models.Student;
import Test_Stub.TestStub;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 001091501
 */
public class TestC_Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestStub testStub = new TestStub();

        List<Student> students = testStub.getStudents();

        List<Course> courses = testStub.getCourses();

        List<Enrollment> enrollments = testStub.getEnrollments(0);

        Sort sort = new Sort();

        System.out.println("===================================================");
        System.out.println("Students Unordered List");
        System.out.println("===================================================");
        printStudent(students);
        System.out.println("\nSorted by Name ascending ===========================\n");
        sort.sortStudentByName(students);
        printStudent(students);
        System.out.println("\n===================================================\n\n");

        System.out.println("===================================================");
        System.out.println("Courses Unordered List");
        System.out.println("===================================================");
        printCourse(courses);
        System.out.println("\nSorted by name ascending ===========================\n");
        sort.sortCoursesByName(courses);
        printCourse(courses);
        System.out.println("\n===================================================\n\n");

        System.out.println("===================================================");
        System.out.println("Enrollments Unordered List");
        System.out.println("===================================================");
        printEnrollment(enrollments);
        System.out.println("\nSorted by date ascending ===========================\n");
        sort.sortEnrollmentsByDate(enrollments);
        printEnrollment(enrollments);
        System.out.println("\n===================================================\n\n");

    }

    private static void printStudent(List<Student> students) {
        for (Student item : students) {
            System.out.println(item.getName());
        }
    }

    private static void printCourse(List<Course> courses) {
        for (Course item : courses) {
            System.out.println(item.getCourseName());
        }
    }

    private static void printEnrollment(List<Enrollment> enrollments) {
        for (Enrollment item : enrollments) {
            System.out.println(item.getDateEnrolled());
            System.out.println(getDateAU(item.getDateEnrolled()));
        }
    }

    public static String getDateAU(Date date) {
        return new SimpleDateFormat("dd-MM-yyyy").format(date);
    }

}
