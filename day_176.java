
public class FloydWarshall {
    static int INF = 99999;

    // wrong output coming, need to work in it

    public static void floydShortestPath(int vertices, int[][] graph) {
        int[][] dist = new int[vertices][vertices];

        // Initialize the distance array with the initial graph values
        for (int r = 0; r < vertices; r++) {
            for (int c = 0; c < vertices; c++) {
                dist[r][c] = graph[r][c];
            }
        }

        // Core of Floyd-Warshall algorithm with additional checks
        for (int k = 0; k < vertices; k++) {
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < vertices; j++) {
                    // Ensure that we are not adding distances from or to an unreachable node
                    if (dist[i][k] != INF && dist[k][j] != INF) {
                        dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                    }
                }
            }
        }

        printAll(dist, vertices);
    }

    // Print the resulting shortest path matrix
    public static void printAll(int[][] graph, int vertices) {
        for (int r = 0; r < vertices; r++) {
            for (int c = 0; c < vertices; c++) {
                if (graph[r][c] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(graph[r][c] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int vertices = 5;
        int[][] graph = {
            {0, 1, 1, INF, 3},
            {INF, 0, INF, INF, INF},
            {INF, INF, 0, 0, 0},
            {INF, 2, INF, 0, INF},
            {INF, INF, INF, 0, 0}
        };
        floydShortestPath(vertices, graph);
    }
}
