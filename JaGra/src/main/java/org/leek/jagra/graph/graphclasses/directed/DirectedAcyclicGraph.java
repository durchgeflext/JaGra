package org.leek.jagra.graph.graphclasses.directed;

import org.leek.jagra.graph.Edge;
import org.leek.jagra.graph.Vertex;
import org.leek.jagra.graph.graphclasses.directed.exceptions.IllegalCycleException;
import org.leek.jagra.graph.graphexceptions.JaGraInvariantException;

/**
 * Class for Ducks.
 */
public class DirectedAcyclicGraph extends DirectedGraph {


  public DirectedAcyclicGraph() {
    super();
  }

  @Override
  public void addVertex() {

  }

  @Override
  public void addEdge(Vertex start, Vertex end) throws JaGraInvariantException {
    if (!checkAcyclic()) {
      throw new IllegalCycleException();
    }
  }

  private boolean checkAcyclic() {
    return false;
  }
}
