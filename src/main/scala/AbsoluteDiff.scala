/*
* Write a Scala program to get the absolute difference between n and 51.
* If n is greater than 51 return triple the absolute difference.
* */

object AbsoluteDiff extends App {

  def absoluteDif (n: Int): Int = {
    val absVal = Math.abs(n-51)
    if (n >= 51)
      absVal * 3
    else
      absVal
  }

  // test
  println(absoluteDif(52))
  println(absoluteDif(50))
  println(absoluteDif(51))

}
