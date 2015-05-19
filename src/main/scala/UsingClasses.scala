
import scala.beans.BeanProperty

class Employee(@BeanProperty val firstName:String, 
               @BeanProperty var lastName:String) {

     def this(firstName:String) = this(firstName, "I don't know") //auxiliary constructor
     
     def this() = this("Unknown First Name")  //auxiliary constructor
     
     def fullName = s"$firstName $lastName"

     override def toString = s"Employee: $fullName"
}

class Manager (firstName:String, lastName:String, val title:String) extends Employee(firstName, lastName)


