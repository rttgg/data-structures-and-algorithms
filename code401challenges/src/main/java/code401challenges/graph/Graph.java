package code401challenges.graph;


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

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
        LinkedList resultList = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        if (head == null) {
            throw new NullPointerException("Cannot be null");
        }

        Queue queue = new LinkedList();
        queue.add(head);
        visited.add(head);

        while (!queue.isEmpty()) {
            Node tempNode = (Node) queue.remove();
            resultList.add(tempNode);

//                for(Edges neighbor: (HashSet<Edges>) tempNode.neighbors){
//                    if(!visited.contains(neighbor.node)){
//                        queue.add(neighbor.node);
//                        visited.add(neighbor.node);
//                    }
//                }
        }
        return resultList;
    }

    public static <Edges> LinkedList<Node> depthFirstSearch(Node head) {
        LinkedList result = new LinkedList();
        HashSet<Node> visited = new HashSet<>();

        Stack stack = new Stack();
        stack.push(head);
        visited.add(head);

        while (!stack.isEmpty()) {
            Node tempNode = (Node) stack.pop();
            result.add(tempNode);

//            for(Edges neighbor: (HashSet<Edges>) tempNode.neighbors){
//                if(!visited.contains(neighbor.node)){
//                    stack.push(neighbor.node);
//                    visited.add(neighbor.node);
//                }
//            }
        }
        return result;

    }

}