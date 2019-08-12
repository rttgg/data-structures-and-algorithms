package linkedList;


//Questions
//q1 Create a Node class that has properties for the value stored in the node and pointer to the next node
//q2 In the LinkedList class include a head property. Upon instantiation, an empty Linked List should be created
        // define a method called insert which takes any value as an argument and adds a new node with that value to the
         // ..head of the list with
        // Define a method called includes which takes any value as an argument and returns a boolean
            //result depending on weather that value exists as a Node's value
        // define a method called toString which takes in no arguments and returns a string representing all the values in the Linked List

// Linked List Class
public class LinkedList<any> {
    // reference to the head node
    Node head;

    // insert a new node at the front of the list, returns inserted node
    public void insert(any newData) {
        //allocate the node and put in the data
        Node newNode = new Node(newData);
        //make next of new node as head
        newNode.next = head;
        //move the head to point to new node
        head = newNode;
    }
    //insert a new node after the given prev-node and not for this lab
        public void insertAfter (Node prevNode,any newData){
        //check if the given node is null
            if (prevNode == null) {
                System.out.println("prevNode cannot be null");
                return;
            }
            //allocate the node and put in the data
            Node newNode = new Node(newData);
            //make next of new node as next of prevNode
            newNode.next = prevNode.next;
            //make next of prevNode as newNode
            prevNode.next = newNode;
        }

        // append a new node at the end not for this lab
        public void append ( any newData){
        // allocate the node and put in the data, set next as null
            Node newNode = new Node(newData);
            //if the linked list is empty, then make the new node as head
            if (head == null) {
                head = new Node(newData);
                return;
            }
            // this new node is going to be the last node so make next of it as null

            //else traverse till the last node not for this lab
            Node last = head;
            while (last.next != null)
                last = last.next;
            // change the next of last node
            last.next = newNode;
            return;
        }

        public <any> boolean includes(any findThisValue){
        boolean exist = false;
        Node currentNode = this.head;

        while(currentNode != null){
            if(currentNode.value == findThisValue){
                exist = true;
                break;
            }
            currentNode = currentNode.next;
        }
        return exist;
        }


       public String toString() {
            String result = "";
           Node current = head;
            while (current != null){
                result += current.value;
                if(current.next != null){
                    result += ", ";
                }
                current = current.next;
            }
            return "List: " + result;
        }


}


