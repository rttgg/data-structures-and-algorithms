package code401challenges.linkedlist;

public class Node<any> {
    public Node next;
    public any value;
    public int newData;

    public Node(any value, Node next){
        this.value = value;
        this.next = next;
    }

}
