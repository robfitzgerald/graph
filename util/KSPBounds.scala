package cse.fitzgero.graph.util

/**
  * algorithm setting declaring how to end search for alternate paths
  * declared as type: "KSPBounds". called as member: "KSPBounds.Iteration()"
  */
sealed trait KSPBounds

object KSPBounds {

  /**
    * run i iterations of the KSP algorithm (some of which may produce invalid results)
    * @param i number of iterations
    */
  case class Iteration(i: Int) extends KSPBounds

  /**
    * find n paths, which may take more than i iterations, n = i
    * @param n
    */
  case class PathsFound(n: Int) extends KSPBounds

  /**
    * run algorithm until we go beyond the listed time limit
    * @param ms
    */
  case class Time(ms: Long) extends KSPBounds
}