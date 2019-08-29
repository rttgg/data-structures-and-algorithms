    package code401challenges.tree;



    import org.junit.Test;

    import static org.junit.Assert.*;





    public class BinaryTreeTest {
        @Test public void testForEmptyTree(){
            BinaryTree<Integer> emtpyTree = new BinaryTree<>(15);
            assertNotNull(emtpyTree);
        }

        @Test public void testAdd(){
            BinaryTree<Integer> testTree = new BinaryTree<>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);

            testTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;


            assertEquals(10, testTree.root.value);
            assertEquals(20, testTree.root.leftChild.value);
            assertEquals(30, testTree.root.rightChild.value);
        }

        @Test public void testInOrder(){
            BinaryTree<Integer> testTree = new BinaryTree<>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            testTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;

            String output = BinaryTree.arrayListToString(testTree.inOrder());

            assertEquals("201030", output);
        }

        @Test public void testPreOrder(){
            BinaryTree<Integer> testTree = new BinaryTree<Integer>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            Node<Integer> leftLeftNode = new Node<>(40);
            Node<Integer> leftrightNode = new Node<>(50);
            testTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;
            leftNode.leftChild = leftLeftNode;
            leftNode.rightChild = leftrightNode;

            String output = BinaryTree.arrayListToString(testTree.preOrder());

            assertEquals("1020405030", output);

        }



        @Test public void testPostInOrder(){
            BinaryTree<Integer> testTree = new BinaryTree<Integer>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            testTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;

            String output = BinaryTree.arrayListToString(testTree.postOrder());

            assertEquals("203010", output);
        }



        @Test
        public void findMaxValue() {
           // Queue<Node> node =new LinkedList<>();
            //LinkedList<Integer>testTree = new LinkedList<>();
            BinaryTree<Integer> testTree = new BinaryTree<>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            testTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;

           String output = BinaryTree.arrayListToString(testTree.inOrder());




            //assertEquals("30", output);
            assertEquals(30, output);
        }


        @Test
        public void testMaximumAtRoot() {
            BinaryTree maxtree = new BinaryTree(new Node(20));
            Node right = new Node(10);
            Node left = new Node(3);
            Node newRight = new Node(12);
            Node newLeft = new Node(12);
            maxtree.root.leftChild = left;
            maxtree.root.rightChild = right;
            maxtree.root.leftChild.rightChild = newRight;
            maxtree.root.leftChild.rightChild.leftChild = new Node(7);
            maxtree.root.leftChild.rightChild.leftChild = new Node(1);
            maxtree.root.leftChild.leftChild = newLeft;

            maxtree.root.rightChild.rightChild = new Node(4);
            maxtree.root.rightChild.rightChild.rightChild = new Node(10);

            int maxValue = maxtree.findMaxValue();

            assertEquals("Max value at leaf level", 20, maxValue);
        }
    }