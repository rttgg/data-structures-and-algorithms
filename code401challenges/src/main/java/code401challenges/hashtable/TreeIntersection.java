package code401challenges.hashtable;

import code401challenges.tree.BinaryTree;

import java.util.ArrayList;


public class TreeIntersection {
    public <E>ArrayList common(BinaryTree t1, BinaryTree t2){
        ArrayList tree1 = t1.inOrder();
        ArrayList tree2 = t2.inOrder();
        ArrayList<Object> finalTree = new ArrayList<>();

        for(int i=0; i < tree1.size(); i++){
            if(tree2.contains(tree1.get(i)))
                finalTree.add(tree1.get(i));

        }
        return finalTree;
    }

}



