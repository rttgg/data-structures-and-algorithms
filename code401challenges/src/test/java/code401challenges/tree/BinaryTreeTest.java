    package code401challenges.tree;



    import org.junit.Test;
    import static org.junit.Assert.*;





    public class BinaryTreeTest {
        @Test public void testForEmptyTree(){
            BinaryTree<Integer> emtpyTree = new BinaryTree<>();
            assertNotNull(emtpyTree);
        }

        @Test public void testAdd(){
            BinaryTree<Integer> testTree = new BinaryTree<>();
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
            BinaryTree<Integer> testTree = new BinaryTree<>();
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
            BinaryTree<Integer> testTree = new BinaryTree<Integer>();
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
            BinaryTree<Integer> testTree = new BinaryTree<Integer>();
            Node<Integer> rootNode = new Node<>(10);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(30);
            testTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;

            String output = BinaryTree.arrayListToString(testTree.postOrder());

            assertEquals("203010", output);
        }



    }