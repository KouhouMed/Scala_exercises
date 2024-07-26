/*
* Write a  Scala program to create a new string with the last char added at
* the front and back of a given string of length 1 or more.
* */

object StringWrapper extends App {
  def wrapWithLastChar(str: String): String = {
    if (str.isEmpty) str
    else str.last + str + str.last
  }

  // test
  println(wrapWithLastChar("car"))
  println(wrapWithLastChar("b"))

}
