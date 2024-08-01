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