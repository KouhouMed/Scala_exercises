package com.mkouhou.objectoriented

object MathUtils {
  def factorial(n: Int): BigInt = {
    if (n < 0) throw new IllegalArgumentException("Factorial is not defined for negative numbers")
    if (n == 0 || n == 1) 1
    else (2 to n).foldLeft(BigInt(1))(_ * _)
  }
}

// Example usage
object Main extends App {
  println(s"Factorial of 5: ${MathUtils.factorial(5)}")
  println(s"Factorial of 10: ${MathUtils.factorial(10)}")
  println(s"Factorial of 20: ${MathUtils.factorial(20)}")
}