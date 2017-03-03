/**
 * Created by dihuibao on 26/10/14.
 */
object BankAccount {

  def main(args : Array[String]): Unit = {
    val account = new BankAccount
    account deposit 100
    account withdraw 80
    println (account balance)

    //
    var capitals = Map("China" -> "Beijing", "Japan" -> "Tokyo")
    capitals += ("Russia"-> "Moscow")
    println (capitals("China"))
  }
}

class BankAccount {
  private var bal = 0

  def balance = bal

  def deposit (amount : Int)= {
    require(amount > 0)
    bal += amount
  }

  def withdraw (amount : Int): Boolean = {
    if(amount > bal) false
    else {
      bal -= amount
      true
    }
  }
}
