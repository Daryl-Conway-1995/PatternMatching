package ProjectEuler

// in this task two variables are required and the final result is the difference between them
// the variables are: the sum squared of all number between 0 and 100
// and the squared sum of all numbers between 0 and 100.
// square sum = square all numbers then sum them.
// sum squared = sum all numbers then square them.
class ChallengeSix {
  def produceResult: Unit = {
    val numArray = 1 to 100
    val sumSquared = numArray.sum * numArray.sum
    val squaredSum = numArray.map(a => a * a).sum
    println(sumSquared - squaredSum)
  }
}
