/**
 * Created by dihuibao on 27/10/14.
 */
object ConstructorParams {

  def main(args: Array[String]): Unit = {
    val a =  new ClassA(3,2)
    a.display

    println(a.b)
    a.b = 1
    println(a.b)

  }
}

class ClassA (private val a : Int, c: Int) {
  var b = 0
  def display = println(a)
}
