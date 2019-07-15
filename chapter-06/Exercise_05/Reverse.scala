/*5. Write a Scala application, using the App trait, that prints its command-line
arguments in reverse order, separated by spaces. For example, scala Reverse
Hello World should print World Hello .*/

package Exercise_05

object Reverse extends App {
  /* print(args.reverse.mkString("Hello World"))*/
   for(s <- args.reverse) print(s + "pierre anne ")
   println()
}
