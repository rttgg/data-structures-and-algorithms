package linkedList;


import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {


    @Test
    public void insert() {
        LinkedList any = new LinkedList();
        any.insert("hello");
        assertTrue(any.head.value == "hello");
    }

    @Test
    public void includes() {
        LinkedList any = new LinkedList();
        any.insert("hello");
        assertEquals("return true", true, any.includes("hello"));
    }

    @Test
    public void testToString() {
        LinkedList any = new LinkedList();
        any.insert("preK");
        any.insert("first grade");
        any.insert("2nd");
        assertEquals("List: 2nd, first grade, preK",  any.toString());
    }
}

