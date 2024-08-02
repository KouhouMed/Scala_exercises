package com.mkouhou.objectoriented

class Triangle(val side1: Double, val side2: Double, val side3: Double) {
  def isEquilateral: Boolean = {
    side1 == side2 && side2 == side3
  }

  def printInfo(): Unit = {
    println(s"Triangle sides: $side1, $side2, $side3")
    println(s"Is equilateral: ${isEquilateral}")
    println("------------------------")
  }
}

object Triangle extends App {
  val triangle1 = new Triangle(5, 5, 5)
  val triangle2 = new Triangle(3, 4, 5)

  triangle1.printInfo()
  triangle2.printInfo()
}
