
/**
  * Task 2:
  *
  * Extend the `BankAccount` class of the preceding exercise into a class `SavingsAccount`
  * that earns interest every month (when a method `earnMonthlyInterest` is called)
  * and has three free deposits or withdrawals every month. Reset the transaction
  * count in the `earnMonthlyInterest` method.
  */
package Exercice_02

import Exercise_01.BankAccount

class SavingsAccount (initialBalance: Double) extends BankAccount(initialBalance){

  private val monthlyInterest: Double = 0.01
  private val


}
