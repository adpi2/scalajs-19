val scala3Version = "3.1.3"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scalajs-19",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scala-js" % "scalajs-library_2.13" % "1.9.0"
  )
