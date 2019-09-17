package code401challenges.hashtable;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class HashtableTest {
    private Hashtable ht;

    @Before
    public void setup(){
        ht = new Hashtable(1024);
    }

    @Test
    public void add() {
        ht.add("Saron", "Nobel");
        assertEquals(null, ht.get("Saron"));
        assertTrue(ht.contains("Saron"));

    }

    @Test
    public void get() {
        ht.add("Saron", "Nobel");
        ht.add("Saron", "Roman");
        assertEquals(null, ht.get("Saron"));
    }

    @Test
    public void getNull(){
        assertEquals(null, ht.get("Saron"));
    }

    @Test
    public void contains_true() {
        ht.add("Saron", "Noble");
        assertTrue(ht.contains("Saron"));
    }

    @Test
    public void contains_false() {
        assertFalse(ht.contains("Saron"));
    }

   }