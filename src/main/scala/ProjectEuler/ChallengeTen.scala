package ProjectEuler

//the task is to sum all primes under a given number
class ChallengeTen {
  def produceResult(maxInt: Int): Unit = {
    var total = 0l
    for(a <- 2 to maxInt){
      if(isItPrime(a)) total += a
    }
    println(total)
  }
    def isItPrime(number:Int): Boolean ={
    if (number <= 1) false
    else if (number == 2) true
    else !(2 to Math.sqrt(number).toInt).exists(x => number % x == 0)
  }

}
