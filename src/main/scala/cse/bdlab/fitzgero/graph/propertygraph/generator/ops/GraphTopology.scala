//package cse.bdlab.fitzgero.graph.generator.ops
//
//import cse.bdlab.fitzgero.graph.propertygraph._
//
//trait GraphTopology[G] extends PropertyGraph with PropertyGraphOps with PropertyGraphMutationOps[GraphTopology[G]] {
//  self: {
//    type VertexId = String
//  } =>
//  def empty: GraphTopology[G]
//  def topologySuffix: VertexId
//  def defaultEdge: Edge
//  def defaultVertex: Vertex
//}
//
//object GraphTopology {
//  def square[G](n: Int, g: GraphTopology[G]): GraphTopology[G] = {
//    val vertices = for {
//      i <- 0 to n
//      j <- 0 to n
//    } yield (s"$g.topologySuffix-$i-$j", g.defaultVertex)
//    val graphVertices = vertices.foldLeft(g.empty){
//      (acc, vertex) =>
//        acc.updateVertex(vertex._1, vertex._2)
//    }
//  }
//}