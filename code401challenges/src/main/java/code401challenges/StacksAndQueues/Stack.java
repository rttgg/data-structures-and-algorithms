package code401challenges.StacksAndQueues;



//Create a Stack class that has a top property. It creates an empty Stack when instantiated.
//        This object should be aware of a default empty value assigned to top when the stack is created.
//        Define a method called push which takes any value as an argument and adds a new node with that
//        value to the top of the stack with an O(1) Time performance.
//        Define a method called pop that does not take any argument, removes the node from the top of
//        the stack, and returns the node’s value.
//        Define a method called peek that does not take an argument and returns the value of the node
//        located on top of the stack, without removing it from the stack.
public class Stack<T> implements Information{
    //instance properties
    protected Node<T>top;

    //constructor
    public Stack() {
        this.top = null;
    }

    //add push method to add a new node with that value to the top of the stack
    public void push(T value){
        Node newNode = new Node(value, this.top);
        this.top = newNode;
    }
    //add pop method to remove the node from the top of the stack and returns the node's value
    public T pop(){
        T topNodeValue = this.top.value;
        this.top = this.top.next;
        return topNodeValue;
    }

   // add peek method that returns the value of the node located on top of the stack w/out removing it
   // from the stack
    public T peek(){
        return this.top !=null ? this.top.value : null;
//        if(this.top !=null){
//            return this.top.value = null;
//        }
//        return null;
    }
    }


