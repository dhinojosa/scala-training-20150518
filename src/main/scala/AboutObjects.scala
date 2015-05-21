package com {
  package xyzcorp {
    object MySingleton {

      def boom = "I love objects!"

    }

    object CEO extends Manager("William", "Gates", "Head Honcho")

    class Spy(name: String, private val secretIdentity: String) {
      def shoot(numBullets: Int) {
        Spy.bullets = Spy.bullets - numBullets
      }
    }

    object Spy { //companion objects have to be in the same file, and have the same name as a class.
      private var bullets: Int = 2000

      def top3 = List(new Spy("James Bond", "Bill Buxton"), new Spy("Maxwell Smart", "Cher"), new Spy("Matahari", "Bob Nelson"))

      def apply(s: String, backgroundInfo: String) = {
        //background check
        new Spy("Felix Leitner", "Felix Henderson")
      }

      def secretIdentity(spy: Spy) = spy.secretIdentity
    }

    object Runner {
      def main(arg: Array[String]): Unit = {
        println("Finally, a hello world example")
      }
    }

  }

  package zwvcorp {
    object AnotherRunner extends App {
      println("Hello World (shorter edition)")
    }
  }
}

