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


  def pascal(c: Int, r: Int): Int = {
    //@annotation.tailrec
    def factorial(n:Int): Int ={
      def loop(n:Int, acc:Int): Int ={
        if (n <= 0) acc
        else loop(n-1, n*acc )
      }
      loop(n, 1)
    }

    if (c == r || c == 0) 1
    else factorial(r) / (factorial(c) * factorial(r - c ) )
  }

  print(pascal(3, 2) + " ")

  def balance(chars: List[Char]): Boolean = {
   // @annotation.tailrec
    def loop(text: List[Char], count: Int): Int = {
      if (text.isEmpty)
        count
      else {
        if (count < 0) count
        else {

          if (text.head == '(')
            loop(text.tail, count + 1)

          else if (text.head == ')')
            loop(text.tail, count - 1)

          else
            loop(text.tail, count)
        }
      }


    }

    loop(chars, 0) == 0

  }
    balance("(if (zero? x) max (/ 1 x))".toList)
  balance("())(".toList)


//      def balPolarity(text: List[Char], previous: String, actual: String, count: Int   ): Int = {
//        if (text.isEmpty) count
//        else if ( text.head == '(')
//          balPolarity(text.tail, count  :+ 1  )
//        else if (text.head == ')')
//          balPolarity(text.tail, count  :+ -1  )
//        else
//          balPolarity(text.tail, count)
//
//
//
//    }
//
//    balance("(x(x)xx)".toList)

  def countChange(money: Int, coins: List[Int]): Int = {

    @annotation.tailrec
    def loop(value:Int, lcoins: List[Int], count: Int): Int = {

      println(value)

      if (lcoins.isEmpty)
        count
      else {

        if (value == 0)
           count +1

        else

        if (value - lcoins.head < 0) {

          loop(value, lcoins.tail, count)
          }
        else

            loop(value -lcoins.head , lcoins, count)
            }
        }
     loop(money, coins ,1)
  }

  val nums: List[Int] = List(1, 2,3,7)
  countChange(6, nums)



}