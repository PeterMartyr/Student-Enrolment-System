/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestData;

import PeterMartyr.Library.Models.Course;
import PeterMartyr.Library.Models.Enrollment;
import PeterMartyr.Library.Models.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author 001091501
 */
public class TestStub {

    private List<Course> courses;

    private List<Student> students;

    private List<Enrollment> enrollments;

    public TestStub() {
        super();
        courses = new ArrayList();
        students = new ArrayList();
        enrollments = new ArrayList();
        onInit();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Enrollment> getEnrollments() {
        return students.get(0).getEnrollments();
    }

    private void onInit() {

        courses.add(
                new Course("4JAB", "Java Basic", 600.00));
        courses.add(
                new Course("4C#B", "C-Sharp Basic", 600.00));
        courses.add(
                new Course("4HTML", "Web-page Design", 450.00));
        courses.add(
                new Course("5CEP", "Copyright and Ethics", 300.00));

        students.add(
                new Student("Software Delevepment", "Sue Jone", "SJ@gmail.com", "951478"));

        students.add(
                new Student("Software Delevepment", "John Smith", "JS@hotmail.com", "123456"));
        students.add(
                new Student("Software Delevepment", "Anne Deeme", "AD@Yahoo.com", "234567"));
        students.add(
                new Student("Software Delevepment", "Sam Brown", "SB@live.com", "9876544"));

        students.get(0).addEnrollment("Semester 1", convertStringtoDate("01-02-2019"));
        students.get(0).addEnrollment("Semester 1", convertStringtoDate("01-02-2018"));
        students.get(0).addEnrollment("Semester 1", convertStringtoDate("01-02-2017"));
    }

    private Date convertStringtoDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd-M-yyyy").parse(ddMMyyyy);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

}
