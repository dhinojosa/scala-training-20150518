
object UsingTuples extends App {
    /**
     * Tuple3<String, Int, Double> tuple3 = new Tuple3<>("Sourdough", 30, 102.00); //Java
     */
     val tuple3 = ("Sourdough", 30, 102.00)
     val tuple3WithType:(String, Int, Double) = ("Sourdough", 30, 102.00)
     //val "zoom" = "room" this compiles?
     val tuple3WithFullType:Tuple3[String, Int, Double] = ("Sourdough", 30, 102.00)
     
     println(tuple3._1)
     println(tuple3._2)
     println(tuple3._3)
     
     class Employee(firstName:String, lastName:String) {
       override def toString = s"Employee: $firstName $lastName"
     }
     
     val tuple2 = (new Employee("Jan", "Brady"), 10)
     println(tuple2)
     println(tuple2.swap)
}

