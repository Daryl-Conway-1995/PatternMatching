package ProjectEuler

//the task is to be able to calculate a number that far surpasses the range of int or long and convert it to
// separate digits and out the sum of those digits.
class ChallengeSixteen {
  def produceResult(power: Int): Unit = {
    println(BigInt(2).pow(power).toString().view.map(_.asDigit).sum)
  }
}
