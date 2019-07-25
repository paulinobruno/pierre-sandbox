/*Write an enumeration describing the four playing card suits so that the toString
method returns ß, ®, ©, or TM.*/

package Exercise_06

object CardSuite extends Enumeration {

      type CardSuite = Value
      val Club = Value("♣")
      val Diamond = Value("♦")
      val Heart = Value("♥")
      val Spade = Value("♠")

   }
  
