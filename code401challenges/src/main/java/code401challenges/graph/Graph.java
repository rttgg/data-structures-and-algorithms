package code401challenges.graph;


import java.util.*;

public class Graph<T> {
    //instance variables
    private HashSet<Node<T>> vertices;

    public void setVertices(HashSet<Node<T>> vertices) {
        this.vertices = vertices;
    }

    public HashSet<Node<T>> getVertices() {
        return vertices;
    }

    //constructor
    public Graph() {

        this.vertices = new HashSet<>();
    }

    //addNode()

    public Node<T> addNode(Node node) {
        this.vertices.add(node);
        return node;
    }


    //addEdge()
    public void addEdge(Node<T> nodeOne, Node<T> nodeTwo) {
        if (this.vertices.contains(nodeOne) && this.vertices.contains(nodeTwo)) {
            nodeOne.addNeighbor(nodeTwo);
            nodeTwo.addNeighbor(nodeOne);

        }

    }

    public void addEdge(Node<T> nodeOne, Node<T> nodeTwo, int weight) {
        if (this.vertices.contains(nodeOne) && this.vertices.contains(nodeTwo)) {
            nodeOne.addNeighbor(nodeTwo, weight);
            nodeTwo.addNeighbor(nodeOne, weight);

        }

    }

    public HashSet<Node<T>> getNodes() {

        return this.vertices;
    }

    public HashSet<Edge> getNeighbors(Node<T> node) {

        return node.neighbors;
    }

    public int getSize() {

        return this.vertices.size();
    }

    public static LinkedList<Node> breadthFirstSearch(Node head) {
        LinkedList resultList = new LinkedList<>();
        HashSet<Node> visited = new HashSet<>();
        Queue<Node> breadth = new Queue<>();


        if (head == null) {
            throw new NullPointerException("Cannot be null");
        }

        breadth.enqueue(head);
        visited.add(head);

//        Queue queue = new LinkedList();
//        breadth.enqueue(head);
//        queue.add(head);
//        visited.add(head);

        while (!breadth.isEmpty()) {
            Node tempNode = breadth.dequeue();
            resultList.add(tempNode);

            for (Edge neighbor : (HashSet<Edge>) tempNode.neighbors) {
                if (!visited.contains(neighbor.getNode())) {
                    breadth.enqueue(neighbor.getNode());
                    visited.add(neighbor.getNode());
                }
            }
        }
        return resultList;
    }

    public static HashMap<Boolean, Integer> getEdge(Graph routes, String[] cityNames) {
        HashMap<Boolean, Integer> result = new HashMap<>();
        int cost = 0;
        boolean b = false;
        Node current;
        for (Object n : routes.vertices) {
            if (cityNames[0].equals(n)) {
                current = (Node) n;
            }
        }
        System.out.println(routes.vertices);
        result.put(b, cost);
        return result;

}


    public static LinkedList<Node> depthFirstSearch(Node head) {
        LinkedList result = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        Stack stack = new Stack();
        stack.push(head);
        visited.add(head);

        while (!stack.isEmpty()) {
            Node tempNode = (Node) stack.pop();
            result.add(tempNode);

            for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
                if(!visited.contains(neighbor.getNode())){
                    stack.push(neighbor.getNode());
                    visited.add(neighbor.getNode());
                }
            }
        }
        return result;

    }

    public LinkedList breadthFirst(Node node1) {
        return null;
    }

//    public LinkedList<Node> depthFirst(Node yo) {
//        return null;
//    }
}