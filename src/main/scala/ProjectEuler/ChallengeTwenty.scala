package ProjectEuler

class ChallengeTwenty {
  def produceResult(range:Int): Unit = {
    def factorial(n: BigInt): BigInt =
      if (n < 2) 1
      else n * factorial(n - 1)
    println(factorial(range).toString.view.map(_.asDigit).sum)
  }
}
