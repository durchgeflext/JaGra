package org.leek.jagra.graph;

import org.leek.jagra.graph.graphexceptions.JaGraInvariantException;

import java.util.ArrayList;

/**
 * Graph interface.
 */
public abstract class Graph {
  private ArrayList<Vertex> vertices;
  private ArrayList<Edge> edges;

  public Graph() {

  }

  public abstract void addVertex();

  public abstract void addEdge(Vertex start, Vertex end) throws JaGraInvariantException;
}
