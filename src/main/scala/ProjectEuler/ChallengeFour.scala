package ProjectEuler

//the task is to find the largest palindromic number that is created by multiplying two three digit numbers.
class ChallengeFour {
  def produceResult:Unit = {

    var largestPalindromicNumber = 0l
    for (num1 <- 900l to 999l) {
      for (num2 <- 900l to 999l) {
        if (isPalindromic(num1 * num2) && (num1 * num2) > largestPalindromicNumber) {
          largestPalindromicNumber = num1 * num2
        }
      }
    }
    println(largestPalindromicNumber)
  }

  def isPalindromic(number:Long):Boolean ={
    number.toString == number.toString.reverse
  }
}
