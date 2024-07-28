package com.mkouhou.controlflow

/*
* Write a Scala program to find the largest element in an array using pattern matching
* */

object LargestElement extends App {
  def largest(arr: Array[Int]): Int = {
    arr match {
      case Array() => throw new NoSuchElementException("Array is empty")
      case Array(x) => x
      case Array(x, y) => x max y
      case _ =>
        arr.foldLeft(Int.MinValue) { (acc, x) =>
          if (acc < x) x else acc
        }
    }
  }

  // test

  val arr = Array(3, 1, 18, 1, 10, 5, 9, 2, 6, 80, 0)
  val largestElement = largest(arr)
  println(s"The largest element in the array is $largestElement")

}
