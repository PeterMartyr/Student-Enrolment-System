/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_App;

import PeterMartyr.Library.Models.DoublyLinkedList;
import PeterMartyr.Library.Models.Node;
import PeterMartyr.Library.Models.Student;
import Test_Stub.TestStub_DLL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PeterMartyr
 */
public class TestD_DoublyLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestStub_DLL testStub = new TestStub_DLL();

        DoublyLinkedList<Student> students = testStub.getStudents();

        System.out.println("\n===  ADD to Doubly Linked List=====================");

        Node node = students.getHead();

        while (node != null) {
            System.out.println(((Student) node.getValue()).getName());
            node = node.getNext();
        }

        System.out.println("\nTest Get Size:: " + students.getSize());

        System.out.println("\nTest Get Item &&& Has Item, should be True if it works");

        Student Jon = students.getAt(2);

        System.out.println("John Smith aka pos 2 ==" + Jon);
        System.out.println("Is tom in the list? = " + students.contains(Jon));

        System.out.println("\nDelete John Smith and check he Gone");

        students.deleteNode(2);
        System.out.println("Is John Smith in the list? = " + students.contains(Jon));

        System.out.println("\nInsert John Smith back at Number 3 then print names");

        students.insertNode(3, Jon);

        node = students.getHead();
        while (node != null) {
            System.out.println(((Student) node.getValue()).getName());
            node = node.getNext();
        }

        System.out.println("\nFor my final test John will be replaced with Clark Kent aka Superman");

        Student superman = new Student("SMan of Steel",
                convertStringtoDate("25-02-2015"), "Clark Kent", "Super@hotmail.com", "123456");

        students.insertValueAt(3, superman);

        node = students.getHead();
        while (node != null) {
            System.out.println(((Student) node.getValue()).getName());
            node = node.getNext();
        } 
        
        System.out.println("\nOpps forgot to spin backward");
        System.out.println("this next text will spin and write the names backward according to the list");
        
        node = students.getTail();
        while (node != null) {
            System.out.println(((Student) node.getValue()).getName());
            node = node.getPrevious();
        } 
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
