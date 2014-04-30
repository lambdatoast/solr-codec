name := "solr-codec"

version := "0.1"

scalaVersion := "2.10.2"

scalacOptions ++= Seq("-deprecation", "-unchecked", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-language:postfixOps")

resolvers += "Scalaz Bintray Repo" at "http://dl.bintray.com/scalaz/releases"

libraryDependencies += "io.argonaut" %% "argonaut" % "6.0.4"
