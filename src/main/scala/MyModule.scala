// A comment!
/* Another comment*/
//** A documentation comment */


object MyModule {

  def abs(n:Int): Int =
    if ( n < 0) -n
    else n


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


  def formatResult(name: String, n: Int, f: Int => Int) = {
    val msg = "The %s of %d is %d."
    msg.format(name, n, f(n))

  }

 def main(args: Array[String]): Unit =
  println(formatResult("absolute value", -42, abs))
  println(formatResult("factorial", 3, factorial))



}
