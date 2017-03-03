/**
 * Created by dihuibao on 28/10/14.
 */
object ImplicitConversion {

  implicit def stringToString(s:String) = new BetterString(s)
  def main(args : Array[String]): Unit = {

    println("HAL".increment)
    show
  }

  def show = {
    println("BBB".increment)
  }
}

class BetterString(s: String) {
  def increment = s.map(c => (c+1).toChar)
}
