ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "Session4Day4Assignment2"
  )
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.13.2" % Test,
  "org.scalatest" %% "scalatest" % "3.2.15" % Test
)

