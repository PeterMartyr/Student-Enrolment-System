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
        List<Enrollment> enrollments = testStub.getEnrollments();
        
          Search search = new Search();
        
        
        
         int[] iList = { 0, 1, 1, 2, 3, 5, 8, 13, 21,34, 55, 89, 144, 233, 377, 610};
         
         List<String> sList = new ArrayList();
         
         for (int i : iList) {
           sList.add(String.valueOf(i));
        }
 
 
        // Find the index of 'x' using Jump Search
        int index = search.jumpSearchString(iList, "13");
 
        // Print the index where 'x' is located
        System.out.println("\nNumber " + x +
                            " is at index " + index);
        
        
    }
    
}
