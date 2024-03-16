package org.leek.jagra.graph;

import java.util.ArrayList;

/**
 * Interface for the vertices of the graphs.
 */
public abstract class Vertex {
  private int indegree;
  private int outdegree;

  private ArrayList<Edge> outEdges;
  private ArrayList<Edge> inEdges;

  public int getIndegree() {
    return indegree;
  }

  public int getOutdegree() {
    return outdegree;
  }

  public int getDegree() {
    return indegree + outdegree;
  }

  public Vertex() {

  }
}
