/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PeterMartyr.Library.Models;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pmart
 */
public class NodeTest {
    
    public NodeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getValue method, of class Node.
     */
    @Test
    public void testGetValue() {
        System.out.println("getValue");
        Node instance = new Node("VALUE");
        Object expResult = "VALUE";
        Object result = instance.getValue();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNext method, of class Node.
     */
    @Test
    public void testGetNext() {
        System.out.println("getNext");
        Node instance = new Node("VALUE");
        Node expResult = null;
        Node result = instance.getNext();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPrevious method, of class Node.
     */
    @Test
    public void testGetPrevious() {
        System.out.println("getPrevious");
        Node instance = new Node("VALUE");
        Node expResult = null;
        Node result = instance.getPrevious();
        assertEquals(expResult, result);
    }
    
}
