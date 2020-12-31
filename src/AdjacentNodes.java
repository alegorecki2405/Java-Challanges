public class AdjacentNodes {
//    Graphs can be directed or undirected. In a directed graph, each edge has a direction
//        whereas, in an undirected graph, edges do not have direction. The graph above is an
//    undirected graph.Two nodes in a graph are adjacent if there is an edge between them. In the above example,
//    nodes 0 and 1 are adjacent, but 0 and 2 are not adjacent.We can encode graphs using an adjacency matrix. An adjacency matrix for a graph with "n"
//    nodes is an "n * n" matrix where the entry at row "i" and column "j" is a 0 if nodes "i" and "j"
//    are not adjacent, and 1 if nodes "i" and "j" are adjacent.
    public static boolean adjacent(int[][] graph, int node1, int node2) {
        if(node1 == node2) {
            return false;
        }
        return graph[node1][node2] == 1;
    }
}
