/*
* Write a Scala program to check the largest number among three given integers
* */

object LargestNumberFinder extends App {
  def findLargest(a: Int, b: Int, c: Int): Int = {
    math.max(math.max(a, b), c)
  }

  // test
  println("Enter the first integer:")
  val num1 = scala.io.StdIn.readLine().toInt

  println("Enter the second integer:")
  val num2 = scala.io.StdIn.readLine().toInt

  println("Enter the third integer:")
  val num3 = scala.io.StdIn.readLine().toInt

  val largest = findLargest(num1, num2, num3)

  println(s"The largest number among $num1, $num2, and $num3 is: $largest")
}
