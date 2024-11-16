package graphdemo1;


import java.util.*;


/**
 * The Graph class represents a simple graph structure with nodes.
 * It supports operations to check for availability, create new nodes, and get the total number of nodes.
 */
public class Graph {


    // List of nodes in the graph
    private List<Node> nodes = new ArrayList<Node>();


    // The number of nodes in the graph
    private int numberOfNodes = 0;


    /**
     * Checks if the graph has more than one node.
     * This method is used in the TestGraph class.
     *
     * @return true if the graph has more than one node, false otherwise.
     */
    public boolean checkForAvailability() {
        return this.numberOfNodes > 1;
    }


    /**
     * Adds a new node to the graph.
     * The number of nodes in the graph is incremented by one after the node is added.
     *
     * @param node The node to be added to the graph.
     */
    public void createNode(Node node) {
        this.nodes.add(node);
        this.numberOfNodes++; // a node has been added
    }


    /**
     * Gets the current number of nodes in the graph.
     *
     * @return The total number of nodes in the graph.
     */
    public int getNUmberOfNodes() {
        return this.numberOfNodes;
    }
}