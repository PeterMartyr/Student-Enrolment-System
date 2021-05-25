/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import PeterMartyr.Library.Models.Student;
import java.util.Comparator;

/**
 *
 * @author PeterMartyr
 */
public class CustomSortingComparator implements Comparator<Student> {

    @Override
    public int compare(Student s1, Student s2) {

        // for comparison 
        int NameCompare = s1.getName().toUpperCase().compareTo(s2.getName().toUpperCase());
        int IDCompare = s1.getStudentID() - s2.getStudentID();

        // 2-level comparison using if-else block 
        if (NameCompare == 0) {
            return ((IDCompare == 0) ? NameCompare : IDCompare);
        } else {
            return NameCompare;
        }
    }
}
