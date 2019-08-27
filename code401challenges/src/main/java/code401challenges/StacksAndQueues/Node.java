package code401challenges.StacksAndQueues;



//Create a Node class that has properties for the value stored in the Node,
// and a pointer to the next node.(T, and Node next;
public class Node<T> {
    public T value;
    public Node next;
    private Object data;
    private Node right;
    private Node left;

    //constructor
    public Node(T value, Node next){
        this.value = value;
        this.next = next;
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
