object NearestTo100 extends App {
  def findNearest(a: Int, b: Int): Int = {
      val diffA = math.abs(100 - a)
      val diffB = math.abs(100 - b)

      if (diffA < diffB) a
      else if (diffB < diffA) b
      else 0

  }

  // test
  println("Enter the first integer:")
  val num1 = scala.io.StdIn.readLine().toInt

  println("Enter the second integer:")
  val num2 = scala.io.StdIn.readLine().toInt

  val result = findNearest(num1, num2)

  result match {
    case 0 => println(s"$num1 and $num2 are equally near to 100.")
    case _ => println(s"$result is nearest to 100.")
  }
}
