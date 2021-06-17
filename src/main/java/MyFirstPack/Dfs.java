package MyFirstPack;

import java.util.Iterator;
import java.util.LinkedList;

class Graph {
  private int V;
  private LinkedList<Integer> adj[];
  @SuppressWarnings("unchecked") Graph(int v)       ////////////////
  {
    V = v;
    adj = new LinkedList[v];
    for (int i = 0; i < v; ++i)
      adj[i] = new LinkedList();
  }

  void addEdge(int v, int w)
  {
    adj[v].add(w); // Add w to v's list.
  }

  void DFSUtil(int v, boolean visited[])
  {
    // Mark the current node as visited and print it
    visited[v] = true;
    System.out.print(v + " ");

    // Recur for all the vertices adjacent to this
    // vertex
    Iterator<Integer> i = adj[v].listIterator();
    while (i.hasNext()) {
      int n = i.next();
      if (!visited[n])
        DFSUtil(n, visited);
    }
  }
  void DFS()
  {
    boolean visited[] = new boolean[V];
    for (int i = 0; i < V; ++i)
      if (visited[i] == false)
        DFSUtil(i, visited);
  }
}


public class Dfs {
  public static void main(String args[])
  {
    Graph g = new Graph(4);

    g.addEdge(0, 1);
    g.addEdge(0, 2);
    g.addEdge(1, 2);
    g.addEdge(2, 0);
    g.addEdge(2, 3);
    g.addEdge(3, 3);

    System.out.println(
        "Following is Depth First Traversal");

    g.DFS();
  }
}
