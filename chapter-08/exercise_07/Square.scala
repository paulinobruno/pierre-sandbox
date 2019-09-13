/**
Provide a class Square that extends java.awt.Rectangle and has three constructors:
one that constructs a square with a given corner point and width, one
that constructs a square with corner (0, 0) and a given width, and one that
constructs a square with corner (0, 0) and width 0 .
  */
package exercise_07

import java.awt.Rectangle

class Square (x: Int = 0, y: Int = 0, width: Int = 0) extends Rectangle(x,y, width, width) {

  def this(width: Int){
    this(0,0, width)
  }
}