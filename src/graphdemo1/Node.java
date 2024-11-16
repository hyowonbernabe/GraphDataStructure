package graphdemo1;


import java.util.*;


/**
 * The Node class represents a node in a graph.
 * It contains an identifier and a list of edges (neighbours) connected to it.
 */
public class Node {


    // The unique identifier for the node
    private int id;


    // List of edges connected to this node (neighbours)
    private List<Edge> neighbours = new ArrayList<Edge>();


    /**
     * Gets the unique identifier for this node.
     *
     * @return The node's unique identifier.
     */
    public int getNodeId() {
        return this.id;
    }


    /**
     * Adds a new edge to the node's list of neighbours.
     * If the edge already exists in the list, a message is printed to indicate it.
     * Otherwise, the edge is added to the list and a success message is printed.
     *
     * @param e The edge to be added as a neighbour of the node.
     */
    public void addNeighbour(Edge e) {
        if (this.neighbours.contains(e)) {
            System.out.println("This edge has already been used for this node.");
        } else {
            System.out.println("Successfully added " + e);
            this.neighbours.add(e);
        }
    }


    /**
     * Prints the list of all edges connected to this node,
     * along with the IDs of the edge and the nodes connected by it.
     */
    public void getNeighbours() {
        System.out.println("List of all edges that node " + this.id + " has: ");
        System.out.println("================================================");
        for (int i = 0; i < this.neighbours.size(); i++) {
            System.out.println("ID of Edge: " + neighbours.get(i).getId() +
                    "\nID of the first node: " + neighbours.get(i).getIdOfStartNode() +
                    "\nID of the second node: " + neighbours.get(i).getIdOfEndNode());
            System.out.println();
        }
        System.out.println(neighbours);
    }


    /**
     * Constructs a new Node instance with the specified identifier.
     *
     * @param id The unique identifier for the node.
     */
    public Node(int id) {
        this.id = id;
    }


    /**
     * Returns a string representation of this node, which is its identifier.
     *
     * @return A string representing the node's identifier.
     */
    @Override
    public String toString() {
        return "" + id;
    }
}