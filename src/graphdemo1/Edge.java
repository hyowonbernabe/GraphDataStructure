package graphdemo1;


/**
 * The Edge class represents an edge between two nodes in a graph.
 * It holds information about the start node, end node, weight of the edge,
 * and the unique identifier for the edge.
 */
public class Edge {


    // The start node of the edge
    private Node start;


    // The end node of the edge
    private Node end;


    // The weight of the edge
    private double weight;


    // The unique identifier for the edge
    private int id;


    /**
     * Gets the unique identifier for this edge.
     *
     * @return The edge's unique identifier.
     */
    public int getId() {
        return this.id;
    }


    /**
     * Gets the identifier of the start node of this edge.
     *
     * @return The start node's identifier.
     */
    public int getIdOfStartNode() {
        return this.start.getNodeId();
    }


    /**
     * Gets the end node of this edge.
     *
     * @return The end node of the edge.
     */
    public Node getEnd() {
        return this.end;
    }


    /**
     * Gets the identifier of the end node of this edge.
     *
     * @return The end node's identifier.
     */
    public int getIdOfEndNode() {
        return this.end.getNodeId();
    }


    /**
     * Gets the weight of this edge.
     *
     * @return The weight of the edge.
     */
    public double getWeight() {
        return this.weight;
    }


    /**
     * Constructs an Edge instance with the specified start node, end node, weight, and edge ID.
     *
     * @param s The start node of the edge.
     * @param e The end node of the edge.
     * @param w The weight of the edge.
     * @param id The unique identifier for the edge.
     */
    public Edge(Node s, Node e, double w, int id) {
        this.start = s;
        this.end = e;
        this.weight = w;
        this.id = id;
    }


    /**
     * Returns a string representation of this edge, showing the start and end nodes.
     *
     * @return A string representation of the edge in the form "(startNode, endNode)".
     */
    @Override
    public String toString() {
        return ("(" + start + "," + end + ")");
    }
}