package com.mkouhou.objectoriented

/*
* Write a Scala program that creates a class Animal with properties name and sound.
* Implement a method makeSound that prints the animal's sound.
* */

class Animal(val name: String, val sound: String) {
  def makeSound(): Unit = {
    println(s"$name says: $sound!")
  }
}

object Animal extends App {
  val dog = new Animal("Dog", "Woof")
  val cat = new Animal("Cat", "Meow")
  val cow = new Animal("Cow", "Moo")

  dog.makeSound()
  cat.makeSound()
  cow.makeSound()
}