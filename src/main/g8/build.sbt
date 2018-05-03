import scala.language.postfixOps


organization := "com.example"
scalaVersion := "2.12.5"
version      := "0.0.1-SNAPSHOT"

name := "$name$"

resolvers += Resolver.bintrayRepo("ephox", "flax")

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.5" % Test withSources,
  "org.specs2" %% "specs2-scalacheck" % "4.0.3" % Test withSources,
  "org.typelevel" %% "scalaz-specs2" % "0.5.2" % Test withSources,
  "com.ephox" %% "flax" % "2.8.0" % Test withSources
)

parallelExecution in Test := false