/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test_App;

import PeterMartyr.Library.Models.DoublyLinkedList;
import PeterMartyr.Library.Models.Node;
import PeterMartyr.Library.Models.SinglyLinkedList;
import PeterMartyr.Library.Models.Student;
import Test_Stub.TestStub_SLL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author PeterMartyr
 */
public class TestD_SinglyLinkedLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TestStub_SLL testStub = new TestStub_SLL();

        SinglyLinkedList<Student> students = testStub.getStudents();

        System.out.println("\n===  ADD to Singly Linked List=====================");

        Node node = students.getHead();

        while (node != null) {
            System.out.println(((Student) node.getValue()).getName());
            node = node.getNext();
        }

        System.out.println("\nTest Get Size:: " + students.getSize());

        System.out.println("\nTest Get Item &&& Has Item, should be True if it works");

        Student jon = new Student();
        jon = students.getAt(2);
 

        System.out.println("John Smith aka pos 2 ==" + jon);
        System.out.println("Is John in the list? = " + students.contains(jon));

        System.out.println("\nDelete John Smith and check he Gone");
  
        students.deleteNodeAt(2);
     
        System.out.println("Is John Smith in the list? = " + students.contains(jon));
             
        System.out.println("\nInsert John Smith back at Number 3 then print names");

        students.insertNodeAt(3, jon);

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
        
        System.out.println("\nNote this sadly does not spin backwards");
        
         System.out.println("\nAdd Multiple at once to start of list? ");
        
        testStub.addExtra(students);
        
        node = students.getHead();
        while (node != null) {
            System.out.println(((Student) node.getValue()).getName());
            node = node.getNext();
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
