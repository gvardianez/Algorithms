package lesson_7_graphs;

import java.util.LinkedList;

public class BreadthFirstPaths extends GraphPath {

    public BreadthFirstPaths(Graph g, int source) {
        this.source = source;
        marked = new boolean[g.getVertexCount()];
        edgeTo = new int[g.getVertexCount()];
        bfs(g, source);
    }

    private void bfs(Graph g, int source) {
        LinkedList<Integer> queue = new LinkedList<>();
        queue.addFirst(source);
        marked[source] = true;
        while (!queue.isEmpty()) {
            int vertex = queue.removeLast();
            for (int w : g.getAdjList(vertex)) {
                if (!marked[w]) {
                    marked[w] = true;
                    edgeTo[w] = vertex;
                    queue.addFirst(w);
                }
            }
        }
    }

}
