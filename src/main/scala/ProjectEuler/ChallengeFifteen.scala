package ProjectEuler

//the task is to determine how many paths are possible in a lattice of squares.
class ChallengeFifteen {

  def produceResult(squareOfSquares:Int): Unit = {
    produceResult(squareOfSquares,squareOfSquares)
  }

    def produceResult(lengthOfSquares:Int, heightOfSquares:Int): Unit = {
    println(factorial(lengthOfSquares+heightOfSquares) / (factorial(lengthOfSquares) * factorial(heightOfSquares)))
  }

  private def factorial(number:Int): BigInt ={
    (BigInt(1) to number).product
  }
}
