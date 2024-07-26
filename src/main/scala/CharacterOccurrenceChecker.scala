/*
* Write a Scala program to check whether a given character presents in a string between 2 to 4 times.
* */

object CharacterOccurrenceChecker extends App {
  def checkOccurrence(str: String, char: Char): Boolean = {
    val count = str.count(_ == char)
    count >= 2 && count <= 4
  }

  // test
  println("Enter a string:")
  val inputString = scala.io.StdIn.readLine()

  println("Enter a character to check:")
  val inputChar = scala.io.StdIn.readLine().charAt(0)

  val result = checkOccurrence(inputString, inputChar)

  println(s"Does '$inputChar' appear 2 to 4 times in '$inputString'? $result")
}
