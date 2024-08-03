package com.mkouhou.objectoriented

/*
* Write a Scala program that creates an object MathConstants with constants for mathematical calculations such as PI and E
* */
object MathConstants extends App {
  val PI: Double = 3.141592653589793
  val E: Double = 2.718281828459045
  val GOLDEN_RATIO: Double = 1.618033988749895
  val SQRT_2: Double = 1.414213562373095
  val EULER_MASCHERONI: Double = 0.577215664901532

  // test

  println(s"Pi: ${MathConstants.PI}")
  println(s"e: ${MathConstants.E}")
  println(s"Golden Ratio: ${MathConstants.GOLDEN_RATIO}")
  println(s"Square root of 2: ${MathConstants.SQRT_2}")
  println(s"Euler-Mascheroni constant: ${MathConstants.EULER_MASCHERONI}")
}