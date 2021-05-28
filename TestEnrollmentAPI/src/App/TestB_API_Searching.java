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

    }

}
