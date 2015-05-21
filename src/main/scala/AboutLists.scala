
object AboutLists extends App {
  val a = List(1, 2, 3, 4, 5, 6, 7)

  val b = 1 :: 2 :: 3 :: 4 :: 5 :: 6 :: List(1, 2, 3, 4)

  val c = List("San Jose", "San Francisco", "Los Angeles", "San Diego")

  val f = (x: String) => x.size

  println(c.map(f))

  println(c)

  val g = (x: String) => x.startsWith("San")

  println(c.filter(g))

  println(c.filter((x: String) => x.startsWith("San")))

  println(c.filter(x => x.startsWith("San")))

  println(c.filter(_.startsWith("San")).map(f))

  println(c(2)) //Los Angeles

  println(c.head)

  println(c.tail)

  println(c.init)

  println(c.last)

  val d = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

  val f1 = (total: Int, next: Int) => total + next

  println(d.foldLeft(0) { (total, next) =>
    println(s"total: $total next: $next"); total + next
  })

  println(d.foldLeft(0){(total, next) => total + next})
  
  println(d.foldLeft(0)(_+_))

  def factorial(n:Int) = (1 to n).foldLeft(1)(_*_)

  println(factorial(100000))
  
}








