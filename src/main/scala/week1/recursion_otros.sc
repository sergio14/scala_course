object recursion_exercise{

  //  // Fibonacci nth estimaion
  //  def fib( n:Int) :Int = {
  //
  //    @annotation.tailrec
  //    def loop( previous:Int, actual:Int, n:Int): Int ={
  //      if ( n -2 ==0 ) actual
  //      else  loop(actual, previous + actual, n -1)
  //    }
  //    //Initial state
  //    loop(1,1,n)
  //
  //  }
  //
  //  fib(6)
  //
  // Factorial estimation
  def factorial( n:Int):Int = {

    @annotation.tailrec
    def loop(acc:Int, n:Int):Int = {
      if ( n <= 0) acc
      else  loop(acc*n, n-1 )
    }

    // Initial state
    loop(1, n)
  }
  //
  //  factorial(4)
  //
  //  // Monomorphic function
  //  def findFirst(ss: Array[String], key: String): Int = {
  //    @annotation.tailrec
  //    def loop(n: Int): Int = {
  //      if (n >= ss.length) -1
  //      else if (ss(n) == key) n +1
  //      else loop(n + 1)
  //    }
  //
  //    loop(0)
  //  }
  //
  //  val lista = Array("hola", "holo", "hole")
  //  val word = "holo"
  ////
  //  findFirst( lista, word )
  //
  //
  //  // Polymorphic Function
  //  def findFirstPoly[A](as: Array[A], p: A => Boolean) : Int = {
  //    def loop(n:Int):Int= {
  //      if (n >= as.length) -1
  //      else if (p(as(n))) n + 1
  //      else loop(n+1)
  //    }
  //    loop (0)
  //
  //  }
  //
  //  def equalKey(x:String):Boolean =
  //    x=="holo"
  //
  //  findFirstPoly( lista, equalKey )





/**
*  Examples from  https://alvinalexander.com/scala/scala-recursion-examples-recursive-programming
*
* */

  /** SUM*/
  // scala method
  def sumWithReduce(ints: List[Int]) = {
    ints.reduceLeft(_ + _)
  }

  val list = List.range(1, 100)
  println(sum(list))
  println(sum2(list))
  println(sum3(list))
  println(sumWithReduce(list))

  // (1) yields a "java.lang.StackOverflowError" with large lists
  def sum(ints: List[Int]): Int = ints match {
    case Nil => 0
    case x :: tail => x + sum(tail)
  }

  // (2) tail-recursive solution
  def sum2(ints: List[Int]): Int = {
    @annotation.tailrec
    def sumAccumulator(ints: List[Int], accum: Int): Int = {
      ints match {
        case Nil => accum
        case x :: tail => sumAccumulator(tail, accum + x)
      }
    }
    sumAccumulator(ints, 0)
  }

  // (3) good descriptions of recursion here:
  // stackoverflow.com/questions/12496959/summing-values-in-a-list
  // this example is from that page:
  def sum3(xs: List[Int]): Int = {
    if (xs.isEmpty) 0
    else xs.head + sum3(xs.tail)
  }

/**  MAX */

 val list = List.range(1, 100000)
  println(max(list))
  println(max2(list))

  // 1 - using `match`
  def max(ints: List[Int]): Int = {
    @tailrec
    def maxAccum(ints: List[Int], theMax: Int): Int = {
      ints match {
        case Nil => theMax
        case x :: tail =>
          val newMax = if (x > theMax) x else theMax
          maxAccum(tail, newMax)
      }
    }
    maxAccum(ints, 0)
  }

  // 2 - using if/else
  def max2(ints: List[Int]): Int = {
    @annotation.tailrec
    def maxAccum2(ints: List[Int], theMax: Int): Int = {
      if (ints.isEmpty) {
        return theMax
      } else {
        val newMax = if (ints.head > theMax) ints.head else theMax
        maxAccum2(ints.tail, newMax)
      }
    }
    maxAccum2(ints, 0)
  }

  import scala.annotation.tailrec

  /**
    * The `fibHelper` code comes from this url: rosettacode.org/wiki/Fibonacci_sequence#Scala
    */
  object FibonacciTailRecursive extends App {

    println(fib(9))

    def fib(x: Int): BigInt = {
      @tailrec def fibHelper(x: Int, prev: BigInt = 0, next: BigInt = 1): BigInt = x match {
        case 0 => prev
        case 1 => next
        case _ => fibHelper(x - 1, next, (next + prev))
      }
      fibHelper(x)
    }

  }

  /**
    *Factorial
    */

  println(factorial(5))
  println(factorial2(5))

  // 1 - basic recursive factorial method
  def factorial(n: Int): Int = {
    if (n == 0) 1
    else        n * factorial(n-1)
  }

  // 2 - tail-recursive factorial method
  def factorial2(n: Long): Long = {
    @tailrec
    def factorialAccumulator(acc: Long, n: Long): Long = {
      if (n == 0) acc
      else factorialAccumulator(n*acc, n-1)
    }
    factorialAccumulator(1, n)
  }


}