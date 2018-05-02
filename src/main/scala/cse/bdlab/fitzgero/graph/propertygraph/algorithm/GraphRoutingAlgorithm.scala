package cse.bdlab.fitzgero.graph.algorithm

import cse.bdlab.fitzgero.graph.basicgraph.{BasicPathSegment, _}
import cse.bdlab.fitzgero.graph.population.BasicOD

trait GraphRoutingAlgorithm extends GraphAlgorithm { algorithm =>
  type AlgorithmRequest <: BasicOD {
    type VertexId = algorithm.VertexId
  }

  type PathSegment <: BasicPathSegment {
    type EdgeId = algorithm.EdgeId
  }

  type Path = List[PathSegment]

  /**
    * run a graph routing algorithm in the current process
    * @param graph the underlying graph structure
    * @param request a single request or a batch request
    * @return the optional algorithm result
    */
  def runAlgorithm(graph: Graph, request: AlgorithmRequest, config: Option[AlgorithmConfig]): Option[AlgorithmResult]
}