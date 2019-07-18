package ProjectEuler

class ChallengeTwentyone {
  def produceResult: Unit = {
    val findPairs = (0 until 10000).view
      .map(n => (1 to (n / 2)).filter(n % _ == 0).sum)

    val pairCollection = findPairs.zipWithIndex.collect {
      case (n, i) if n < 10000 && findPairs(n) != n
        && findPairs(n) == i => i
    }

    println(pairCollection.sum)
  }
}
