/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

/**
 *
 * @author PeterMartyr
 * @param <T>
 */
public class DoublyLinkedList<T> implements LinkedListEX<T> {

    private Node<T> head;
    private Node<T> tail;

    /**
     *
     * @return The first Node in the List or Null if no node exists
     */
    public Node<T> getHead() {
        return head;
    }

    /**
     *
     * @return The last Node in the List or Null if no node exists
     */
    public Node<T> getTail() {
        return tail;
    }

    /**
     *
     * @return the size of the List
     */
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

    /**
     * Adds a new Node to Start of the List
     *
     * @param item The value of the Node
     */
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

    /**
     * Adds a new Node to the End of the List
     *
     * @param item The value of the Node
     */
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

    /**
     * Inserts a New Node at the given position
     *
     * @param position The position to insert the Node
     * @param item The value of the Node
     */
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

    /**
     * Insert New Data (Value) into a Existing Node at at the given position
     *
     * @param position The position of the Node
     * @param item The New value to insert into the Node
     */
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

    /**
     * Searches for param item in the List
     *
     * @param item the Item to compare
     * @return True if in the list or false if not found
     */
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

    /**
     * get the position in the list of an Object
     *
     * @param item The Item to search for
     * @return the index position of the item or -1 if not Found
     */
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

    /**
     * Get the item at the requested position
     *
     * @param pos the index position to retrieve the item
     * @return the item at the index or null
     */
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

    /**
     * Given a reference (pointer to pointer) to the head of a list and a
     * position, deletes the node at the given position
     *
     * @param position the index spot in the list to deleted
     */
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

}
