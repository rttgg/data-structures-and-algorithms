    package code401challenges.tree;

    public class Node<T> {

        public Node left;
        public Node rightChild;
        // instance variables
        T value;

        Node node;
        Node nextNode;

        // constructor
        public Node ( Node leftChild, Node rightChild,T value) {

            this.left = leftChild;
            this.node = rightChild;
            this.value = value;
            this.nextNode = null;
        }

        public Node (T value){

            this.left = null;
            this.node = null;
            this.value = value;
            this.nextNode = null;
        }

        public Node (){
        }


    }
