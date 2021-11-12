package lesson_7_graphs;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 1);
        graph.addEdge(0, 3);
        graph.addEdge(1, 3);
        graph.addEdge(1, 6);
        graph.addEdge(0, 2);
        graph.addEdge(3, 5);
        graph.addEdge(5, 6);
        graph.addEdge(5, 7);
        graph.addEdge(7, 8);
        graph.addEdge(7, 9);
        GraphPath graphPath = new BreadthFirstPaths(graph, 0);
        GraphPath graphPathTwo = new DepthFirstPaths(graph, 0);
        LinkedList<Integer> pathOne = pathTo(graphPath, 9);
        LinkedList<Integer> pathTwo = pathTo(graphPathTwo, 9);
        System.out.println(pathOne);
        System.out.println(pathTwo);
        System.out.println(graph);
        System.out.println("Длина пути:" + pathOne.size());
    }

    public static LinkedList<Integer> pathTo(GraphPath graphPath, int dist) {
        return graphPath.pathTo(dist);
    }

    //Консоль
//    [3, 5, 7, 9]
//    [1, 3, 5, 7, 9]
//    0->[1, 3, 2]
//    1->[0, 3, 6]
//    2->[0]
//    3->[0, 1, 5]
//    4->[]
//    5->[3, 6, 7]
//    6->[1, 5]
//    7->[5, 8, 9]
//    8->[7]
//    9->[7]
//
//    Длина пути:4


}
