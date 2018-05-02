package cse.bdlab.fitzgero.graph.propertygraph

import cse.bdlab.fitzgero.graph.basicgraph.BasicVertex

trait PropertyVertex extends BasicVertex {
  type Attr
  def attribute: Attr
}
