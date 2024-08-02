package com.mkouhou.objectoriented

/*
* Write a Scala program that creates a trait Resizable with a method resize that changes the size of an object.
* Implement a class Rectangle that extends the Resizable trait.
* */

trait Resizable {
  def resize(factor: Double): Unit
}

class Rectangle(var width: Double, var height: Double) extends Resizable {
  def area: Double = width * height

  override def resize(factor: Double): Unit = {
    width *= factor
    height *= factor
  }

  def displayInfo(): Unit = {
    println(f"Rectangle: width = $width%.2f, height = $height%.2f, area = ${area}%.2f")
  }
}

object Main extends App {
  val rect = new Rectangle(5.0, 3.0)

  println("Original rectangle:")
  rect.displayInfo()

  rect.resize(2.0)
  println("\nAfter resizing by factor 2:")
  rect.displayInfo()

  rect.resize(0.5)
  println("\nAfter resizing by factor 0.5:")
  rect.displayInfo()
}
