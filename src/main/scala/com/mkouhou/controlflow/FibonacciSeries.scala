package com.mkouhou.controlflow

/*
* Write a Scala program to print the Fibonacci series up to a given number using a while loop.
* */
object FibonacciSeries {
  def printFibonacciSeries(limit: Int): Unit = {
    if (limit < 0) {
      println("Please enter a non-negative number.")
      return
    }

    var first = 0
    var second = 1
    var next = 0

    print("Fibonacci Series up to " + limit + ": ")

    while (first <= limit) {
      print(first + " ")
      next = first + second
      first = second
      second = next
    }
    println()
  }

  // test

  println("Enter the upper limit for the Fibonacci series:")
  val input = scala.io.StdIn.readInt()

  printFibonacciSeries(input)
}
