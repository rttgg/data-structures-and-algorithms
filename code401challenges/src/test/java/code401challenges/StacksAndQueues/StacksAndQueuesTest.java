package code401challenges.StacksAndQueues;


import org.junit.Test;

import static org.junit.Assert.*;


public class StacksAndQueuesTest {

    //    Can successfully push onto a stack
//    Can successfully push multiple values onto a stack
//    Can successfully pop off the stack
//    Can successfully empty a stack after multiple pops
//    Can successfully peek the next item on the stack
//    Can successfully instantiate an empty stack
//    Can successfully enqueue into a queue
//    Can successfully enqueue multiple values into a queue
//    Can successfully dequeue out of a queue the expected value
//    Can successfully peek into a queue, seeing the expected value
//    Can successfully empty a queue after multiple dequeues
//    Can successfully instantiate an empty queue


    // push multiple values onto a stack
    @Test
    public void testPush() {
        Stack testStack = new Stack();
        testStack.push("PersonA");
        testStack.push("Roman Gebrehiwot");
        testStack.push("PersonC");
        assertEquals("PersonC", "PersonC", testStack.top.value);
        assertEquals("Roman Gebrehiwot", "Roman Gebrehiwot", testStack.top.next.value);
        assertEquals("PersonA", "PersonA", testStack.top.next.next.value);
    }

    //pop off the stack
    //empty a stack after multiple pops
    @Test
    public void testPop() {
        Stack testStack = new Stack();
        testStack.push("PancakeA");
        testStack.pop();
        assertEquals("null", null, testStack.top);

        testStack.push("PancakeB");
        testStack.push("PancakeC");
        testStack.push("PancakeD");
        testStack.pop();
        assertEquals("PancakeC", "PancakeC", testStack.top.value);

        testStack.pop();
        testStack.pop();
        assertEquals("null", null, testStack.top);
    }


    //peek the next item on the stack
    @Test
    public void testPeek() {
        Stack testStack = new Stack();
        testStack.push("BiscuitA");
        assertEquals("BiscuitA", "BiscuitA", testStack.peek());

        testStack.push("BiscuitB");
        assertEquals("BiscuitB", "BiscuitB", testStack.peek());

        testStack.pop();
        assertEquals("BiscuitA", "BiscuitA", testStack.peek());
    }


    //enqueue into a queue
    //enqueue multiple values into a queue
    @Test
    public void testEnqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue(1);
        assertEquals("1", 1, testQueue.front.value);
        assertEquals("null", null, testQueue.front.next);
        assertEquals("1", 1, testQueue.back.value);
        assertEquals("null", null, testQueue.back.next);

        testQueue.enqueue(2);
        assertEquals("1", 1, testQueue.front.value);
        assertEquals("2", 2, testQueue.front.next.value);
        assertEquals("2", 2, testQueue.back.value);
        assertEquals("null", null, testQueue.back.next);

        testQueue.enqueue(3);
        assertEquals("1", 1, testQueue.front.value);
        assertEquals("2", 2, testQueue.front.next.value);
        assertEquals("3", 3, testQueue.front.next.next.value);
        assertEquals("3", 3, testQueue.back.value);
        assertEquals("null", null, testQueue.back.next);
    }


    //dequeue out of a queue the expected value


    @Test
    public void testDequeue() {
        Queue testQueue = new Queue();
        assertEquals("null", null, testQueue.dequeue());

        testQueue.enqueue("PersonZ");
        assertEquals("PersonZ", "PersonZ", testQueue.dequeue());
        assertEquals("null", null, testQueue.dequeue());

        testQueue.enqueue("PersonY");
        testQueue.enqueue("PersonX");
        testQueue.enqueue("PersonW");
        assertEquals("PersonY", "PersonY", testQueue.dequeue());
        assertEquals("PersonX", "PersonX", testQueue.dequeue());
        assertEquals("PersonW", "PersonW", testQueue.dequeue());
        assertEquals("null", null, testQueue.dequeue());
    }


    // peek into a queue, seeing the expected value
//    Can successfully empty a queue after multiple dequeues
    @Test
    public void testQueuePeek() {
        Queue testQueue = new Queue();
        assertEquals("null", null, testQueue.peek());

        String testStringArray = "Flower";
        //int[] testIntArray = {1, 2, 3, 4};
        testQueue.enqueue(testStringArray);
        testQueue.enqueue("Items");
        assertEquals("Flower", testStringArray, testQueue.peek());

        testQueue.dequeue();
        assertEquals("Items", "Items", testQueue.peek());

        testQueue.dequeue();
        assertEquals("null", null, testQueue.peek());
    }



}

