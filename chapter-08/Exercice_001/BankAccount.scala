/**
Extend the following BankAccount class to a CheckingAccount class that charges $1
for every deposit and withdrawal.
  */
package Exercice_001

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  def deposit(amount: Double) = {
    balance += amount;
    balance
  }
  def withdraw(amount: Double):Double= {
    balance -= amount
    balance

  }
}

class CheckingAccount(initialBalance:Double) extends BankAccount(initialBalance){

  private val charge : Double =  1

  override def deposit(amount: Double)= {super.deposit(amount - 1)}

  override def withdraw(amount: Double)= {super.withdraw(amount + 1)}
}