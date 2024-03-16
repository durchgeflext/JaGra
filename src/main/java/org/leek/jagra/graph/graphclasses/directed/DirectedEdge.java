package org.leek.jagra.graph.graphclasses.directed;

import org.leek.jagra.graph.Edge;
import org.leek.jagra.graph.Vertex;

public class DirectedEdge extends Edge {

  public DirectedEdge(Vertex start, Vertex end) {
    this.start = start;
    this.end = end;
  }
}
