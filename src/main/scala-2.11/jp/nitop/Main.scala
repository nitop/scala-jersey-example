package jp.nitop

import java.net.URI

import org.glassfish.grizzly.http.server.HttpServer
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory
import org.glassfish.jersey.server.ResourceConfig

object Main {

  val BASE_URI = "http://localhost:8080/myapp/"

  def main(args: Array[String]) {
    val server = startServer()

    println(String.format("Jersey app started with WADL available at %sapplication.wadl\nHit enter to stop it...", BASE_URI))
    System.in.read()

    server.shutdownNow()
  }

  def startServer(): HttpServer = {
    GrizzlyHttpServerFactory.createHttpServer(
      URI.create(BASE_URI),
      new ResourceConfig().packages("jp.nitop"))
  }

}
