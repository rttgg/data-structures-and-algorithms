package code401challenges.tree;

import org.junit.Test;

public class BreadthTraversalTest {

    @Test
    public void testBreadthTraversal() {
        BinaryTree testTree = new BinaryTree(15);
        Node<Integer> root = new Node<>(2);
        Node<Integer> rootLeft = new Node<>(7);
        Node<Integer> rootRight = new Node<>(5);
        Node<Integer> rootLeftLeft = new Node<>(2);
        Node<Integer> rootLeftRight = new Node<>(6);
        Node<Integer> rootRightRight = new Node<>(9);
        testTree.root = root;
        root.left = rootLeft;
        root.node = rootRight;
        root.left = rootLeftLeft;
        root.node = rootLeftRight;
        root.node = rootRightRight;
        assertEquals("[2,7,5,2,6,9]", BinaryTree.arrayListToString(testTree.inOrder()));



    }

    private void assertEquals(String s1, String s) {

    }


}