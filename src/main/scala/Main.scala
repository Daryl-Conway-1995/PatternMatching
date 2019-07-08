import ProjectEuler._

object Main extends App{
  println("Challenge One: ")
  val challenge = new ChallengeOne
  challenge.produceResult(0,1000)

  println("Challenge Two: ")
  val challenge2 = new ChallengeTwo
  challenge2.produceResult(4000000)

  println("Challenge Three: ")
  val challenge3 = new ChallengeThree
  challenge3.produceResult(600851475143l)
}
