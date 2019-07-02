import scala.util.matching.Regex

class PatternController {
  private val matchStatementStart = "The input variable is a "
  private val numberRegex = "[0-9]*"
  def matchPattern(userInput:Any):Unit= userInput match {
    case _:Int => println(matchStatementStart + "number")
    case _:Double => println(matchStatementStart + "number")
    case s:String if s.matches(numberRegex)=> println(matchStatementStart + "number")
    case _:String => println(matchStatementStart + "string")
    case _ => println("unknown type")
  }

  def matchPattern(wantedPattern:String, currentPattern:Any):Unit={
    if(wantedPattern.matches(currentPattern.toString)) println("The patterns match")
    else println("the patterns do not match")
  }

  def matchRegex(regex:Regex, string:String):Unit={
    if(regex.matches(string)) println("the string matches the regex")
    else println("the string doesn't match the regex")
  }
}
