package cse.bdlab.fitzgero.graph.population

trait BasicOD {
  type VertexId
  def src: VertexId
  def dst: VertexId
}

