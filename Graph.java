import java.util.*;

public class Graph {

    private int vertices;
    private LinkedList<Integer>[] adjacencyList;

    // Constructor
    Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    // Add Edge
    void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
        adjacencyList[destination].add(source); // Undirected Graph
    }

    // Print Graph
    void printGraph() {
        System.out.println("Adjacency List:");

        for (int i = 0; i < vertices; i++) {
            System.out.print(i + " -> ");

            for (Integer vertex : adjacencyList[i]) {
                System.out.print(vertex + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(4);

        graph.addEdge(0, 1);
        graph.addEdge(0, 2);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);

        graph.printGraph();
    }
}