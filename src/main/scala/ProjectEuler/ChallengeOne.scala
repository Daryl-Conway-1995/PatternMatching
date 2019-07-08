package ProjectEuler


// challenge 1 is a simple task of pattern matching numbers.
// the goal is to find numbers that are a multiple of 3 or 5 while between 0 and 1000 and then sum the resulting array.
class ChallengeOne {
  def produceResult(min:Int, max:Int):Unit = {
    var total = 0
    for (currentInt <- min until max) {
      currentInt match {
        case _ if currentInt % 3 == 0 => total += currentInt
        case _ if currentInt % 5 == 0 => total += currentInt
        case _ =>
      }
    }
    println(total)
  }
}
