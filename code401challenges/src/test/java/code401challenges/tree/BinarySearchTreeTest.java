package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void add() {
        BinarySearchTree testTreeAdd = new BinarySearchTree();
        assertTrue("true", testTreeAdd.node == null);

        testTreeAdd.add(1);
        testTreeAdd.add(10);
        testTreeAdd.add(2);
        testTreeAdd.add(20);

        assertTrue("true",(int) testTreeAdd.node.value == 1);
        assertTrue("true", (int)testTreeAdd.node.value == 10);
        assertTrue("true", (int)testTreeAdd.node.value == 2);
        assertTrue("true", (int)testTreeAdd.node.value == 20);

    }

    @Test
    public void contains() {
        BinarySearchTree testTreeContains = new BinarySearchTree();
        assertTrue("true", testTreeContains.node == null);

        testTreeContains.add(11);
        testTreeContains.add(10);
        testTreeContains.add(2);
        testTreeContains.add(20);

        assertTrue("true", testTreeContains.node.value == 1);
        assertTrue("true", testTreeContains.node.value == 1);
        assertTrue("false", testTreeContains.node.value == 5);
        assertTrue("false", testTreeContains.node.value == 11);
    }
}