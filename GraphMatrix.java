public class adjacencyMatrixx {
    private int[][] adjacencyMatrixx;
    private int numVertices;

    public adjacencyMatrixx(int numVertices) {
        this.numVertices = numVertices;
        adjacencyMatrixx = new int[numVertices][numVertices];
    }

    public void addEdge(int source, int destination) {
        adjacencyMatrixx[source][destination] = 1;
        adjacencyMatrixx[destination][source] = 1;
    }

    public void printMatrix() {
        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(adjacencyMatrixx[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjacencyMatrixx graph = new adjacencyMatrixx(12);

        graph.addEdge(0, 1);   // A-B
        graph.addEdge(0, 7);   // A-H
        graph.addEdge(1, 2);   // B-C
        graph.addEdge(1, 3);   // B-D
        graph.addEdge(1, 10);  // B-K
        graph.addEdge(2, 8);   // C-I
        graph.addEdge(3, 4);   // D-E
        graph.addEdge(3, 7);   // D-H
        graph.addEdge(3, 10);  // D-K
        graph.addEdge(4, 6);   // E-G
        graph.addEdge(5, 6);   // F-G
        graph.addEdge(5, 8);   // F-I
        graph.addEdge(6, 9);   // G-J
        graph.addEdge(7, 11);  // H-L
        graph.addEdge(8, 9);   // I-J
        graph.addEdge(8, 10);  // I-K

        System.out.println("Adjacency Matrix:");
        graph.printMatrix();
    }
}