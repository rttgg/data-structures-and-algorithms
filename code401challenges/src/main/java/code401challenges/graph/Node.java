package code401challenges.graph;

import java.util.HashSet;

public class Node<T> {
    //instance variables
    public T value;
    public HashSet<Edge> neighbors;


    //constructor
    public Node(T value){
        this.value = value;
        this.neighbors = new HashSet<>();
    }

    public void addNeighbor(Node<T> node){
        Edge e = new Edge(node);
        this.neighbors.add(e);
    }

    public void addNeighbor(Node<T> node, int weight){
        Edge e = new Edge(node, weight);
        this.neighbors.add(e);
    }

    public String toString(){
        return this.value.toString();
    }
}