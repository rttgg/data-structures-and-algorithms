package code401challenges.graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class GraphTest {

    Graph graphs;
    Graph routes;
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


    @Test
    public void getSize() {
        assertEquals(1, graphs.getSize());
        System.out.println(graphs.getSize());
    }

    @Test
    public void breadthFirstSearch(){

        Graph graph = new Graph();
        Node one = new Node<>(1);
        Node two = new Node<>(2);
        Node three = new Node<>(3);
        graph.addNode(one);
        graph.addNode(two);
        graph.addNode(three);

        LinkedList expected = new LinkedList<>();
        expected.add(1);
        expected.add(2);
        expected.add(3);


        graph.addEdge(one, two);
        graph.addEdge(one, three);
        graph.addEdge(one, two);

        one.addNeighbor(two);
        one.addNeighbor(three);


        assertEquals(expected, graph.breadthFirstSearch(one));


    }


    @Test
    public void depthFirstTest(){
        Graph graph = new Graph();
        Node one = new Node("one");
        Node two = new Node("two");
        Node three = new Node("three");
        graph.addNode(one);
        graph.addNode(three);
        graph.addNode(two);

        one.addNeighbor(two);
        one.addNeighbor(three);

        LinkedList<Node> expected = new LinkedList<>();
        expected.add(one);
        expected.add(three);
        expected.add(two);

        assertEquals(expected, graph.depthFirstSearch(one));
    }


}