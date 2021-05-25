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
public class SortByStudentName implements Comparator<Student>{
    public int compare(Student x, Student y)
    {
        return x.getName().toUpperCase().compareTo(y.getName().toUpperCase());
    } 
}