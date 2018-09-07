object ejercicio1 {

  def pascal(c: Int, r: Int): Int = {

    def factorial(n:Int): Int ={
      @annotation.tailrec
      def loop(n:Int, acc:Int): Int ={
        if (n <= 0) acc
        else loop(n-1, n*acc )
      }
      loop(n, 1)
    }

    if (c == r || c == 0) 1
    else factorial(r) / (factorial(c) * factorial(r- c ) )
  }


  pascal(4, 3)

  println("Pascal's Triangle")
  for (row <- 0 to 10) {
    for (col <- 0 to row)
      print(pascal(col, row) + " ")
    println()
  }
  println()

/* example2 */
  def pascal2(c: Int, r: Int): Int = {
    if (c == 0 || c == r) 1
    else pascal2(c - 1, r - 1) + pascal2(c, r - 1)
  }


}