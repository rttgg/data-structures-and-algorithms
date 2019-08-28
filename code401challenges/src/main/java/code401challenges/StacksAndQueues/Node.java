package code401challenges.StacksAndQueues;



//Create a Node class that has properties for the value stored in the Node,
// and a pointer to the next node.(T, and Node next;
public class Node<T> extends code401challenges.tree.Node {
    public T value;
    public Node next;
    public Node<T> leftChild;
    public Node<T> rightChild;
    private Object data;
    public Node right;
    public Node left;

    //constructor
    public Node(T value, Node next){
        this.value = value;
        this.next = next;
    }

    public Node(T i) {

    }

    public Object getData() {
        return data;
    }

    public void setData(T fizzBuzz) {

    }

    public Node getRight() {
        return right;
    }

    public Node getLeft() {
        return left;
    }
}
