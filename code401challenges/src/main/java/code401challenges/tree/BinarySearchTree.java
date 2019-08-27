package code401challenges.tree;


//https://www.baeldung.com/java-binary-tree
//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
public class BinarySearchTree<node> {
    public Node root;


    public void add(int value) {
        root = addRecursive(root, value);

    }

    private Node addRecursive(Node current, int value) {
        if (current == null) {
            return new Node(value);

        }
        if (value < current.value) {
            current.leftChild = addRecursive(current.leftChild, value);

        }
        else if (value < current.value) {
            current.rightChild = addRecursive(current.rightChild, value);

        }
        else {
            return current;
        }
        return current;
    }


    //returns a boolean indicating whether or not the value is in the tree at least once
        public boolean contains( int value){
            return containsRecursive(root, value);
        }





    private boolean containsRecursive(Node node, int value) {
        boolean trueFalse;
        if (node == null) {
            return false;
        } if (node.value == value) {
            return true;
        } if (value < node.value){
            trueFalse = containsRecursive(node.leftChild, value);
        } else {
            trueFalse = containsRecursive(node.rightChild, value);
        }
        return trueFalse;
    }

    }

