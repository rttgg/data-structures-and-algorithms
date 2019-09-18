    package code401challenges.tree;


    import java.util.ArrayList;

    //https://github.com/codefellows/seattle-java-401d5/blob/master/class-16/demo/Tree.java
    //https://www.baeldung.com/java-binary-tree
    //https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
    public class BinarySearchTree extends BinaryTree<Integer> {


        public BinarySearchTree() {
            super(15);
            this.root = null;
        }


        public void add(int valueToAdd){

            Node<Integer> nodeToAdd = new Node<>(valueToAdd);

            addHelper(this.root, nodeToAdd);

        }

        public void addHelper(Node<Integer> node, Node<Integer> nodeToAdd){

            if (nodeToAdd.value < node.value){

                if (node.left == null){
                    node.left = nodeToAdd;

                } else {
                    addHelper(node.left, nodeToAdd);
                }
            }

            if (nodeToAdd.value > node.value){
                if (node.node == null){
                    node.node = nodeToAdd;

                } else {
                    addHelper(node.node, nodeToAdd);
                }
            }

        }

        public boolean contains (int value){

            return this.containsHelper(this.root, value);
        }

        public boolean containsHelper(Node<Integer> node, int value){
            if (value == node.value){

                return true;
            } else if (value < node.value && node.left != null){

                return containsHelper(node.left, value);
            } else if (value > node.value && node.node != null){

                return containsHelper(node.node, value);
            }

            return false;
        }


        public static String arrayListToString(ArrayList list){
            String outputString = "";
            for (int i = 0; i < list.size(); i++){
                outputString +=  list.get(i)+ ", ";
            }
            return outputString;
        }

        }

