package code401challenges.tree;


//https://www.baeldung.com/java-binary-tree
//https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
public class BinarySearchTree<node> {
    public Node node;


    public void add(int value) {
        node = addRecursive(node, value);

    }

    private Node addRecursive(Node node, int value) {
        if (node == null) {
            node = new Node(value);

        }
        if (value < node.value) {
            node.leftChild = addRecursive(node.leftChild, value);

        }
        else if (value < node.value) {
            node.rightChild = addRecursive(node.rightChild, value);

        }
        else {
            return node;
        }
        return node;
    }


    //returns a boolean indicating whether or not the value is in the tree at least once
        public boolean contains( int value){
            return containsRecursive(node, value);
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

