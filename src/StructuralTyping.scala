/**
 * Created by dihuibao on 27/10/14.
 */
object StructuralTyping {
  def main(args : Array[String]): Unit = {
    (new Duck).f(new BigDuck)
    //(new Duck).f(new NotDuck)
  }
}

class Duck {
  def f (duck : { def quack }) { duck.quack}
}

class BigDuck {
  def quack = { println ("BigDuck")}
}

class NotDuck {
  def noquack = {}
}
