/*
* Write a Scala program to create a new string where 'if' is added to the front of a given string.
* If the string already begins with 'if', return the string unchanged.
* */

object Strings1 extends App {
  def addIf(str: String): String = {
    if (str.startsWith("if")) str else "if " + str
  }

  // test
  println(addIf("good"))
  println(addIf("if you are hungry, eat"))
}
