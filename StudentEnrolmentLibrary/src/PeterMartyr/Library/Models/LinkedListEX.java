/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

/**
 *
 * @author PeterMartyr
 */
public interface LinkedListEX<T> {

    Node<T> getHead();

    Node<T> getTail();

    /**
     *
     * @return the size of the List
     */
    int getSize();

    /**
     * addNodeAtEnd() will add a new node to the list
     *
     * @param item to add to the List
     */
    void addNodeAtEnd(T item);

    void addNodeAtStart(T item);
    //This function will add the new node at the middle of the list.

    void insertNodeAt(int position, T item);

    void insertValueAt(int position, T item);

    boolean contains(T item);

    int getPosition(T item);

    T getAt(int pos);

    /**
     * Given a reference (pointer to pointer) to the head of a list and a
     * position, deletes the node at the given position
     *
     * @param position the index spot in the list to deleted
     */
    void deleteNodeAt(int position);

}
