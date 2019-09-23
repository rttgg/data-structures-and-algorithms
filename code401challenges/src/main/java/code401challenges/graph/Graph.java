package code401challenges.graph;


import java.util.HashSet;

    public class Graph<T> {
        //instance variables
        private HashSet<Node<T>> vertices;


        //constructor
        public Graph(){
            this.vertices = new HashSet<>();
        }

        //addNode()

        public Node<T> addNode(Node node){
            this.vertices.add(node);
            return node;
        }


        //addEdge()
        public void addEdge(Node<T> nodeOne, Node<T> nodeTwo){
            if(this.vertices.contains(nodeOne) && this.vertices.contains(nodeTwo)){
                nodeOne.addNeighbor(nodeTwo);
                nodeTwo.addNeighbor(nodeOne);
            }
        }

        public HashSet<Node<T>> getNodes() {
            return this.vertices;
        }

        public HashSet<Edge> getNeighbors(Node<T> node){
            return node.neighbors;
        }

        public int getSize(){
            return this.vertices.size();
        }

    }

