/*
* Write a Scala program to remove the character in a given position of a given string.
* The given position will be in the range 0...string length -1 inclusive.
* */

object Exo6 extends App {
  def removeChar(str:String, pos: Int): String = {
    str.take(pos) + str.drop(pos + 1)
  }

  // test
  println(removeChar("ABCDEFGH", 5))
}
