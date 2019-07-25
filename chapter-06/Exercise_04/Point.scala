/*4. Define a Point class with a companion object so that you can construct Point
instances as Point(3, 4) , without using new .*/

package Exercise_04

class Point(val x: Int, val y: Int) {
  override def toString = "(" + x + "," + y +")"

}

object Point{
  def apply(x: Int, y: Int) = new Point(x,y)

  }