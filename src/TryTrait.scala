/**
 * Created by dihuibao on 27/10/14.
 */
object TryTrait {
 def main(args: Array[String]): Unit = {
   val XY1 = new AnyRef with X with Y
   println(XY1)
   XY1.a

   val XY2 = new AnyRef with Y with X
   println(XY2)
   XY2.a
 }
}


trait A {
  def a = 1
}

trait X extends A {
  override def a = {
    println("X")
    super.a
  }
}

trait Y extends A {
  override def a = {
    println("Y")
    super.a
  }
}
