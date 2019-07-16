package ProjectEuler

import scala.io.Source

class ChallengeEighteen {
  def produceResult: Unit = {
    val source = Source.fromFile("pyramid_18").getLines()
    val pyramid = source.map(_.split(" ")).map(_.map(_.toInt)).toIndexedSeq

    val memory = collection.mutable.Map[(Int, Int), Int]()

    def getMaxValue(i: Int, j: Int): Int = {
      if (i == pyramid.length) 0
      else memory.getOrElseUpdate((i, j), pyramid(i)(j) + Math.max(getMaxValue(i + 1, j) ,getMaxValue(i + 1, j + 1)))
    }

    println(getMaxValue(0,0))
  }
}
