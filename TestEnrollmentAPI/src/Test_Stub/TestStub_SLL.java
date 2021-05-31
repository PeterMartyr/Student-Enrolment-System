/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_Stub;

import PeterMartyr.Library.Models.SinglyLinkedList;
import PeterMartyr.Library.Models.Student;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PeterMartyr
 */
public class TestStub_SLL {
    
        private SinglyLinkedList<Student> students;

    public TestStub_SLL() {
        this.students = new SinglyLinkedList<>();
        onInit();
    }

    public SinglyLinkedList<Student> getStudents() {
        return students;
    }
   
    private void onInit() {

        students.addNode(
                new Student("Software Delevepment", convertStringtoDate("25-02-2012"), "Sue Jone", "SJ@gmail.com", "951478")
        );
        students.addNode(
                new Student("Software Delevepment", convertStringtoDate("25-02-2015"), "John Smith", "JS@hotmail.com", "123456")
        );
        students.addNode(
                new Student("digital media", convertStringtoDate("25-05-2012"), "aarron clark", "AA@live.com", "9876544")
        );
        students.addNode(
                new Student("Software Delevepment", convertStringtoDate("22-02-2012"), "Anne Deeme", "AD@Yahoo.com", "234567")
        );
        students.addNode(
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
  
    
}
