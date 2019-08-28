/**
  * Design a class Point whose x and y coordinate values can be provided in a
  *constructor. Provide a subclass LabeledPoint whose constructor takes a label
  * value and x and y coordinates, such as
  * new LabeledPoint("Black Thursday", 1929, 230.07)
  */

package Exercice_05

object Exercice5 extends App {

  class Point(val x: Double, val y: Double)

  class LabeldPoint(val label: String, x: Double, y: Double) extends Point(x,y)

  val lp = new LabeldPoint("Black Thursday",1929,230.07)

  assert(lp.label== "Black Thursday")
  assert(lp.x == 1920.0)
  assert(lp.y == 230.07)

}
