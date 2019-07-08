package ProjectEuler

//challenge three is to output the largest prime factor of a large number.
class ChallengeThree {
  def produceResult(inputNumber:Long):Unit = {
    var largeNum: Long = inputNumber
    var possibleFactor = 3
    var largestFactor = 0
    if (largeNum % 2 == 0) largestFactor = 2
    while (possibleFactor < Math.sqrt(largeNum)){
      if(largeNum % possibleFactor == 0) {
        largestFactor = possibleFactor
        largeNum = largeNum / possibleFactor
        possibleFactor = 3
      }else possibleFactor += 2
    }
    if (largeNum < largestFactor) println(largestFactor)
    else println(largeNum)
  }
}
