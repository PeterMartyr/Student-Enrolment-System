/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import PeterMartyr.Library.Models.Course;
import java.util.Comparator;

/**
 *
 * @author PeterMartyr
 */
public class SortByCourseName implements Comparator<Course>{
    
    public int compare(Course x, Course y)
    {
        return x.getCourseName().toUpperCase().compareTo(y.getCourseName().toUpperCase());
    } 
}