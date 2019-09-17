    package code401challenges.tree;

    import java.util.ArrayList;
    import java.util.LinkedList;
    import java.util.Queue;

   public class BinaryTree<T> {
        public Node root;

        public BinaryTree(Node root) {

            this.root = root;
        }

        public BinaryTree(int i) {

            this.root = new Node(i);
        }

       public BinaryTree() {

       }


       //inOrder
        public ArrayList<T> inOrder(BinaryTree binaryTree){
            ArrayList<T> value = new ArrayList<>();
            inOrderHelper(binaryTree.root, value);
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



        public int findMaxValue(){
            int maxValue = Integer.MIN_VALUE;


            Queue<Node> queueList = new LinkedList<>();

            queueList.add(this.root);
            while (!queueList.isEmpty()){
                Node rootValue = queueList.poll();
                if ((int) rootValue.value > maxValue){
                    maxValue = (int) rootValue.value;
                }
                if (rootValue.leftChild != null){
                    queueList.add(rootValue.leftChild);
                }
                if (rootValue.rightChild != null){
                    queueList.add(rootValue.rightChild);
                }
            }
            return maxValue;
        }

       public void add(int i) {
       }

       public ArrayList inOrder() {
           return null;
       }


//        public static void main(String[] args){
//            BinaryTree maxtree = new BinaryTree(15);
//
//            System.out.println(maxtree.findMaxValue());
//        }



    }

