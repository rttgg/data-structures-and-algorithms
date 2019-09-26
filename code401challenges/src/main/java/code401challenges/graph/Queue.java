package code401challenges.graph;

public class Queue<T> {

    Node<T> front;
    Node<T> rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(T value) {
        Node<T> newNode = new Node(value);
        if(this.front == null) {
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    public T dequeue() {
        Node<T> temp;
        if(this.front == null) {
            throw new NullPointerException("Queue is empty");
        } else {
            temp = this.front;
            this.front = this.front.next;
            temp.next = null;
        }
        return temp.getValue();
    }

    public T peek() {
        if(front == null) {
            throw new NullPointerException("Queue is empty");
        }
        return this.front.getValue();
    }

    public boolean isEmpty(){
        if(front == null){
            return true;
        }
        return false;
    }
}
