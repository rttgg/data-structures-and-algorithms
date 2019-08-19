package code401challenges.linkedlist;

// Linked List Class
public class LinkedList<any> {
    // reference to the head node
    Node head;

    //INSERT
    // insert a new node at the front of the list, returns inserted node
    public void insert(any newData) {
        //allocate the node and put in the data
        Node newNode = new Node(newData, head);

        head = newNode;
    }
    //APPEND
    // append a new node at the end not for this lab
    public void append ( any newData){
        // allocate the node and put in the data, set next as null
        Node newNode = new Node(newData, null);
        //if the linked list is empty, then make the new node as head
        if (head == null) {
            head = newNode;
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

    // BEFOREINSERTING
    //insert a new node before the given prev-node
    public void insertBefore (any target, any value){
        Node<any>current = head;
        if (current == null) {
            System.out.println("prevNode cannot be null");
            return;
        }
        if(current.value.equals(target)) {
            this.insert(value);
            return;
        }
        while (current != null) {
            if (current.next.value.equals(target)) {
                break;
            } else {
                current = current.next;
            }
            Node<any> newValue = new Node<>(value, current.next);
            current.next = newValue;

        }
    }

    // INSERTAFTER
    //insert a new node after the given prev-node
    public void insertAfter (any target, any value){
        //check if the given node is null
        Node<any>current = head;
        if (current == null) {
            System.out.println("prevNode cannot be null");
            return;
        }
        if(current.value.equals(target)) {
            this.insert(value);
            return;
        }
        while (current != null) {
            if (current.value.equals(target)) {
                break;
            } else {
                Node<any> newValue = new Node<>(value, current.next);
                current.next = newValue;
            }

        }
    }
    // INCLUDES BOOLEAN
    public <any> boolean includes(any findThisValue){
        boolean exist = false;
        Node currentNode = this.head;
        // until we hit the end of the list
        while(currentNode != null){
            //if we have found the value here, then yes! definitely included!
            if(currentNode.value == findThisValue){
                exist = true;
                break;
            }
            currentNode = currentNode.next;
        }
        //we checked all of the nodes, return if it exist/true
        return exist;
    }


    //RETURN THE K VALUE
    public any kthFrontEnd(int k) {
        Node<any>current = head;
        int count = 0;
//                  if (k < 0){
//                        return Exception;
//                  }
        //count the number of nodes in Linked List
        while (current != null) {
            count++;
            current = current.next;
        }
        current = head;
        int index = (count - k) - 1;
        for (int i = 0; i <= index; i++) {
            if (i == index){
                return current.value;
            }
            current = current.next;

        }
        return (any)"Exception";
    }

    // TO STRING
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




    //Merge two linked list
    public static LinkedList mergeLists(LinkedList list1, LinkedList list2){
        // Node current = list1.head;
        Node current1 = list1.head;
        Node current2 = list2.head;
        Node runner1 = current1.next;
        Node runner2 = current2.next;

        while ( runner1 != null && runner2 != null) {
            current1.next = current2;
            current1 = current1.next;
            current2 = current2.next;
            current1.next = runner1;
            current1 = current1.next;
            runner1 = current1.next;
            runner2 = current2.next;
        }
        if(runner1 == null && runner2 != null){
            current1.next = current2;
        } else {
            current1.next = current2;
            current1 = current1.next;
            current2 = current2.next;
            current1.next = runner1;

        }
        return list1;

    }

}
