package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class BinarySearchTreeTest {



        @Test
        public void testBinarySearch() {
            BinarySearchTree binarySearch = new BinarySearchTree();
            assertNull("empty tree", binarySearch.root);
        }

        @Test
        public void testRoot() {
            BinarySearchTree binarySearch = new BinarySearchTree();
            binarySearch.add(0);
            assertEquals("0", binarySearch.root.value, 0);
        }

        @Test
        public void testLcRcNode() {
            BinarySearchTree binarySearch = new BinarySearchTree();
            binarySearch.add(10);
            binarySearch.add(5);
            binarySearch.add(15);
            assertEquals("5", binarySearch.root.leftChild.value, 5);
            assertEquals("15", binarySearch.root.rightChild.value, 15);
        }

        @Test
        public void testContains() {
            BinarySearchTree binarySearch = new BinarySearchTree();
            binarySearch.add(10);
            binarySearch.add(5);
            assertTrue("Should be 5", binarySearch.contains(5));
        }

        @Test
        public void testPreOrder() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(10);
            list.add(5);
            list.add(2);
            list.add(6);
            list.add(15);
            list.add(12);
            list.add(25);
            BinarySearchTree binarySearch = new BinarySearchTree();
            BinaryTree bt = new BinaryTree();
            binarySearch.add(10);
            binarySearch.add(5);
            binarySearch.add(2);
            binarySearch.add(6);
            binarySearch.add(15);
            binarySearch.add(12);
            binarySearch.add(25);
            assertEquals("Should be in preOrder", bt.preOrder(binarySearch.root), list);
        }

        @Test
        public void testInOrder() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(5);
            list.add(6);
            list.add(10);
            list.add(12);
            list.add(15);
            list.add(25);
            BinarySearchTree binarySearch = new BinarySearchTree();
            BinaryTree binary = new BinaryTree();
            binarySearch.add(10);
            binarySearch.add(5);
            binarySearch.add(2);
            binarySearch.add(6);
            binarySearch.add(15);
            binarySearch.add(12);
            binarySearch.add(25);
            assertEquals("Should be inOrder traversal", binary.inOrder(binarySearch.root), list);
        }

        @Test
        public void testPostOrder() {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(2);
            list.add(6);
            list.add(5);
            list.add(12);
            list.add(25);
            list.add(15);
            list.add(10);
            BinarySearchTree binarySearch = new BinarySearchTree();
            BinaryTree bt = new BinaryTree();
            binarySearch.add(10);
            binarySearch.add(5);
            binarySearch.add(2);
            binarySearch.add(6);
            binarySearch.add(15);
            binarySearch.add(12);
            binarySearch.add(25);
            assertEquals("Should in postOrder traversal", bt.postOrder(binarySearch.root), list);
        }
    }


