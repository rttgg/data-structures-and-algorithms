package code401challenges.tree;

import code401challenges.StacksAndQueues.Queue;

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
            if(root.left != null){
                queueList.add(root.left);
            }
            if(root.node != null)
            {
                queueList.add(root.node);
            }
            }
        }
    }

