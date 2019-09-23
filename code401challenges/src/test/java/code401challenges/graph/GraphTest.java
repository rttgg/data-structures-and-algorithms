package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class GraphTest {

    Graph graphs;
    @Before
    public void setUp(){
        graphs = new Graph();
        graphs.addNode(new Node("100"));
    }

    @Test
    public void addNode() {
        HashSet outcome = new HashSet();
        outcome.add("100");
        assertEquals(outcome.toString(), graphs.getNodes().toString());
        System.out.println(outcome);
    }

    @Test
    public void addEdge() {
        Node myFirstNode = new Node("100");
        Node mySecondNode = new Node("200");
        Node myThirdNode = new Node("not a number");
        graphs.addNode(myFirstNode);
        graphs.addNode(mySecondNode);
        graphs.addNode(myThirdNode);
        graphs.addEdge(myFirstNode, mySecondNode);
        graphs.addEdge(myFirstNode, myThirdNode);
        assertEquals(2, myFirstNode.neighbors.size());
        assertEquals(1, mySecondNode.neighbors.size());
        System.out.println(myFirstNode);
        System.out.println(mySecondNode);
        System.out.println(myThirdNode);
    }

//    @Test
//    public void getNodes() {
//    }
//
//    @Test
//    public void getNeighbors() {
//    }

    @Test
    public void getSize() {
        assertEquals(1, graphs.getSize());
        System.out.println(graphs.getSize());
    }
}