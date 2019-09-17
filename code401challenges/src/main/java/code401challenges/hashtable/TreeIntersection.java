package code401challenges.hashtable;

import code401challenges.tree.BinaryTree;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Stack;

public class TreeIntersection {
    public <E>ArrayList common(BinaryTree t1, BinaryTree t2){
        ArrayList<E> list1 = t1.inOrder(t1);
        ArrayList<E> list2 = t2.inOrder(t2);
        ArrayList<E> finallist = new ArrayList<>();

        for(int i=0; i < list1.size(); i++){
            if(list2.contains(list1.get(i))){
                finallist.add(list1.get(i));
            }
        }
        return finallist;
    }

    }



