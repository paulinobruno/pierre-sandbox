/**
Define an abstract class Shape with an abstract method centerPoint and subclasses
Rectangle and Circle . Provide appropriate constructors for the subclasses and
override the centerPoint method in each subclass.
  */

package Exercice_06

import Exercice_05.Exercice5.Point

abstract class Shape {
  def centerPoint: Point
}

class Circle(override val centerPoint: Point, val radius: Double) extends Shape

class Rectangle(val x1: Double,  val y1: Double, val x2: Double, val y2: Double) extends Shape {

  override def centerPoint  = new Point((x1 + x2) / 2, (y1 + y2)/2)
}