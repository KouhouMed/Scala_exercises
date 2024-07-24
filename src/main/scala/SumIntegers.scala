/*
  Write a Scala program to compute the sum of the two given integer values.
  If the two values are the same, then return triples their sum.
*/
object SumIntegers extends App {

  def sumInt(x: Int, y: Int): Int = {
    if (x == y)
      (x + y) * 3
    else x + y
  }

  // test
  println(sumInt(5,5))
  println(sumInt(3,5))

}
