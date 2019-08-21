package code401challenges.utilities;

import code401challenges.StacksAndQueues.Node;

public class AnimalShelter <T> {

    Node<T> front;
    Node<T> rear;

    //creating constructor
    public AnimalShelter(){
        this.front = null;
        this.rear = null;
    }

    // add a new node with the specified value to the back of the queue
    public void enqueue(T value){
        Node newNode = new Node(value, null);
        if(this.front == null){
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }

    //Removes the node from the front of the queue, and returns that node's value
    public Object dequeue(String whatKindOfPet){
        Node previous = this.front;
        Node current = this.front;
        while (current != null){
            if (current.value.toString() == whatKindOfPet) {
                //points front and rear to null if nothing else is in the queue
                if(current == previous && current.next == null){
                    this.front = null;
                    this.rear = null;
                    //points front to the next node if the first node is being removed
                } else if (current == previous && current.next != null){
                    this.front = this.front.next;
                    // points rear to the previous node if the last node is being removed
                } else if (current == this.rear){
                    this.rear = previous;
                }
                if (current != previous){
                    previous.next = previous.next.next;
                }
                return current.value;
            }
            // keeps previous one node behind current
            if (previous != current){
                previous = previous.next;
            }
            current = current.next;

        }
        return null;
    }

    // returns the value of the node located in the front of the queue
    public T peek() {
//        return this.front != null ? this.front.value : null;
        if(this.front != null) {
            return this.front.value = null;

        }
        return null;
    }
}
