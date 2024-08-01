package com.mkouhou.objectoriented

/*
* Write a Scala program that creates a class Car with properties like make, model, and year.
* Implement a method to display car information.
* */
class Car(val make: String, val model: String, val year: Int) {
  def displayInfo(): Unit = {
    println(s"Car Information:")
    println(s"Make: $make")
    println(s"Model: $model")
    println(s"Year: $year")
    println("------------------------")
  }
}

object Car extends App {
  val car1 = new Car("Toyota", "Corolla", 2022)
  val car2 = new Car("Tesla", "Model 3", 2023)

  car1.displayInfo()
  car2.displayInfo()
}