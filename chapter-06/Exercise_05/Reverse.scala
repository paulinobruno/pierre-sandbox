/*5. Write a Scala application, using the App trait, that prints its command-line
arguments in reverse order, separated by spaces. For example, scala Reverse
Hello World should print World Hello .*/

package Exercise_05

object Reverse extends App {
   println(args.reverse.mkString(" "))
}
