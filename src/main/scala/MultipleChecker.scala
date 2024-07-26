/*
* Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.
* */

object MultipleChecker extends App {
  def isMultipleOf3Or7(number: Int): Boolean = {
    number % 3 == 0 || number % 7 == 0
  }

  // test
  println("Enter a positive number:")
  val input = scala.io.StdIn.readLine().toInt

  if (input > 0) {
    val result = isMultipleOf3Or7(input)
    println(s"$input is ${if (result) "" else "not "}a multiple of 3 or 7")
  } else {
    println("Please enter a positive number.")
  }

}
