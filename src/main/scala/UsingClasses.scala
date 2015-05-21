package com.xyzcorp

import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String, 
               @BeanProperty var lastName:String) {
     
     private var _age:Int = 0
  
     require(firstName.size > 5, "First name must longer than 5 characters")
  
     def this(firstName:String) = this(firstName, "I don't know") //auxiliary constructor
     
     def this() = this("Unknown First Name")  //auxiliary constructor
     
     def fullName = s"$firstName $lastName"

     def add5ToAge = {
           val m = 5
          _age = _age + m
          _age
     }
     
     def age:Int = _age
     override def toString = s"Employee: $fullName"
}


class Manager (firstName:String, lastName:String, val title:String) extends Employee(firstName, lastName)

abstract class Animal {
    def makeNoise():String  //If there is no impl, it is an abstract methods
}

class Cow(name:String) extends Animal {
    def makeNoise = s"Hi, my name is ${name}, mooooo!"
}









