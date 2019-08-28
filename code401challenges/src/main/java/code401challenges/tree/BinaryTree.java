    package code401challenges.tree;

    import java.util.ArrayList;

    public class BinaryTree<T> {
        public Node root;

        public BinaryTree(Node root) {
            this.root = root;
        }

        public BinaryTree() {
            this.root = null;
        }


        //inOrder
        public ArrayList<T> inOrder(){
            ArrayList<T> value = new ArrayList<>();
            inOrderHelper(this.root, value);
            return value;
        }

        private void inOrderHelper(Node node, ArrayList value){

            if (node.leftChild != null){
                inOrderHelper(node.leftChild, value);
            }
            value.add(node.value);

            if (node.rightChild != null){
                inOrderHelper(node.rightChild, value);
            }
        }



        //preOrder
        public ArrayList<T> preOrder(){
            ArrayList<T> value = new ArrayList<>();
            preOrderHelper(this.root, value);
            return value;
        }

        private void preOrderHelper(Node node, ArrayList value){

            value.add(node.value);

            if (node.leftChild != null){
                preOrderHelper(node.leftChild, value);
            }
            if (node.rightChild != null){
                preOrderHelper(node.rightChild, value);
            }


        }

        //postOrder
        public ArrayList<T> postOrder(){
            ArrayList<T> value = new ArrayList<>();
            postOrderHelper(this.root, value);
            return value;
        }

        private void postOrderHelper(Node node, ArrayList value){

            if (node.leftChild != null){
                postOrderHelper(node.leftChild, value);
            }

            if (node.rightChild != null){
                postOrderHelper(node.rightChild, value);
            }

            value.add(node.value);
        }


        public static String arrayListToString(ArrayList list){

            String valueString = "";

            for (int i = 0; i < list.size(); i++){
                valueString += list.get(i);
            }
            return valueString;
        }

    }

