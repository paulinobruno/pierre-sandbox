/**
In the Creature class of Section 8.10, “Construction Order and Early Definitions,”
on page 98, replace val range with a def . What happens when you also use a def
in the Ant subclass? What happens when you use a val in the subclass? Why?
  */

package exercise_09

class Creature {

  def range: Int = 10
  val env: Array[Int] = new Array[Int](range)

}

class Ant extends Creature{
  override def range = 2
}

/**
When we use def in both superclass and subclass the array length is initialized with expected,
  * overrided value 2. This happens because there is no field to hold the value, and we don't have
  * initialization order problem.
  *
  * But when we use def in superclass and val in subclass initialization order problem is back
  * again. Since now the range value in subclass is backed by field and at the moment when
  * corresponding generated range getter method is called from superclass constructor the value is
  * not initialized yet and equals to 0 by default.
  */

object Creatures extends App{
  println(new Ant().env.length)
}