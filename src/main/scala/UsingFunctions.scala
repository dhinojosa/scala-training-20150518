package com.xyzcorp.functions

object UsingFunctions extends App {
  val a = (x:Int) => x + 1 //2
  val a_1 = {x:Int => x + 1} //another way to do it
  
  println(a(1))
  println(a_1(1))
  println(a.apply(1))
  println(a_1.apply(1))
  
  val a_2:Int => Int = (x:Int) => x + 1
  val a_3:Function1[Int, Int] = (x:Int) => x + 1
  
  println(a_2(5))
  println(a_3(10))
  
  val a_4:Function1[Int, Int] = new Function1[Int, Int] {
    def apply(x:Int):Int = x + 1
  }

  println(a_4.apply(4))
  println(a_4.apply(10))
  
  val b = (x:Int, y:String) => y + x
  println(b.apply(10, "Bob"))
  println(b(10, "Bob"))
  
  val b_1 = {(x:Int, y:String) => y + x}
  val b_2:(Int, String) => String = (x:Int,y:String) => y+x
  val b_3:Function2[Int, String, String] = (x:Int, y:String) => y + x
  val b_4:Function2[Int, String, String] = new Function2[Int, String, String] {
     def apply(x:Int, y:String):String = y + x 
  }
  
  val c = (x:Int, y:String, z:(Int, String)) => (x+z._1, y+z._2)
  println(c.apply(3, "Foo", (9, "Bar")))
  
  val d = (x:Int, y:Int, z: Int => Int) => z(x) + y
  println(d(4, 5, (x:Int) => -x))
  println(d(4, 10, a_2))
  println(d(d(5,3,(x:Int) => x*3), 10, (x:Int) => x * 100))
  
  val factorial:Int => Int = (x:Int) => if (x == 0) 1 else x * factorial(x - 1)
  println(factorial(5))
  
  val item = 5
  
  def addToItem(x:Int):Int=>Int = (y:Int) => y + x + item //closure 
  
  println(addToItem(3)) //<function1>
  println(addToItem(3)(5)) //13
  
  
  def partialMethod(x:Int)(y:String) = {
    y + " I love scala " +  x    
  }
  
  val e = partialMethod(10) _
  println(e)
  println(e("Foo"))
  
  
  class Foo(x:Int) {
    def bar(y:Int) = x + y
  }
  
  val f = new Foo(13)
  val g = new Foo(19)
  
  val h = f.bar _
  val j = g.bar _
  
  println(h)
  println(j)
  println(h(10))
  println(j(99))
}























