package code401challenges.tree;

import java.util.ArrayList;
import java.util.Queue;

public class BinaryTree {
    public Node root;

    public BinaryTree(){
        this.root = null;
    }
    //which returns an array of the values, ordered appropriately.
    //pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
    public void preOrder(Node node){
        if (node != null){
            System.out.println(" " + node.value);
            preOrder(node.leftChild);
            preOrder(node.rightChild);
        }

    }
//in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree
    public ArrayList<Integer> inOrder(Node node) {
        ArrayList<Integer> list = null;
        if (node != null) {
            inOrder(node.leftChild);
            System.out.println(" " + node.value);
            //list = new ArrayList<>();
            list.add(node.value);
            inOrder(node.rightChild);

        }
        return list;


    }

    //post-order traversal visits the left subtree, the right subtree, and the root node at the end
    public Queue<Integer> postOrder(Node node) {
        Queue<Integer> list = null;
        if (node != null) {
            postOrder(node.leftChild);
            postOrder(node.rightChild);
            System.out.println(" " + node.value);
            //list = null;
            list.add(node.value);
        }
        return list;
    }


}
