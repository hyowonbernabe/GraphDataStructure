package graphdemo1;


public class TestGraph {
    public static void main(String[] args) {
        Graph graph = new Graph();
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        graph.createNode(node1);
        graph.createNode(node2);
        graph.createNode(node3);
        Edge e12 = new Edge(node1, node2, 5, 1);
        Edge e13 = new Edge(node1, node3, 10, 2);


        if (graph.checkForAvailability()) {
            // two nodes can be connected via edge
            node1.addNeighbour(e12); // connect 1 and 2 (nodes)
            node2.addNeighbour(e13);
            node1.getNeighbours();
        } else {
            System.out.println("There are less than 2 nodes. Add more to connect");
        }
    }
}


/*


SAMPLE OUTPUT:


Successfully added(1,2)
Successfully added(1,3)
List of all edges that node1 has:
================================================
ID of Edge: 1
ID of the first node: 1
ID of the second node: 2


ID of Edge: 2
ID of the first node: 1
ID of the second node: 3


[(1,2), (1,3)]


Process finished with exit code 0


*/