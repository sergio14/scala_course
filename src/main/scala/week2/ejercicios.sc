object  ejercicios{
//
//  def sumInts(a: Int, b:Int): Int = {
//    if (a > b ) 0
//    else  a + sumInts(a +1 , b)
//
//  }
//
//  def cube(x:Int):Int = x * x * x
//
//  def sumCube (a: Int, b:Int):Int =
//    if (a > b) 0
//    else  cube(a) + sumCube(a + 1 , b )
//  sumCube(2, 3)

  /** with anonymous function */
  //def sumCube2(a: Int, b:_Int) = sum( x => x * x * x, a, b )

  /** tailrecursive sumation
    *
    */

///*  def sum(f: Int => Int, a:  Int, b:Int ) = {
//    def loop(a:Int,  acc:Int):Int =
//        if (a > b) acc
//        else loop( a + 1 , acc + f(a))
//    loop( a, 0 )
//  }
//
//  sum (x => x * x  , 3 , 5 )
//
//
//  def sum2(f: Int => Int ): (Int, Int )=> Int = {
//    def loop( a: Int, b: Int ): Int =
//      if (a > b) 0
//      else f(a) + loop (a + 1 , b)
//      loop
//  }
//
//  /** Function that return function - syntactic sugar*/
//  def sum3(f: Int => Int)(a: Int, b: Int): Int =
//    if (a > b) 0 else f(a) + sum3(f)(a + 1, b )*/

/*    def product(f: Int => Int)(a: Int, b: Int): Int =
      if (a > b) 1  else f(a) * product(f)( a + 1, b )
  product (x => x * x) (3, 7)

  def fact(n: Int) = product(x => x)(1, n)

  fact(5)*/

  /**
   product
   */

  def product(f: Int => Int)(a: Int, b:Int): Int =
    if (a > b ) 1
    else f(a) * product(f)( a + 1 , b)
  product(x  => x * x)( 3 , 4)

  def fact(n: Int ) = product(x => x)(1, n)
  fact(5)




  /** Map reduce*/

  def mapReduce(f:Int)


/*
  def mapReduce( f: Int => Int , combine:(Int, Int) => Int, zero:Int)(a:Int, b:Int): Int =
    if ( a > b) zero
    else combine(f(a), mapReduce(f,combine, zero)(a + 1, b) )

  def product( f: Int => Int)(a:Int, b:Int):Int = mapReduce(f, (x, y) => x*y, 1)(a,b) )

  product(x => x * x)(3, 4)

  def fact(n: Int) = product(x => x)(1, n)
  fact(5)
*/



  

}