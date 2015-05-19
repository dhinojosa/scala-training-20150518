

val name = "Daniel Hinojosa"

val someInt = 10

println(s"Hello, welcome to Scala ${name + 20}. And my favorite number is $someInt")

val result = 3.+(10)
 
val result2 = 3 + 10

println(s"The answer for result is: $result and result2 is ${result2}")

//Note on equality:
//
//   Java      |  Scala
//   equals()  |   == (you can still use equals())
//   ==        |   eq
//
//To run: scala ScalaScript.scala


println(s"Are they equal?: ${result == result2}")
//println(s"Are they equal?: ${result eq result2}") eq did not work because Int is a AnyVal


val c = "Sushi"
val d = "Sushi"
val e = new String("Sushi")

println(s"Are the sushis equal? ${c == d}")
println(s"Are the sushis same reference? ${c eq d}")
println(s"Are the c and e sushis equal? ${c == e}")
println(s"Are the c and e sushis same reference? ${c eq e}")
























