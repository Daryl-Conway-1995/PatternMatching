package ProjectEuler

// the task revolves around being able to find prime numbers. the prime number required is the 10,001st prime number.
class ChallengeSeven {
  def produceResult: Unit = {
    var primeCount = 0
    var currentNumber = 2
    while (primeCount != 10001){
      if(isItPrime(currentNumber)) primeCount += 1
      currentNumber += 1
    }
    println(currentNumber-1)
  }

  def isItPrime(number:Int): Boolean ={
    if (number <= 1) false
    else if (number == 2) true
     else !(2 to Math.sqrt(number).toInt).exists(x => number % x == 0)
  }
}
