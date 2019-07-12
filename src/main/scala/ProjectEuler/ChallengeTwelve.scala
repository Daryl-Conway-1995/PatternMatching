package ProjectEuler

//the task is to find an extremely dividable triangular number, the number requires 500+ divisors and has to be a
// triangular number following the pattern of: 1,3,6,10,15,etc
  class ChallengeTwelve {
  def produceResult(numberOfFactors:Int): Unit = {
    var currentNumber = 0
    var currentAddition = 1
    while (findNumberOfFactors(currentNumber)<numberOfFactors){
      currentNumber += currentAddition
      currentAddition += 1
    }
    println(currentNumber)
  }

  private def primeFactorization(num:Long):List[Long] = {
    val exists = (2l to math.sqrt(num).toLong).find(num % _ == 0)
    exists match {
      case Some(digit) => digit :: primeFactorization(num/digit)
      case None =>  List(num)
    }
  }

  private def findNumberOfFactors(num:Long): Int = {
    primeFactorization(num).groupBy(identity).values.map(_.length + 1).product
  }
}
