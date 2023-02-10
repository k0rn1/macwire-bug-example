ThisBuild / scalaVersion     := "3.0.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "com.example"
ThisBuild / organizationName := "example"

lazy val root = (project in file("."))
  .settings(
    name := "scala-3",
    libraryDependencies ++= Seq(
      "com.softwaremill.macwire" %% "util" % "2.5.8",
      "com.softwaremill.macwire" %% "macros" % "2.5.8"
    )
  )
