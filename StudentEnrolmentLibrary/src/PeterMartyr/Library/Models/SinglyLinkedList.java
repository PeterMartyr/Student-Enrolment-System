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
        Node node = new Node(item);

        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

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

//    public T getItem(T item) {
//        Node<T> current = head;
//        while (current != null) {
//            if (current.value.equals(item)) {
//
//                return current.value;
//            }
//            current = current.next;
//        }
//        return null;
//    }

    /**
     * Given a reference (pointer to pointer) to the head of a list and a
     * position, deletes the node at the given position
     *
     * @param position the index spot in the list to deleted
     */
    public void deleteNode(int position) {
        // Store head node
        Node temp = head, prev = null;

        int size = getSize();
        if (size < position || head == null) {
            return;
        }

        if (temp != null && size == position) {
            head = temp.next;
            return;
        }

        int index = 1;
        while (temp != null && index < position) {
            prev = temp;
            temp = temp.next;
            index++;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    //This function will add the new node at the middle of the list.  
    public void insertNode(int position, T item) {

        if (getSize() <= position || head == null) {
            return;
        }
        Node node = new Node(item);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            Node temp, current;

            temp = head;
            current = null;

            for (int i = 1; i < position; i++) {
                current = temp;
                temp = temp.next;
            }

            current.next = node;
            node.next = temp;
        }
    }

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
}
