class Employee(val firstName:String, var lastName:String) {
//   def fullName:String = {
//     s"${firstName} ${lastName}"
//   }

     def fullName = s"$firstName $lastName"
}


