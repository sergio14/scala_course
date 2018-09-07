object ejercicio2 {



    def balance(chars: List[Char]): Boolean = {
      @annotation.tailrec
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







}