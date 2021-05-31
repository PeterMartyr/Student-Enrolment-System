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
public class Node<T> {

    public T value;
    public Node next;
    public Node previous;

    /**
     * * the all argument constructor (for this)
     *
     * @param value
     */
    public Node(T value) {
        this.value = value;
    }

    /**
     *
     * @return the value of the object stored in the node
     */
    public T getValue() {
        return value;
    }

    /**
     *
     * @return the node in front of node calling it
     */
    public Node getNext() {
        return next;
    }

    /**
     *
     * @return  the node in behind the node calling it
     */
    public Node getPrevious() {
        return previous;
    }
}
