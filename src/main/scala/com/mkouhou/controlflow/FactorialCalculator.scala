package com.mkouhou.controlflow

/**
 * Write a Scala program to find the factorial of a given number using a while loop.
 */
object FactorialCalculator {

  def calculateFactorial(n: Int): Long = {
    if (n < 0) {
      throw new IllegalArgumentException("Factorial is not defined for negative numbers")
    }

    var result: Long = 1
    var i = 1

    while (i <= n) {
      result *= i
      i += 1
    }

    result
  }

  // test
  println("Enter a non-negative integer to calculate its factorial:")
  val input: Int = scala.io.StdIn.readInt()

  try {
    val factorial = calculateFactorial(input)
    println(s"The factorial of $input is $factorial")
  } catch {
    case e: IllegalArgumentException => println(e.getMessage)
    case e: Exception => println("An error occurred: " + e.getMessage)
  }


}
