package com.mkouhou.objectoriented

/*
* Write a Scala program that creates a class BankAccount with properties accountNumber and balance. 
* Implement methods to deposit and withdraw money from the account.
* */
class BankAccount(val accountNumber: String, private var _balance: Double = 0.0) {
  def balance: Double = _balance

  def deposit(amount: Double): Unit = {
    if (amount > 0) {
      _balance += amount
      println(f"Deposited $$$amount%.2f. New balance: $$$balance%.2f")
    } else {
      println("Invalid deposit amount. Amount must be positive.")
    }
  }

  def withdraw(amount: Double): Unit = {
    if (amount > 0) {
      if (_balance >= amount) {
        _balance -= amount
        println(f"Withdrawn $$$amount%.2f. New balance: $$$balance%.2f")
      } else {
        println("Insufficient funds.")
      }
    } else {
      println("Invalid withdrawal amount. Amount must be positive.")
    }
  }
}

object BankAccount extends App {
  val account = new BankAccount("123456789")

  println(f"Initial balance: $$${account.balance}%.2f")

  account.deposit(1000)
  account.withdraw(500)
  account.withdraw(700)
  account.deposit(-100)

  println(f"Final balance: $$${account.balance}%.2f")
}
