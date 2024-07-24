/*
* Write a Scala program to check two given integers, and return true if one of them is 30 or if their sum is 30.
* */

object Exo4 extends App {
  def checker30(a: Int, b: Int): Boolean = {
    a == 30 || b == 30 || a + b == 30
  }

  // test
  println(checker30(30, 43))
  println(checker30(16,14))
  println(checker30(2,3))
}
