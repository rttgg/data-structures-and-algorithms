package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.Assert.*;

public class BinaryTreeTest {

    @Test
    public void testBinarySearch() {
        BinarySearchTree binarySearch = new BinarySearchTree();
        assertNull("empty tree", binarySearch.root);
    }

    @Test
    public void testBreadthFirst() {
        BinarySearchTree binarySearch = new BinarySearchTree();
        BinaryTree binary = new BinaryTree();
        binarySearch.add(12);
        binarySearch.add(7);
        binarySearch.add(4);
        binarySearch.add(8);
        binarySearch.add(17);
        binarySearch.add(14);
        binarySearch.add(27);
        binary.firstTraversal(binarySearch.root);
    }

    @Test
    public void testMaxNumber() {
        BinarySearchTree binarySearch = new BinarySearchTree();
        BinaryTree binary = new BinaryTree();
        binarySearch.add(10);
        binarySearch.add(5);
        binarySearch.add(2);
        binarySearch.add(6);
        binarySearch.add(15);
        binarySearch.add(12);
        binarySearch.add(25);
        assertEquals("25", binary.findTheLargeValue(binarySearch.root), 25);
    }

    @Test
    public void testMaxEdgeC() {
        BinarySearchTree binarySearch = new BinarySearchTree();
        BinaryTree binary = new BinaryTree();
        binarySearch.add(10);
        assertEquals("10", binary.findTheLargeValue(binarySearch.root), 10);
    }

//    @Test
//    public void testFindMaxEdgeNull() {
//        BinarySearchTree bst = new BinarySearchTree();
//        BinaryTree bt = new BinaryTree();
//        assertEquals("Should return 0 when argument is empty tree", bt.findTheLargeValue(bst.root), 0);
//    }
}