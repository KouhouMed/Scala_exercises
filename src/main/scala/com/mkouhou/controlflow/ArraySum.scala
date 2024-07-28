package com.mkouhou.controlflow

/*
* Write a Scala program to find the sum of all elements in an array using a for loop.
* */
object ArraySum extends App {
  def calculateSum(arr: Array[Int]): Int = {
    var sum = 0
    for (element <- arr) {
      sum += element
    }
    sum
  }

  // test
  println("Enter numbers separated by spaces:")
  val input: String = scala.io.StdIn.readLine()

  val numbers = input.split(" ").map(_.toInt)

  val sum = calculateSum(numbers)

  println(s"The array is: ${numbers.mkString(", ")}")
  println(s"The sum of all elements is: $sum")
}
