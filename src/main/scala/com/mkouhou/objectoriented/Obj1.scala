package com.mkouhou.objectoriented

/*
* Write a  Scala program that creates a class called Person with properties like name, age and country.
* Implement methods to get and set properties.
* */
object Obj1 extends App {
  class Person(var name: String, var age: Int, var country: String) {
    def this() = this("", 0, "")

    def getName: String = name
    def setName(newName: String): Unit = name = newName

    def getAge: Int = age
    def setAge(newAge: Int): Unit = age = newAge

    def getCountry: String = country
    def setCountry(newCountry: String): Unit = country = newCountry
  }

  val person = new Person("John", 30, "USA")

  println("Name: " + person.getName)
  println("Age: " + person.getAge)
  println("Country: " + person.getCountry)

  person.setName("Jane")
  person.setAge(31)
  person.setCountry("Canada")

  println("Updated Name: " + person.getName)
  println("Updated Age: " + person.getAge)
  println("Updated Country: " + person.getCountry)

}
