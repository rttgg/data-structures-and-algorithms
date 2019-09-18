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

            if (node.left != null){
                inOrderHelper(node.left, value);
            }
            value.add(node.value);

            if (node.node != null){
                inOrderHelper(node.node, value);
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

            if (node.left != null){
                preOrderHelper(node.left, value);
            }
            if (node.node != null){
                preOrderHelper(node.node, value);
            }


        }

        //postOrder
        public ArrayList<T> postOrder(){
            ArrayList<T> value = new ArrayList<>();
            postOrderHelper(this.root, value);
            return value;
        }

        private void postOrderHelper(Node node, ArrayList value){

            if (node.left != null){
                postOrderHelper(node.left, value);
            }

            if (node.node != null){
                postOrderHelper(node.node, value);
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
                if (rootValue.left != null){
                    queueList.add(rootValue.left);
                }
                if (rootValue.node != null){
                    queueList.add(rootValue.node);
                }
            }
            return maxValue;
        }

       public void add(int i) {
       }

       public ArrayList inOrder() {
           return null;
       }

//       public <E> ArrayList<E> inOrder(Node root, ArrayList<E> es) {
//           return null;
//       }


//        public static void main(String[] args){
//            BinaryTree maxtree = new BinaryTree(15);
//
//            System.out.println(maxtree.findMaxValue());
//        }



    }

