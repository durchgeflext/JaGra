package org.leek.jagra.graph.graphclasses.directed.exceptions;

import org.leek.jagra.graph.graphexceptions.JaGraInvariantException;

public class IllegalCycleException extends JaGraInvariantException {
  public IllegalCycleException() {
    super("Acyclicity invariant violated");
  }
}
