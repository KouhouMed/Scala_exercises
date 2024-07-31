package com.mkouhou.objectoriented

/*
* Write a Scala program that creates a subclass Student that extends the Person class.
* Add a property called grade and implement methods to get and set it.
* */
object Obj2 extends App {
  // Define the Person class
  class Person(val name: String, val age: Int) {
    override def toString: String = s"Name: $name, Age: $age"
  }

  // Define the Student class that extends the Person class
  class Student(name: String, age: Int, var grade: Int) extends Person(name, age) {
    // Getter method for grade
    def getGrade: Int = grade

    // Setter method for grade
    def setGrade(newGrade: Int): Unit = grade = newGrade

    // Override the toString method to include the grade
    override def toString: String = s"Name: $name, Age: $age, Grade: $grade"
  }

  // Create a Student object
  val student = new Student("John", 20, 85)

  // Set the grade
  student.setGrade(90)

  // Get and print the grade
  println(s"Grade: ${student.getGrade}")

  // Print the student details
  println(student.toString)

}
