/**
 * Created by dihuibao on 30/10/14.
 */
object Bound {
  def main(args : Array[String]): Unit = {

    new Investor(new Company[Small](new Small))
  }
}

class Company[T] (val company: T)

class Big

class Small extends Big

class Investor(val company : Company[Small])