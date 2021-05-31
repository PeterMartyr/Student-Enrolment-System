/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import java.util.Comparator;

/**
 *
 * @author PeterMartyr
 */
public class SortByStudentName implements Comparator<Student> {

    /**
     *
     * @param x first student to compare
     * @param y second student to compare
     * @return less than Zero if X is alpha less than Y or return greater than
     * Zero if X is alpha greater than Y or returns a Zero if they are equal.
     */
    @Override
    public int compare(Student x, Student y) {
        return x.getName().toUpperCase().compareTo(y.getName().toUpperCase());
    }
}
