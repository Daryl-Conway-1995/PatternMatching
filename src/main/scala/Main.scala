object Main extends App{
  val patternController = new PatternController
  patternController.matchPattern(123)
  patternController.matchPattern("123")
  patternController.matchPattern(6.5)
  patternController.matchPattern("abc")
  patternController.matchPattern("abc123")
  patternController.matchPattern("123abc")
  patternController.matchPattern(true)
  patternController.matchPattern("456",456)
  patternController.matchPattern("abc",456)
  patternController.matchRegex("[\\d]*".r,"12345")
  patternController.matchRegex("[A-Z]{3}[0-9]{2}".r,"ABC12")
}
