package org.leek.jagra.graph;

import org.leek.jagra.graph.graphclasses.undirected.UndirectedEdge;

import java.util.ArrayList;

/**
 * Interface for the vertices of the graphs.
 */
public abstract class Vertex {

  public Vertex() {

  }

  public abstract int getDegree();

  public abstract ArrayList<Edge> getIncidentEdges();
}
