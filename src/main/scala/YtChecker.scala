/*
*  Write a  Scala program to check whether a string 'yt' appears at index 1 in a given string.
* If it appears return a string without 'yt' otherwise return the original string.
* */

object YtChecker extends App {
  def removeYtIfPresent(str: String): String = {
    if (str.length >= 3 && str.substring(1, 3) == "yt") {
      str.charAt(0) + str.substring(3)
    } else {
      str
    }
  }

  // test
  println("Enter a string:")
  val input = scala.io.StdIn.readLine()

  val result = removeYtIfPresent(input)
  println(s"Original string: '$input'")
  println(s"Resulting string: '$result'")
}
