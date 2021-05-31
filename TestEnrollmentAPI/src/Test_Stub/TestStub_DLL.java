/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Stub;

import PeterMartyr.Library.Models.DoublyLinkedList;
import PeterMartyr.Library.Models.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PeterMartyr
 */
public class TestStub_DLL {

    private DoublyLinkedList<Student> students;

    public TestStub_DLL() {
        this.students = new DoublyLinkedList<>();
        onInit();
    }

    public DoublyLinkedList<Student> getStudents() {
        return students;
    }

    private void onInit() {

        students.addNodeAtEnd(
                new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478")
        );
        students.addNodeAtEnd(
                new Student("Software Delevepment", convertStringtoDate("25-02-2015"), "John Smith", "JS@hotmail.com", "123456")
        );
        students.addNodeAtEnd(
                new Student("digital media", convertStringtoDate("25-05-2012"), "aarron clark", "AA@live.com", "9876544")
        );
        students.addNodeAtEnd(
                new Student("Software Delevepment", convertStringtoDate("22-02-2012"), "Anne Deeme", "AD@Yahoo.com", "234567")
        );
        students.addNodeAtEnd(
                new Student("Software Delevepment", convertStringtoDate("01-03-2014"), "Sam Brown", "SB@live.com", "9876544")
        );
    }

    private static Date convertStringtoDate(String ddMMyyyy) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(ddMMyyyy);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public void addExtra(DoublyLinkedList<Student> students) {

        students.addNodeAtStart(new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Annie Hall", "SJ@gmail.com", "951478"));
        students.addNodeAtStart(new Student("Software Delevepment", convertStringtoDate("25-02-2015"), "Eddie Wilson", "JS@hotmail.com", "123456"));
        students.addNodeAtStart(new Student("digital media", convertStringtoDate("25-05-2012"), "Bruce Wayne", "AA@live.com", "9876544"));
        students.addNodeAtStart(new Student("Software Delevepment", convertStringtoDate("22-02-2012"), "Dick Ward", "AD@Yahoo.com", "234567"));
        students.addNodeAtStart(new Student("Software Delevepment", convertStringtoDate("01-03-2014"), "Peter Parker", "SB@live.com", "9876544"));
    }
}
