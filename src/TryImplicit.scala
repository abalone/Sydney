/**
  * Created by dihuibao on 3/3/2017.
  */
object TryImplicit {

  implicit val a = 100

  def f(b : Int)(implicit a: Int): Int = {
    a+b
  }

  def main(args: Array[String]): Unit = {
    println(f(1000))
    println(TryImplicit2.ff(2000))
  }
}

object TryImplicit2 {
  implicit  val a = 200
  def ff(b: Int)(implicit  a: Int): Int = {
    a+b
  }

}
