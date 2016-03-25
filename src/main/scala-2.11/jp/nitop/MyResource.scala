package jp.nitop

import javax.ws.rs.core.MediaType
import javax.ws.rs.{GET, Path, Produces}

@Path("myresource")
class MyResource {

  @GET
  @Produces(Array(MediaType.TEXT_PLAIN))
  def getIt() = "Got it!"

}
