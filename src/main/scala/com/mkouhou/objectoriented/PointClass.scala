package com.mkouhou.objectoriented

/*
* Write a Scala program that creates a class Point with properties x and y coordinates.
* Use a destructuring declaration to extract the coordinates.
* */

object PointClass extends App{
  def main(args: Array[String]): Unit = {
    val point = Point(2, 1)

    val Point(x, y) = point

    println(s"x-coordinate: $x")
    println(s"y-coordinate: $y")
  }
}
