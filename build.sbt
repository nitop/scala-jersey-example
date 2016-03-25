name := "scala-jersey-example"

version := "1.0"

scalaVersion := "2.11.8"

mainClass in assembly := Some("jp.nitop.Main")

libraryDependencies += "org.glassfish.jersey.containers" % "jersey-container-grizzly2-http" % "2.22.2"
