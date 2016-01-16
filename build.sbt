name := """marry-webapp"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.webjars" %% "webjars-play" % "2.4.0-1",
  "org.webjars" % "jquery" % "1.11.1",
  "org.webjars" % "bootstrap" % "3.3.4",
  "org.webjars" % "gsap-js" % "1.13.1",
  "org.webjars" % "ScrollMagic" % "2.0.5",
  specs2 % Test
)
resolvers ++= Seq(
  "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
