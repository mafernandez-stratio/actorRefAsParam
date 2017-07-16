import akka.actor.{Actor, ActorRef}

/**
  * Created by miguelangelfernandezdiaz on 16/07/2017.
  */
class ServerActor(executor: ActorRef) extends Actor {

  override def receive: Receive = {
    case quantity: Int => executor forward quantity
    case _ => println("Nothing to do")
  }
}
