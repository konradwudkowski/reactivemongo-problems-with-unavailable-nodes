
lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "reactivemongo-problems",
    libraryDependencies ++= Seq(
      "org.reactivemongo" %% "reactivemongo" % "0.15.0",
      "ch.qos.logback" % "logback-classic" % "1.2.3"
    )
  )
