

def factorial(x:Int):BigInt = {
 import scala.annotation.tailrec
 @tailrec
 def fact(x:BigInt,total:BigInt):BigInt = {
         require(x >= 0, "item should be positive")
         if (x == 0) total
         else fact(x - 1, x * total)
 }
 fact(x, 1)
}

println(factorial(120))
println(factorial(-10))


