/**
  * Created by dihuibao on 5/3/2017.
  */
sealed trait SealedTrait {

}

case object TraitA extends SealedTrait {

}

case object TraitB extends SealedTrait {

}

object Main {
  def main(args: Array[String]): Unit = {


    val input: SealedTrait = TraitA
    input match {
      case TraitA => println("A")
      case TraitB => println("B")
    }
  }
}
