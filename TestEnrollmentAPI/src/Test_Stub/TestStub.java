/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Stub;

import PeterMartyr.Library.Models.Course;
import PeterMartyr.Library.Models.Enrollment;
import PeterMartyr.Library.Models.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author 001091501
 */
public class TestStub {

    private List<Course> courses;

    private List<Student> students;

    public TestStub() {
        super();
        courses = new LinkedList();
        students = new LinkedList();
        onInit();
    }

    public List<Course> getCourses() {
        return courses;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Enrollment> getEnrollments(int index) {
        return students.get(index).getEnrollments();
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
                new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478"));

        students.add(
                new Student("Software Delevepment", convertStringtoDate("25-02-2015"), "John Smith", "JS@hotmail.com", "123456"));
        
        students.add(
                new Student("digital media", convertStringtoDate("25-05-2012"), "aarron clark", "AA@live.com", "9876544"));
        students.add(
                new Student("Software Delevepment", convertStringtoDate("22-02-2012"), "Anne Deeme", "AD@Yahoo.com", "234567"));
        students.add(
                new Student("Software Delevepment", convertStringtoDate("01-03-2014"), "Sam Brown", "SB@live.com", "9876544"));
        
        sortStudentListDescByID();

        students.get(0).addEnrollment("Semester 1", convertStringtoDate("01-02-2019"));
        students.get(0).addEnrollment("Semester 1", convertStringtoDate("01-02-2018"));
        students.get(0).addEnrollment("Semester 1", convertStringtoDate("01-02-2017"));
    }

    private static Date convertStringtoDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(ddMMyyyy);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    
    public void sortStudentListDescByID() {
        Student temp;
        for (int j = 0; j <= students.size() - 1; j++) {
            for (int i = 0; i <= students.size() - 2; i++) {
                if (students.get(i + 1).getStudentID() > students.get(i).getStudentID()) {
                    temp = students.get(i + 1);
                    students.set(i + 1, students.get(i));
                    students.set(i, temp);
                }
            }
        }
    }
}
