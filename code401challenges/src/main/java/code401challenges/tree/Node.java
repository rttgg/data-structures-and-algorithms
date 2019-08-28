    package code401challenges.tree;

    public class Node<T> {

        public Node leftChild;
        // instance variables
        T value;

        Node rightChild;
        Node nextNode;

        // constructor
        public Node ( Node leftChild, Node rightChild,T value) {

            this.leftChild = leftChild;
            this.rightChild = rightChild;
            this.value = value;
            this.nextNode = null;
        }

        public Node (T value){

            this.leftChild = null;
            this.rightChild = null;
            this.value = value;
            this.nextNode = null;
        }

        public Node (){
        }


    }
