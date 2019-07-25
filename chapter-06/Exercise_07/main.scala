/*7-Implement a function that checks whether a card suit value from the preceding
exercise is red.
*/

import Exercise_06.CardSuite._
//package Exercise_07

object main extends App {

     def isRed(card: CardSuite) = card == Diamond || card == Heart
     println(isRed(Heart))

}
