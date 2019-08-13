package linkedList;

public class Node<any> {
    public Node next;
    public any value;


    public Node(any value, Node next){
        this.value = value;
        this.next = next;
    }

}

