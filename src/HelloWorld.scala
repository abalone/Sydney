import java.util.{Locale, Date}

/**
 * Created by dihuibao on 25/10/14.
 */
object HelloWorld {

    def oncePerSecond(callback : ()=> Unit): Unit = {
      while(true) {callback(); Thread sleep 1000 }
    }

    def timeFlies(): Unit = {
      println("time flies like an arrow...")
    }

    def main(args: Array[String]): Unit = {
      oncePerSecond(timeFlies)
    }

}
