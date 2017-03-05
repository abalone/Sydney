/**
  * Created by dihuibao on 5/3/2017.
  */
object TypeClassImplicit {

  implicit object StringFormatter extends Formatter[String] {
    override def format(t: String): Unit = {println ("String")}
  }

  implicit object DoubleFormatter extends Formatter[Double] {
    override def format(t: Double): Unit = {println ("Double")}
  }

  def format[T](t:T)(implicit formatter: Formatter[T]) = {
    formatter.format(t)
  }

  def main(args: Array[String]): Unit = {
    format("A")
    format(2.0)
  }
}

trait Formatter[T] {
  def format(t: T)
}


