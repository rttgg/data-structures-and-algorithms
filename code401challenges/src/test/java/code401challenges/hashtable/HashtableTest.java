package code401challenges.hashtable;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    Hashtable ht;
    @Before
    public void setup(){
        ht = new Hashtable(1024);
    }

//    @Test
//    public void add() {
//        ht.add("roman", "saron");
//        assertEquals("saron", ht.get("roman"));
//        assertTrue(ht.contains("saron"));
//    }
//
//    @Test
//    public void get() {
//        ht.add("nobel", "saron");
//        ht.add("nobell", "nobel");
//        assertEquals("nobel", ht.get("nobel"));
//    }

    @Test
    public void getNull(){
        assertEquals(null, ht.get("Hello"));
    }

    @Test
    public void contains_true() {
        ht.add("roman", "saron");
        assertTrue(ht.contains("roman"));
    }

    @Test
    public void contains_false() {
        assertFalse(ht.contains("roman"));
    }
}