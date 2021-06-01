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
public interface LinkedListEX<T> {

    /**
     *
     * @return The first Node in the List or Null if no node exists
     */
    Node<T> getHead();

    /**
     *
     * @return The last Node in the List or Null if no node exists
     */
    Node<T> getTail();

    /**
     *
     * @return the size of the List
     */
    int getSize();

    /**
     * Adds a new Node to the End of the List
     *
     * @param item The value of the Node
     */
    void addNodeAtEnd(T item);

    /**
     * Adds a new Node to Start of the List
     *
     * @param item The value of the Node
     */
    void addNodeAtStart(T item);

    /**
     * Inserts a New Node at the given position
     *
     * @param position The position to insert the Node
     * @param item The value of the Node
     */
    void insertNodeAt(int position, T item);

    /**
     * Insert New Data (Value) into a Existing Node at at the given position
     *
     * @param position The position of the Node
     * @param item The New value to insert into the Node
     */
    void insertValueAt(int position, T item);

    /**
     * Searches for param item in the List
     *
     * @param item the Item to compare
     * @return True if in the list or false if not found
     */
    boolean contains(T item);

    /**
     * get the position in the list of an Object
     *
     * @param item The Item to search for
     * @return the index position of the item or -1 if not Found
     */
    int getPosition(T item);

    /**
     * Get the item at the requested position
     *
     * @param pos the index position to retrieve the item
     * @return the item at the index or null
     */
    T getAt(int pos);

    /**
     * Given a reference (pointer to pointer) to the head of a list and a
     * position, deletes the node at the given position
     *
     * @param position the index spot in the list to deleted
     */
    void deleteNodeAt(int position);

}
