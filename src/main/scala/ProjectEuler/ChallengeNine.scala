package ProjectEuler

class ChallengeNine {
  def produceResult(totalLength: Int): Unit = {
    for (a <- 1 to totalLength / 2)
      for (b <- 1 to totalLength / 2) {
        val aSquare = a * a
        val bSquare = b * b
        val c = (totalLength - a) - b
        val cSquared = c * c
        if (aSquare+bSquare == cSquared) println("the three lengths are: " + a + " " +
          b + " " + c + " their product is: " + a * b * c)
      }
  }
}