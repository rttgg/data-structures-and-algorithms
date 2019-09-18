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
            rootNode.left = leftNode;
            rootNode.node = rightNode;


            assertEquals(10, testTree.root.value);
            assertEquals(20, testTree.root.left.value);
            assertEquals(30, testTree.root.node.value);
        }

        @Test public void testInOrder(){
            BinaryTree<Integer> testTree = new BinaryTree<>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            testTree.root = rootNode;
            rootNode.left = leftNode;
            rootNode.node = rightNode;

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
            rootNode.left = leftNode;
            rootNode.node = rightNode;
            leftNode.left = leftLeftNode;
            leftNode.node = leftrightNode;

            String output = BinaryTree.arrayListToString(testTree.preOrder());

            assertEquals("1020405030", output);

        }



        @Test public void testPostInOrder(){
            BinaryTree<Integer> testTree = new BinaryTree<Integer>(15);
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            testTree.root = rootNode;
            rootNode.left = leftNode;
            rootNode.node = rightNode;

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
            rootNode.left = leftNode;
            rootNode.node = rightNode;

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
            maxtree.root.left = left;
            maxtree.root.node = right;
            maxtree.root.left.node = newRight;
            maxtree.root.left.node.left = new Node(7);
            maxtree.root.left.node.left = new Node(1);
            maxtree.root.left.left = newLeft;

            maxtree.root.node.node = new Node(4);
            maxtree.root.node.node.node = new Node(10);

            int maxValue = maxtree.findMaxValue();

            assertEquals("Max value at leaf level", 20, maxValue);
        }
    }