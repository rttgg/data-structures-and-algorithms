package code401challenges.tree;

import code401challenges.StacksAndQueues.Queue;

import java.util.LinkedList;

public class BreadthTraversal {
    public void breadthQueue(Node root){
        if(root == null){
            return;
        }
        Queue<Node>queueList = new Queue<Node>();
        queueList.add(root);
        while(queueList.isEmpty()){
            root = queueList.peek();
            System.out.println(root.value);
            if(root.leftChild != null){
                queueList.add(root.leftChild);
            }
            if(root.rightChild != null)
            {
                queueList.add(root.rightChild);
            }
            }
        }
    }

