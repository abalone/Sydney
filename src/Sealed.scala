/**
  * Created by dihuibao on 4/3/2017.
  */
sealed class Sealed {

}

class Sealed3 extends Sealed {

}


object Sealed {
  def main(args: Array[String]): Unit = {

    val a = new Sealed

    val b = a match {
      case p: Sealed => "hello"
    }

  }
}
