/*
* Write a Scala program to exchange the first and last characters in a given string and return the new string.
* */

object CharSwap extends App {
  def charSwap(str: String): String = {
    str.length match {
      case 0 | 1 => str
      case _ => str.last + str.substring(1, str.length - 1) + str.head
    }
  }

  // test
  println(charSwap("apple"))
  println(charSwap("a"))

}
