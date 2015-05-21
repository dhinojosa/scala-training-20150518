package com.xyzcorp.options

class Employee(val firstName:String, val middleName:Option[String], val lastName:String) {
  def this(firstName:String, middleName:String, lastName:String) = this(firstName, Some(middleName), lastName)
  def this(firstName:String, lastName:String) = this(firstName, None, lastName)
}

object Runner extends App {
  val a = Some(10)
  val b = None
  val e = new Employee("James", None, "Dean")
  val d = new Employee("Harry", Some("S"), "Truman")
  
  println(d.middleName.get)
  println(e.middleName.getOrElse("No Middle Name"))
  
  println(d.middleName.isEmpty) //false
  println(d.middleName.nonEmpty) //true
  
  def whatsTheMiddleName(x:Employee) = {
    x.middleName match {
      case foo => s"Mickey Mouse ${foo}"
      case Some(m) if (m == "Disco") => s"Dancing ${x.lastName}"
      case Some(m) => m
      case None => "No middle name"
      case _ => "I have no idea what is going on."
    }    
  }
  
  println(whatsTheMiddleName(d))
  println(whatsTheMiddleName(e))
  println(whatsTheMiddleName(new Employee("Jamie", "Disco", "Dave")))


  val g = ("49ers", 45, 900.33) //Tuple3
  
  val matched = g match {
    case (x,y,z) => s"I have x: $x, y: $y, z: $z"
  }
  
  println(matched)
  
  def matchTuples(x:Any) = {
    x match {
      case "Bob" => "Well we got Bob"
      case t@(x,y,z) => s"Got a Tuple 3 with $x, and $y and $z, and the entire this $t"
      case (w,x,y,z) => "Got a Tuple 4"
      case _ => "I don't know you got"  
    }
  }
  
  println(matchTuples("Whatever"))
  println(matchTuples("Bob"))
  println(matchTuples((3, "Bob", 109.00)))
  println(matchTuples("Cheese Sandwich"))
  
}

















