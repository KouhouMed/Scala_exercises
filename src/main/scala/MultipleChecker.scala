/*
* Write a Scala program to check whether a given positive number is a multiple of 3 or a multiple of 7.
* */

object MultipleChecker extends App {
  def isMultipleOf3Or7(number: Int): Boolean = {
    number % 3 == 0 || number % 7 == 0
  }

  // test
  val n: Int = 24
  println(s"Is $n a multiple of 3 or 7? " + isMultipleOf3Or7(n))

}
