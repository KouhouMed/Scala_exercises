/*
* Write a Scala program to create a new string which is 4 copies of the 2 front characters of a given string.
* If the given string length is less than 2 return the original string.
* */

object StringCopier extends App {
  def copyFrontChars(str: String): String = {
    if (str.length < 2) str
    else str.substring(0, 2) * 4
  }

  // test

  println(copyFrontChars("scala"))
  println(copyFrontChars("a"))
}
