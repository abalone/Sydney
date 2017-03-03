/**
 * Created by dihuibao on 28/10/14.
 */
import Dihui._


object Dihui {
  implicit val prompt = new Prompt(">>>>>>")
}

object ImplicitParameter extends App{
    greet("dihui")


  def greet(name : String) (implicit prompt : Prompt): Unit = {
    println(name + prompt.prompt)
  }

}


class Prompt (val prompt : String){
}
