object Main extends App{

  val matchStatementStart = "The input variable is a "
  val numberRegex = "[0-9]*"
  def patternMatching(userInput:Any):Unit= userInput match {
    case _:Int => println(matchStatementStart + "number")
    case _:Double => println(matchStatementStart + "number")
    case s:String if s.matches(numberRegex)=> println(matchStatementStart + "number")
    case _:String => println(matchStatementStart + "string")
    case _ => println("unknown type")
  }

  patternMatching(123)
  patternMatching("123")
  patternMatching(6.5)
  patternMatching("abc")
  patternMatching("abc123")
  patternMatching("123abc")
  patternMatching(true)
}
