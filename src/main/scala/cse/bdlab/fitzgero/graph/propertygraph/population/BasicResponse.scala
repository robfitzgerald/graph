package cse.bdlab.fitzgero.graph.population

import cse.bdlab.fitzgero.graph.basicgraph.BasicPathSegment

trait BasicResponse {
  type Request <: BasicRequest
  type Path <: Seq[BasicPathSegment]
  def request: Request
  def path: Path
}
