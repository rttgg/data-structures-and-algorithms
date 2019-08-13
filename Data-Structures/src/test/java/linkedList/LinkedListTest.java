package linkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {


    @Test
    public void insert() {
        LinkedList any = new LinkedList();
        any.insert( "hello");
        any.insert( "d");
        assertTrue(any.head.next.value == "hello");
    }

    @Test
    public void append () {
        LinkedList any = new LinkedList();
        any.insert( "head, 1, 3, 2, x");
        //any.insert("head, x");
        assertTrue(any.head.value == "head, 1, 3, 2, x");
       // assertTrue(any.head.value == "head, x");
    }


    @Test
    public void insertBefore() {
        LinkedList any = new LinkedList();
        any.insert(3);
        any.insertBefore(3,5);
        assertEquals("before the target", "List: 5, 3", any.toString());
        }

    @Test
    public void insertAfter() {
        LinkedList any = new LinkedList();
        any.insert(3);
        any.insertBefore(3,5);
        assertEquals("before the target", "List: 5, 3", any.toString());
    }

    @Test
    public void includes() {
        LinkedList any = new LinkedList();
        any.insert( "hello");
        assertEquals("return true", true, any.includes("hello"));
    }

    @Test
    public void testToString() {
        LinkedList any = new LinkedList();
        any.insert( "preK");
        any.insert("first grade");
        any.insert( "2nd");
        assertEquals("List: 2nd, first grade, preK",  any.toString());
    }

}
