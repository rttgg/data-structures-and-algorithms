package code401challenges.QueueWithStacks;


import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void testPseudoQueue(){
        PseudoQueue pushToQueue = new PseudoQueue();
        assertTrue("null", pushToQueue.stackOne == null);
        assertTrue("null", pushToQueue.stackTwo == null);
    }


    @Test
    public void enqueue() {
        PseudoQueue pushToQueue = new PseudoQueue();
        pushToQueue.enqueue(20);
        pushToQueue.enqueue(15);
        pushToQueue.enqueue(10);
        pushToQueue.enqueue(5);

        assertEquals("20", 20, pushToQueue.dequeue());
        assertEquals("15", 15, pushToQueue.dequeue());
        assertEquals("10", 10, pushToQueue.dequeue());
        assertEquals("5", 5, pushToQueue.dequeue());
        assertEquals("null", null, pushToQueue.dequeue());

    }

    @Test
    public void dequeue() {
        PseudoQueue pushToQueue = new PseudoQueue();
        pushToQueue.enqueue(2);
        pushToQueue.enqueue(1);
        pushToQueue.enqueue(0);
        pushToQueue.enqueue(3);

        assertEquals("2", 2, pushToQueue.dequeue());
        assertEquals("1", 1, pushToQueue.dequeue());
        assertEquals("0", 0, pushToQueue.dequeue());
        assertEquals("3", 3, pushToQueue.dequeue());
        assertEquals("null", null, pushToQueue.dequeue());
    }
}