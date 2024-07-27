package com.mkouhou.controlflow

object NumberChecker {
  def checkNumber(num: Double): String = {
    if (num > 0) {
      "positive"
    } else if (num < 0) {
      "negative"
    } else {
      "zero"
    }
  }

  println("Enter a number:")
  val input: Double = scala.io.StdIn.readDouble()

  val result: String = checkNumber(input)
  println(s"The number $input is $result.")
}
