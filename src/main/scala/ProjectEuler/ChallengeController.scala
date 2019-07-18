package ProjectEuler

object ChallengeController {
  def challenges1To4(): Unit = {
    println("Challenge One: ")
    val challenge = new ChallengeOne
    challenge.produceResult(0, 1000)

    println("Challenge Two: ")
    val challenge2 = new ChallengeTwo
    challenge2.produceResult(4000000)

    println("Challenge Three: ")
    val challenge3 = new ChallengeThree
    challenge3.produceResult(600851475143l)

    println("Challenge Four: ")
    val challenge4 = new ChallengeFour
    challenge4.produceResult
  }

  def challenges5To8(): Unit = {
    println("Challenge Five: ")
    val challenge5 = new ChallengeFive
    challenge5.produceResult(20)

    println("Challenge Six: ")
    val challenge6 = new ChallengeSix
    challenge6.produceResult

    println("Challenge Seven: ")
    val challenge7 = new ChallengeSeven
    challenge7.produceResult

    println("Challenge Eight: ")
    val challenge8 = new ChallengeEight
    challenge8.produceResult
  }

  def challenges9To12(): Unit = {
    println("Challenge Nine: ")
    val challenge9 = new ChallengeNine
    challenge9.produceResult(1000)

    println("Challenge Ten: ")
    val challenge10 = new ChallengeTen
    challenge10.produceResult(2000000)

    println("Challenge Eleven: ")
    val challenge11 = new ChallengeEleven
    challenge11.produceResult

    println("Challenge Twelve: ")
    val challenge12 = new ChallengeTwelve
    challenge12.produceResult(500)
  }

  def challenges13To16(): Unit = {
    println("Challenge Thirteen: ")
    val challenge13 = new ChallengeThirteen
    challenge13.produceResult

    println("Challenge Fourteen: ")
    val challenge14 = new ChallengeFourteen
    challenge14.produceResult(1000000)

    println("Challenge Fifteen: ")
    val challenge15 = new ChallengeFifteen
    challenge15.produceResult(2)

    println("Challenge Sixteen: ")
    val challenge16 = new ChallengeSixteen
    challenge16.produceResult(1000)
  }

  def challenges17To20(): Unit = {
    println("Challenge Seventeen: ")
    val challenge17 = new ChallengeSeventeen
    challenge17.produceResult

    println("Challenge Eighteen: ")
    val challenge18 = new ChallengeEighteen
    challenge18.produceResult

    println("Challenge Nineteen: ")
    val challenge19 = new ChallengeNineteen
    challenge19.produceResult

    println("Challenge Twenty: ")
    val challenge20 = new ChallengeTwenty
    challenge20.produceResult(100)
  }

  def challenges21To24(): Unit = {
    println("Challenge Twentyone: ")
    val challenge21 = new ChallengeTwentyone
    challenge21.produceResult
//
//    println("Challenge Twentytwo: ")
//    val challenge22 = new ChallengeTwentytwo
//    challenge22.produceResult
//
//    println("Challenge Twentythree: ")
//    val challenge23 = new ChallengeTwentythree
//    challenge23.produceResult
//
//    println("Challenge Twentyfour: ")
//    val challenge24 = new ChallengeTwentyfour
//    challenge24.produceResult
  }

}
