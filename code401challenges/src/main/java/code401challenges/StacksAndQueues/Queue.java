package code401challenges.StacksAndQueues;



//This object should be aware of a default empty value assigned to front when the queue is created.
//        Define a method called enqueue which takes any value as an argument and adds a new node
//        with that value to the back of the queue with an O(1) Time performance.
//        Define a method called dequeue that does not take any argument, removes the node from the
//        front of the queue, and returns the node’s value.
//        Define a method called peek that does not take an argument and returns the value of the node
//        located in the front of the queue, without removing it from the queue.



public class Queue<T> implements Information {
    //Instance properties
    protected Node<T> front;
    protected Node<T> rear;


    //constructor
    public Queue(){
        this.front = null;
        this.rear = null;
    }


    //Define a method called enqueue which takes any value as an argument and adds a new node

    public void enqueue(T value){
        Node newNode = new Node(value, null);
        if (this.front == null){
            this.front = newNode;
            this.rear = newNode;
        } else {
            this.rear.next = newNode;
            this.rear = newNode;
        }
    }


  //  Define a method called dequeue that does not take any argument, removes the node from the
//     front of the queue, and returns the node’s value.

    public T dequeue(){
      if(this.front == null){
          return null;
      } else {
          T frontNodeValue = this.front.value;
          this.front = this.front.next;
          if (this.front == null){
              this.rear = null;
          }
          return frontNodeValue;
      }
    }

    //Returns the value of the node located in the front of the queue
    public T peek(){
        return this.front != null ? this.front.value : null;
    }

}
