package com.mkouhou.objectoriented

abstract class Shape {
  def area: Double
}

class Rectangle(width: Double, height: Double) extends Shape {
  override def area: Double = width * height
}

class Circle(radius: Double) extends Shape {
  override def area: Double = math.Pi * radius * radius
}

object AbstractClasses extends App {
  val rectangle = new Rectangle(5, 3)
  val circle = new Circle(2)

  println(s"Rectangle area: ${rectangle.area}")
  println(s"Circle area: ${circle.area}")
}