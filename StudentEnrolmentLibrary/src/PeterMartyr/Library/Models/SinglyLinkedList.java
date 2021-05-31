/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

/**
 *
 * @author Claudio Pietromartire
 */
public class SinglyLinkedList<T> {

    class Node<T> {

        private T value;
        private Node next;

        public Node(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

    }

    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    /**
     *
     * @return the size of the List
     */
    public int getSize() {

        int count = 0;
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    /**
     * addNode() will add a new node to the list
     *
     * @param item to add to the List
     */
    public void addNode(T item) {
        //Create a new node    
        Node node = new Node(item);

        //Checks if the list is empty    
        if (head == null) {
            //If list is empty, both head and tail will point to new node    
            head = node;

        } else {
            //node will be added after tail such that tail's next will point to node    
            tail.next = node;

        }
        //node will become new tail of the list    
        tail = node;
    }

    public boolean hasItem(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public T getAt(int pos) {
        Node<T> current = head;
        int index = 0;
        while (current != null) {
            if (index == pos) {
                return current.value;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    public T getItem(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

  /**
   *  Given a reference (pointer to pointer) to the head of a list
   *    and a position, deletes the node at the given position
   * 
   * @param position the index spot in the list to deleted
   */
    void deleteNode(int position) {
        // If linked list is empty
        if (head == null) {
            return;
        }
        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next;   // Change head
            return;
        }

        // Find previous node of the node to be deleted
        int index = 0;
        position--;
        while (temp != null && index < position){
            temp = temp.next;
        }

        // If position is more than number of nodes
        if (temp == null || temp.next == null) {
            return;
        }

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next;  // Unlink the deleted node from list
    }
}
