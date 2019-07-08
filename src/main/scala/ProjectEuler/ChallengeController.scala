package ProjectEuler

object ChallengeController {
  def challenges1To4(): Unit ={
    println("Challenge One: ")
    val challenge = new ChallengeOne
    challenge.produceResult(0,1000)

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
  }
}
