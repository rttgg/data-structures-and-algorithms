package code401challenges.utilities.fizzbuzz_tree;

//Write a function called FizzBuzzTree which takes a tree as an argument.
//the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
//If the value is divisible by 3, replace the value with “Fizz”
//If the value is divisible by 5, replace the value with “Buzz”
//If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
//Return the tree with its new values.
//Ensure your node values are of type Object, to hold either strings or integers.



//https://github.com/codefellows/seattle-java-401d5/blob/master/class-16/demo/Tree.java

import code401challenges.StacksAndQueues.Node;
import code401challenges.tree.BinaryTree;

public class FizzBuzzTree {
    public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> treeToFizzBuzz) {

        return treeToFizzBuzz;
    }

    public static void fizzBuzzTreeHelper(Node<Object> node) {


        if (node.leftChild != null) {
            fizzBuzzTreeHelper(node.leftChild);
        }

        node.value = changeToFizzBuzz((Integer) node.value);


        if (node.rightChild != null) {
            fizzBuzzTreeHelper(node.rightChild);
        }
    }


    public static Object changeToFizzBuzz(int value) {
        if (value % 3 == 0 && value % 5 == 0) {
            return "FizzBuzz";
        } else if (value % 3 == 0) {
            return "Fizz";
        } else if (value % 5 == 0) {
            return "Buzz";
        }
        return value;
    }
}
