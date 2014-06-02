package org.akka.essentials.remotenode
import akka.kernel.Bootable
import akka.actor.ActorSystem
import akka.actor.Props
import com.typesafe.config.ConfigFactory

object RemoteActorSystem{
  def main(args: Array[String]):Unit = {
    val system = ActorSystem("RemoteNodeApp", ConfigFactory.load().getConfig("RemoteSys"))
    val remoteActor = system.actorOf(Props[RemoteActor], name = "remoteActor")
  }
  /*
  def startup = {
    system.actorOf(Props[RemoteActor], name = "remoteActor")
  }

  def shutdown = {
    system.shutdown()
  }
  */
}