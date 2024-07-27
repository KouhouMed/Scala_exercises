package com.mkouhou.controlflow

/*
*  Write a Scala program to print the multiplication table of a given number using a for loop.
* */
object MultiplicationTable {
  def printTable(number: Int, rows: Int = 10): Unit = {
    println(s"Multiplication table for $number:")

    for (i <- 1 to rows) {
      val result = number * i
      println(f"$number x $i%2d = $result%3d")
    }
  }

  // test
  println("Enter a number to generate its multiplication table:")
  val input: Int = scala.io.StdIn.readInt()

  println("Enter the number of rows (default is 10):")
  val rows: Int = scala.io.StdIn.readLine().trim match {
    case "" => 10
    case n => n.toInt
  }

  printTable(input, rows)


}
