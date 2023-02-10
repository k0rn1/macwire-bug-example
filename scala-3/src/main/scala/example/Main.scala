import com.softwaremill.macwire.wire

case class Berry(var name: String)
case class Basket(berry: Berry)

object Main extends App {
  val blackberry: Berry = Berry("blackberry")
  val basket: Basket = {
      lazy val raspberry: Berry = Berry("raspberry")
      wire[Basket]
  }
  println(basket.berry.name) // blackberry
}

