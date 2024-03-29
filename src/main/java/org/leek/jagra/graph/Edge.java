package org.leek.jagra.graph;

/**
 * Interface for the edges of this graph.
 */
public abstract class Edge {
  protected Vertex start;
  protected Vertex end;

  public Edge() {

  }

  public Vertex getNeighbor(Vertex v) {
    if(start == v) {
      return end;
    } else if(end == v) {
      return start;
    } else {
      return null;
    }
  }
}
