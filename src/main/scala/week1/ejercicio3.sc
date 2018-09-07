

object ejercicio3{




  def countChange(money: Int, coins: List[Int]): Int = {
    if(money == 0)
      1
    else if(money > 0 && !coins.isEmpty)
      countChange(money - coins.head, coins) + countChange(money, coins.tail)
    else
      0
  }
  val nums: List[Int] = List(1, 2, 3)
  countChange(3, nums.sorted)


  //
  //  def countChange(value: Int, coins: List[Int]): Int = {
  //
  //    @annotation.tailrec
  //    def loop(value: Int, coins: List[Int], lcoins: List[Int], Ind1: Int,Ind2: Int, acc: Int,  count: Int): Int = {
  //
  //      if (lcoins.isEmpty) {
  //        count
  //      }
  //      else if (Ind2 <= coins.length - 1) {
  //
  //          if (acc + coins(Ind2) > value) {
  //            loop(value, coins, lcoins, Ind1, Ind2+1, acc, count)
  //          }
  //          else if (acc + coins(Ind2) < value) {
  //                    if (acc + coins(Ind2) + coins(Ind2 + 1) < value) {
  //                      loop(value, coins, lcoins.tail, Ind1, Ind2 , acc + coins(Ind2) + coins(Ind2 + 1), count)
  //                    } else {
  //                      loop(value, coins, lcoins, Ind1, Ind2, acc + coins(Ind2), count)
  //                    }
  //                  }
  //          else
  //           {
  //            loop(value, coins, lcoins, Ind1, Ind2 + 1, acc, count + 1)
  //          }
  //
  //        }
  //       else {
  //              loop(value, coins, lcoins.tail, Ind1 +1, 0, lcoins(0), count)
  //            }
  //
  //           }
  //
  //   loop(value, coins, coins,0,0, coins(0),1)
  //  }
  //
  //


}
