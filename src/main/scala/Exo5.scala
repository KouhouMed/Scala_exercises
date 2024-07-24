// Write a Scala program to check a given integer and return true if it is within 20 of 100 or 300.

object Exo5 extends App {
  def checker20 (n: Int): Boolean = {
    Math.abs(100 - n) <= 20 || Math.abs(300 - n) <= 20
  }

  // test
  println(checker20(102))
  println(checker20(288))
  println(checker20(54))
  println(checker20(320))
}
