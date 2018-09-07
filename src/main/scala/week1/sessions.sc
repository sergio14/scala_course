
object session {
  def abs(x: Double) = if (x < 0) -x else x

//  def sqrt(x: Double) = {
//    def sqrtIter(guess: Double, x: Double): Double =
//      if (isGoodEnough(guess, x)) guess
//      else sqrtIter(improve(guess, x), x)
//    // check if the estimation guess give a result close to the queried value
//    def isGoodEnough(guess: Double, x: Double) =
//    // abs(guess * guess - x) < 0.001 problem with very small and large x values
//      abs(guess * guess - x) / x < 0.001
//    // improve the solution using the average of  estimator and  value/ estimator
//    def improve(guess: Double, x: Double) =
//      (guess + (x / guess)) / 2
//    // run the system
//    sqrtIter(guess = 1.0, x = x)

  /*Clean the block  - avoiding redundance in the x =value*/

  def sqrt(x: Double) = {
    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))
    // check if the estimation guess give a result close to the queried value
    def isGoodEnough(guess: Double) =
    // abs(guess * guess - x) < 0.001 problem with very small and large x values
      abs(guess * guess - x) / x < 0.001
    // improve the solution using the average of  estimator and  value/ estimator
    def improve(guess: Double) =
      (guess + (x / guess)) / 2
    // run the system
    sqrtIter( 1.0)

  }
  sqrt(2)
  sqrt(4)
  sqrt(0.1e-20)
  sqrt(0.001)
  sqrt(1.0e50)
}