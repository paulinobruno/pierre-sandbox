
/**
Consult your favorite Java or C++ textbook which is sure to have an example
of a toy inheritance hierarchy, perhaps involving employees, pets, graphical
shapes, or the like. Implement the example in Scala.
  */

package exercise_03

abstract class Shape {

  def draw():Unit

  def erase():Unit
}

class Circle extends Shape{

  override  def draw():Unit = {
    println("drawing Circle")
  }

  override def erase(): Unit = {
    println("erasing Circle")
  }

}

class Square extends Shape {
  override def draw(): Unit = {
    println("drawing Square")

  }

  override def erase(): Unit = {
    println("erasing Square")
  }
}

object Shapes extends App{
  cleanAndPaint(new Circle)
  cleanAndPaint(new Square)

  def cleanAndPaint(shape: Shape): Unit ={
    shape.erase()
    shape.draw()
  }

}