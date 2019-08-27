
/**
  * Extend the `BankAccount` class of the preceding exercise into a class `SavingsAccount`
  * that earns interest every month (when a method `earnMonthlyInterest` is called)
  * and has three free deposits or withdrawals every month. Reset the transaction
  * count in the `earnMonthlyInterest` method.
  */

package Exercice_02

import Exercise_01.BankAccount

class SavingsAccount (initialBalance: Double, charges : Double,  interest:Double, balance: Double) extends BankAccount(initialBalance) {

  require(interest >= 0 && interest <= 1)
  val maxfreeActions = 3

  private[this] var actionsInMonth = 0

  def earnMonthlyInterest() ={
    actionsInMonth = 0
    super.deposit(balance * interest)
  }

  override def deposit(amount: Double): Double = {
    actionsInMonth += 1
    super.deposit(amount - (if (actionsInMonth > maxfreeActions) charges else 0))
   }

   override  def withdraw(amount:  Double): Double = {
     actionsInMonth += 1
     super.withdraw(amount +  (if(actionsInMonth > maxfreeActions) charges else 0))
   }

      val account = new SavingsAccount(100,5,0.1,100)
      account.deposit(10) //balance = 110
      account.deposit(10)//balance =  120
      account.withdraw(20)

      account.withdraw(5)
      account.deposit(15)
      account.earnMonthlyInterest()
  }

