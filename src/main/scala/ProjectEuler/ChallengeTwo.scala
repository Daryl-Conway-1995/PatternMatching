package ProjectEuler

// challenge 2 is a simple task of utilising pattern matching with fibonacci numbers .
// the goal is to find even fib numbers under 4 million and sum them.
// as the number will be very large it is best to use a double rather then int.
class ChallengeTwo {
  def produceResult(max:Int): Unit = {
    var total: Double = 0
    var first: Double = 0
    var second: Double = 1
    while (second < max) {
      if (second % 2 == 0) total += second
      second = first + second
      first = second - first
    }
    println(total)
  }
}

