package code401challenges.utilities.fizzbuzz_tree;

import code401challenges.StacksAndQueues.Node;
import code401challenges.tree.BinaryTree;
import org.junit.Test;



public class TreeFizzBuzzTest {

    @Test public void testFizzBuzz(){

        BinaryTree<Object> testBinaryTree = new BinaryTree<>();
        Node<Object> rootNode = new Node<>(30);
        Node<Object> leftNode = new Node<>(10);
        Node<Object> rightNode = new Node<>(9);
        Node<Object> leftLeftNode = new Node<>(11);
        Node<Object> leftrightNode = new Node<>(25);
        testBinaryTree.root = rootNode;
        rootNode.leftChild = leftNode;
        rootNode.rightChild = rightNode;
        leftNode.leftChild = leftLeftNode;
        leftNode.rightChild = leftrightNode;

        FizzBuzzTree.fizzBuzzTree(testBinaryTree);
        assertEquals(7, "Buzz", "Buzz", "FizzBuzz", "Fizz", testBinaryTree.inOrder().toString());

    }

    private void assertEquals(int i, String buzz, String buzz1, String fizzBuzz, String fizz, String toString) {

    }


}


//        30
//     /    \
//      10      9
//      / \     /  \
//    11   5
