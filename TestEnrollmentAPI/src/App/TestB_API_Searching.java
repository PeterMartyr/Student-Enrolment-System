/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import PeterMartyr.Library.Models.Course;
import PeterMartyr.Library.Models.Enrollment;
import PeterMartyr.Library.Models.Search;
import PeterMartyr.Library.Models.Student;
import TestData.TestStub;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 001091501
 */
public class TestB_API_Searching {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestStub testStub = new TestStub();
        List<Student> students = testStub.getStudents();
        List<Course> courses = testStub.getCourses();
        List<Enrollment> enrollments = testStub.getEnrollments(0);

        Search search = new Search();
        
        System.out.println("Searching for Student with StudentID 3 expect it to work");
        Student student = search.getStudentbyID(students, 3);
        
        System.out.println(student.toString());
        
        
       
        
        System.out.println("\n\nSearching for Course 5CEP 3 expect to work");
         System.out.println("Also testing lower case compare to ignore case");
        Course course = search.getCourseByCode(courses, "5cep");
        
        System.out.println(course.toString());
        
        System.out.println("\n\nSearching for Course 4jab 3 expect to work");
       
        course = search.getCourseByCodeBinary(courses, "4jab");
        
        System.out.println(course.toString());

    }

}
