import akka.actor.Actor

/**
  * Created by miguelangelfernandezdiaz on 16/07/2017.
  */
class ExecutorActor(price: Int) extends Actor {
  override def receive: Receive = {
    case quantity: Int => println(s"Total amount: ${quantity*price}")
    case _ => println("Unknown request")
  }
}
