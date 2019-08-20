package code401challenges.QueueWithStacks;

import code401challenges.StacksAndQueues.Stack;

//creating class of PseudoQueue and constructor
public class PseudoQueue<T> {
    Stack<T> stackOne = new Stack<>();
    Stack<T> stackTwo = new Stack<>();


    //add a new node
    public void enqueue(T value){

        if(stackOne.peek() == null){
            stackOne.push(value);
        }else {
            while (stackOne.peek() != null){
                stackTwo.push(stackOne.pop());
            }
            stackOne.push(value);
            while (stackTwo.peek() != null){
                stackOne.push(stackTwo.pop());
            }
        }
    }

    public T dequeue(){
        if(stackOne.peek() != null){
//            while(stackOne.peek() != null){
           return stackOne.pop();
//            }
            //return stackTwo.pop();
        }

        return null;
    }


}
