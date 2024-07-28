package com.mkouhou.controlflow

/*
* Write a Scala program to count the number of vowels in a given string using if/else statements and pattern matching
* */

object VowelCounter extends App {
  def countVowels(str: String): Int = {
    def isVowel(c: Char): Boolean = {
      c.toLower match {
        case 'a' | 'e' | 'i' | 'o' | 'u' => true
        case _ => false
      }
    }

    str.foldLeft(0) { (count, char) =>
      if (isVowel(char)) count + 1 else count
    }
  }

  // test
  println("Enter a string to count its vowels:")
  val input = scala.io.StdIn.readLine()

  val vowelCount = countVowels(input)

  println(s"The string '$input' contains $vowelCount vowel(s).")
}
