package code401challenges.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class BinaryTree {
    public Node root;

    ArrayList<Integer> list = new ArrayList<>();


    //which returns an array of the values, ordered appropriately.
    //pre-order traversal visits first the root node, then the left subtree, and finally the right subtree:
    public ArrayList<Integer> preOrder(Node root){
        if (root != null){
            System.out.println(" " + root.value);
            preOrder(root.leftChild);
            preOrder(root.rightChild);
        }
        return list;
    }
//in-order traversal consists of first visiting the left sub-tree, then the root node, and finally the right sub-tree
    public ArrayList<Integer> inOrder(Node root) {

        if (root != null) {
            inOrder(root.leftChild);
            System.out.println(" " + root.value);
            //list = new ArrayList<>();
            list.add(root.value);
            inOrder(root.rightChild);

        }
        return list;


    }

    //post-order traversal visits the left subtree, the right subtree, and the root node at the end
    public ArrayList<Integer> postOrder(Node root) {

        if (root != null) {
            postOrder(root.leftChild);
            postOrder(root.rightChild);
            System.out.println(" " + root.value);
            //list = null;
            list.add(root.value);
        }
        return list;
    }

    public void firstTraversal(Node root) {
        Queue<Node> linkedList = new LinkedList<>();
        linkedList.add(root);

        while (!linkedList.isEmpty()){
            Node node = linkedList.remove();
            System.out.print("" + root.value);
            if (root.leftChild != null){
                linkedList.add(root.leftChild);

            }
            if(root.rightChild != null){
                linkedList.add(root.rightChild);
            }
        }
    }

    public int findTheLargeValue(Node root){
        int large = 0;
        if(root != null){
            if(root.value > large) large = root.value;

            int leftChildValue = findTheLargeValue(root.leftChild);
            int rightChildValue = findTheLargeValue(root.rightChild);
            if(leftChildValue > large)
                large = leftChildValue;

            if (rightChildValue > large)
                large = rightChildValue;

            }
        return large;
        }
    }

