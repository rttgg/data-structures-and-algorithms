package code401challenges.hashtable;

import code401challenges.tree.BinaryTree;
import org.junit.Before;
import org.junit.Test;
import code401challenges.tree.Node;

import java.util.ArrayList;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.*;


public class TreeIntersectionTest {

    BinaryTree tree1;
    BinaryTree tree2;
    @Before
    public void init() {
        tree1 = new BinaryTree(150);
        tree1.root.left = new Node<>(100);
        tree1.root.left.left = new Node<>(75);
        tree1.root.left.rightChild = new Node<>(160);
        tree1.root.left.rightChild.left = new Node<>(125);
        tree1.root.left.rightChild.rightChild = new Node<>(175);
        tree1.root.rightChild = new Node<>(250);
        tree1.root.rightChild.left = new Node<>(200);
        tree1.root.rightChild.rightChild = new Node<>(350);
        tree1.root.rightChild.rightChild.left = new Node<>(300);
        tree1.root.rightChild.rightChild.rightChild = new Node<>(500);


        tree2 = new BinaryTree(42);
        tree2.root.left = new Node<>(100);
        tree2.root.left.left = new Node<>(15);
        tree2.root.left.rightChild = new Node<>(160);
        tree2.root.left.rightChild.left = new Node<>(125);
        tree2.root.left.rightChild.rightChild = new Node<>(175);
        tree2.root.rightChild = new Node<>(600);
        tree2.root.rightChild.left = new Node<>(200);
        tree2.root.rightChild.rightChild = new Node<>(350);
        tree2.root.rightChild.rightChild.left = new Node<>(4);
        tree2.root.rightChild.rightChild.rightChild = new Node<>(500);


    }

    @Test
    public void common() {
        TreeIntersection test = new TreeIntersection();
        ArrayList<Integer> list= new ArrayList<>();
        list = test.common(tree1, tree2);
        assertTrue("both tree has this number",list.contains(100));
        assertTrue("both tree has this number",list.contains(160));
        assertTrue("both tree has this number",list.contains(125));
        assertTrue("both tree has this number",list.contains(175));
        assertTrue("both tree has this number",list.contains(200));
        assertTrue("both tree has this number",list.contains(350));
        assertTrue("both tree has this number",list.contains(500));

//        assertFalse("The list should not contain the value not available in both binary trees",list.contains(4));
//        assertFalse("The list should not contain the value not available in both binary trees",list.contains(42));


    }

}