import akka.actor.{ActorSystem, Props}

/**
  * Created by miguelangelfernandezdiaz on 16/07/2017.
  */
object Launcher extends App {

  // Create an AkkaActorSystem
  val system = ActorSystem.create("DataFederationSystem")

  val executor = system.actorOf(Props(classOf[ExecutorActor], 10), "executor")

  val server = system.actorOf(Props(classOf[ServerActor], executor), "server")

  server ! 25

  system.terminate()

}
