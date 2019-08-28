    package code401challenges.tree;

    import org.junit.Test;

    import static org.junit.Assert.*;

    public class BinarySearchTreeTest {

        @Test
        public void testAdd(){
            BinarySearchTree testBinaryTree = new BinarySearchTree();
            Node<Integer> rootNode = new Node<>(50);
            Node<Integer> leftNode = new Node<>(20);
            Node<Integer> rightNode = new Node<>(80);
            Node<Integer> leftRightNode = new Node<>(60);
            Node<Integer> rightRightNode = new Node<>(90);
            testBinaryTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;
            leftNode.rightChild = leftRightNode;
            rightNode.rightChild = rightRightNode;

            testBinaryTree.add(2);
            assertEquals("2, 20, 60, 50, 80, 90, ", BinarySearchTree.arrayListToString(testBinaryTree.inOrder()));
            testBinaryTree.add(9);
            assertEquals("2, 9, 20, 60, 50, 80, 90, ", BinarySearchTree.arrayListToString(testBinaryTree.inOrder()));
            testBinaryTree.add(100);
            System.out.println(BinarySearchTree.arrayListToString(testBinaryTree.inOrder()));
            assertEquals("2, 9, 20, 60, 50, 80, 90, 100, ", BinarySearchTree.arrayListToString(testBinaryTree.inOrder()));


        }

        @Test
        public void testContains(){
            BinarySearchTree testBinaryTree = new BinarySearchTree();
            Node<Integer> rootNode = new Node<>(50);
            Node<Integer> leftNode = new Node<>(25);
            Node<Integer> rightNode = new Node<>(75);
            Node<Integer> leftRightNode = new Node<>(40);
            Node<Integer> rightRightNode = new Node<>(90);
            testBinaryTree.root = rootNode;
            rootNode.leftChild = leftNode;
            rootNode.rightChild = rightNode;
            leftNode.rightChild = leftRightNode;
            rightNode.rightChild = rightRightNode;

            assertFalse(testBinaryTree.contains(20));
            assertTrue(testBinaryTree.contains(75));
            assertTrue(testBinaryTree.contains(90));


        }

        }


