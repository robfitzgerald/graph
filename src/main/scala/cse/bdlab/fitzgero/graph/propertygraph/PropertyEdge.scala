package cse.bdlab.fitzgero.graph.propertygraph

import cse.bdlab.fitzgero.graph.basicgraph.BasicEdge

trait PropertyEdge extends BasicEdge {
  type Attr
  def attribute: Attr
}
