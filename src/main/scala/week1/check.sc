/** Simple scala object*/

object MyModule {

  /* Methods */
  def abs(n: Int): Int = {
    if (n < 0) -n
    else n
  }

  def factorial(n: Int):Int ={

    def loop( n:Int, acc:Int):Int = {
      if (n <= 0) acc
      else loop(n -1 , n * acc )
    }
    loop(n ,1)


  }

  /** Printing results */
  def formatAbs(x: Int) = {
    val msg = " the absolute value of %d is %d"
    msg.format(x, abs(x))
  }

  def formatFactorial(n: Int) = {
    val msg= "the Factorial of %d is %d."
    msg.format(n, factorial(n))
  }

  def formatResult( name:String, n:Int, f: Int => Int){
    val msg = "the %s of %d is %d."
    msg.format(name, n, f(n))
  }


  def main(args: Array[String]): Unit =
    formatResult("absolute value ", -42, abs )
    formatResult("factorial ", 4, factorial )

formatResult("absolute value", -42, abs)
}


