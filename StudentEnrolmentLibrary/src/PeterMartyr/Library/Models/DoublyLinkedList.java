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
public class DoublyLinkedList<T> implements LinkedListEX<T> {

    private Node<T> head;
    private Node<T> tail;

    public Node<T> getHead() {
        return head;
    }

    public Node<T> getTail() {
        return tail;
    }

    @Override
    public int getSize() {

        int count = 0;
        Node<T> current = head;
        while (current != null) {
            current = current.next;
            count++;
        }
        return count;
    }

    @Override
    public void addNodeAtEnd(T item) {

        Node node = new Node(item);
        if (head == null) {
            head = node; // no nodes
        } else {
            tail.next = node;
            // Before Head -> <-> 5 -> null
            // After: Head -> 3 <-> 5 <-> 7 -> null
            node.previous = tail;
        }
        tail = node;
    }

    @Override
    public boolean contains(T item) {
        Node<T> current = head;
        while (current != null) {
            if (current.value.equals(item)) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    @Override
    public T getAt(int pos) {
        Node<T> current = head;
        int index = 1;
        while (current != null) {
            if (index == pos) {
                return current.value;
            }
            current = current.next;
            index++;
        }
        return null;
    }

    @Override
    public int getPosition(T item) {
        Node<T> current = head;
        int index = 1;
        while (current != null) {
            if (current.value.equals(item)) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    @Override
    public void deleteNodeAt(int position) {

        if (getSize() < position) {
            return;
        }

        if (head == null) {
            return;
        } else {
            Node current = head;

            for (int i = 1; i < position; i++) {
                current = current.next;
            }

            if (current == head) {
                head = current.next;
            } else if (current == tail) {
                tail = tail.previous;
            } else {
                current.previous.next = current.next;
                current.next.previous = current.previous;
            }
            current = null;
        }
    }

    //addInMid() will add a node to the middle of the list  
    @Override
    public void insertNodeAt(int position, T item) {

        if (getSize() <= position) {
            return;
        }
        Node node = new Node(item);
        if (head == null) {
            head = tail = node;
            head.previous = null;
            tail.next = null;
        } else {
            Node current = head, temp = null;

            for (int i = 1; i < position; i++) {
                current = current.next;
            }

            temp = current.next;
            temp.previous = current;

            current.next = node;
            node.previous = current;
            node.next = temp;
            temp.previous = node;
        }
    }

    @Override
    public void insertValueAt(int position, T item) {

        if (getSize() < position || head == null) {
            return;
        }
        Node node = head;
        int index = 1;
        while (node != null) {
            if (index == position) {
                node.value = item;
            }
            node = node.next;
            index++;
        }
    }

    @Override
    public void addNodeAtStart(Object item) {

        Node<T> node = new Node(item);
        if (head == null) {
            head = node;
            tail = node;
            head.previous = null;
            tail.next = null;
        } else {
            head.previous = node;
            node.next = head;
            node.previous = null;
            head = node;
        }
    }
}
