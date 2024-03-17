package org.leek.jagra.graph.graphclasses.directed;

import org.leek.jagra.graph.Edge;
import org.leek.jagra.graph.Vertex;

import java.util.ArrayList;

public class DirectedVertex extends Vertex {

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

  @Override
  public int getDegree() {
    return indegree + outdegree;
  }

  public ArrayList<Edge> getIncidentEdges() {
    ArrayList<Edge> newList = new ArrayList<>(outEdges);
    newList.addAll(inEdges);
    return newList;
  }
}
