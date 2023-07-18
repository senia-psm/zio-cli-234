scalaVersion := "3.3.0"

name := "test"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % "2.0.15",
  "dev.zio" %% "zio-cli" % "0.6.0+12-91583cc2-SNAPSHOT",
)

enablePlugins(JavaAppPackaging)