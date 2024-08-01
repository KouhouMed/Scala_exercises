package com.mkouhou.objectoriented


class Employee(val name: String, val age: Int, val designation: String) {
  def displayDetails(): Unit = {
    println(s"Employee Details:")
    println(s"Name: $name")
    println(s"Age: $age")
    println(s"Designation: $designation")
    println("------------------------")
  }
}

object Employee extends App {
  val employee1 = new Employee("John Doe", 30, "Software Engineer")
  val employee2 = new Employee("Jane Smith", 35, "Project Manager")

  employee1.displayDetails()
  employee2.displayDetails()
}
