###Code Challenge

* Implement your own Graph. The graph should be represented as an adjacency list,
 and should include the following methods:
 
 ###Code Method
 
 1) AddNode()
    Adds a new node to the graph
    Takes in the value of that node
    Returns the added node
    
 2) AddEdge()
    Adds a new edge between two nodes in the graph
    Include the ability to have a “weight”
    Takes in the two nodes to be connected by the edge
    Both nodes should already be in the Graph
    
 3) GetNodes()
    Returns all of the nodes in the graph as a collection (set, list, or similar)
    
 4) GetNeighbors()
    Returns a collection of nodes connected to the given node
    Takes in a given node
     Include the weight of the connection in the returned collection
 5) Size()
    Returns the total number of nodes in the graph
    
 ### Approach & Efficiency  
 
 * Node can be successfully added to the graph
 * An edge can be successfully added to the graph
 * A collection of all nodes can be properly retrieved from the graph
 * All appropriate neighbors can be retrieved from the graph
 * Neighbors are returned with the weight between nodes included
 * The proper size is returned, representing the number of nodes in the graph
 * A graph with only one node and edge can be properly returned
 * An empty graph properly returns null 
 
 * [Graph](../src/main/java/code401challenges/graph/Graph.java)
 * [GraphTest](../src/test/java/code401challenges/graph/GraphTest.java)
