package cse.bdlab.fitzgero.graph.basicgraph

trait BasicPathSegment {
  type EdgeId
  def edgeId: EdgeId
  def cost: Option[Seq[Double]]
}
