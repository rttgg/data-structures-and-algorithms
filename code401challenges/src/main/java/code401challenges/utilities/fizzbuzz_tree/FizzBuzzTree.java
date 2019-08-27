package code401challenges.utilities.fizzbuzz_tree;

//Write a function called FizzBuzzTree which takes a tree as an argument.
//the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
//If the value is divisible by 3, replace the value with “Fizz”
//If the value is divisible by 5, replace the value with “Buzz”
//If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
//Return the tree with its new values.
//Ensure your node values are of type Object, to hold either strings or integers.


import code401challenges.StacksAndQueues.Node;
import code401challenges.StacksAndQueues.Stack;
import com.sun.source.tree.BinaryTree;


public class FizzBuzzTree {
    public static BinaryTree fizzBuzzTree(BinaryTree fizzBuzzTree){
        Node<Object> root;
        root = (Node<Object>) fizzBuzzTree();
        if (root != null){
          Stack<Node> nodes = new Stack<>();
          nodes.push(root);

          while (!nodes.isEmpty()) {
              Node<Object> current = nodes.pop();
              if ((int)current.getData() % 15 == 0){
                  current.setData("FizzBuzz");
              }else if ((int)current.getData() % 3 == 0){
                  current.setData("Fizz");
              }else if ((int) current.getData() % 5 == 0){
                  current.setData("Buzz");
              }
              if (current.getRight() != null){
                  nodes.push(current.getRight());
              }
              if(current.getLeft() != null){
                  nodes.push(current.getLeft());
              }
          }
        }
      return fizzBuzzTree;
    }

    public static void main(String[] args){
        BinaryTree bt = new BinaryTree() {

        };
        };

        }


