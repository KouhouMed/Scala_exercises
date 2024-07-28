package com.mkouhou.controlflow

/*
* Write a Scala program to check if a given string is a palindrome using if/else statements and pattern matching.
* */

object PalindromeChecker extends App {
  def isPalindrome(str: String): Boolean = {
    val cleanStr = str.toLowerCase.replaceAll("[^a-z0-9]", "")

    cleanStr match {
      case "" | _ if cleanStr.length == 1 => true
      case _ if cleanStr.head != cleanStr.last => false
      case _ => isPalindrome(cleanStr.tail.init)
    }
  }

  def checkPalindrome(str: String): Unit = {
    if (isPalindrome(str)) {
      println(s"'$str' is a palindrome.")
    } else {
      println(s"'$str' is not a palindrome.")
    }
  }

  // test
  println("Enter a string to check if it's a palindrome:")
  val input = scala.io.StdIn.readLine()

  checkPalindrome(input)
}
