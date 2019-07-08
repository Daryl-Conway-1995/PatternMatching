package ProjectEuler

//the task is to find the smallest number that is dividable by all ints between 1 and 20
class ChallengeFive {
  def produceResult(max:Int): Unit = {
   var lowestCommonMultiple = 1
    for(currentNumber <- 2 to max){
      var possibleMultiple = lowestCommonMultiple
      while (possibleMultiple % currentNumber !=0){
        possibleMultiple += lowestCommonMultiple
      }
      lowestCommonMultiple = possibleMultiple
    }
    println(lowestCommonMultiple)
  }
}
