/*
* Write a Scala program to check whether two given positive integers have the same last digit
* */

object LastDigitChecker extends App {
  def areLastDigitsEqual(a: Int, b: Int): Boolean = {
    math.abs(a % 10) == math.abs(b % 10)
  }

  // test
  println("Enter the first integer:")
  val num1 = scala.io.StdIn.readLine().toInt

  println("Enter the second integer:")
  val num2 = scala.io.StdIn.readLine().toInt

  val result = areLastDigitsEqual(num1, num2)

  println(s"Are the last digits of $num1 and $num2 equal? " + result)
}
