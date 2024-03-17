package org.leek.jagra.graph.graphclasses.undirected;

import org.leek.jagra.graph.Edge;
import org.leek.jagra.graph.Vertex;

import java.util.ArrayList;

public class UndirectedVertex extends Vertex {

  private int degree;

  private ArrayList<Edge> incidentEdges;

  public int getDegree() {
    return degree;
  }

  public ArrayList<Edge> getIncidentEdges() {
    return incidentEdges;
  }
}
