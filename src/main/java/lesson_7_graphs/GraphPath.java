package lesson_7_graphs;

import java.util.LinkedList;

public abstract class GraphPath {

    protected boolean[] marked;
    protected int[] edgeTo;
    protected int source;

    public abstract boolean hasPathTo(int dist) ;
    public abstract LinkedList<Integer> pathTo(int dist);

}
