
scalaVersion := "2.12.11"

resolvers +=  Resolver.mavenCentral

val netLogo6Version = "6.1.1"


  libraryDependencies ++= Seq(
    "org.nlogo" % "netlogo" % netLogo6Version from s"https://dl.bintray.com/netlogo/NetLogo-JVM/org/nlogo/netlogo/$netLogo6Version/netlogo-$netLogo6Version.jar",
    //"org.scala-lang" % "scala-library" % "2.12.8" % "provided",
    //"org.scala-lang" % "scala-reflect" % "2.12.8" % "provided",
    //"org.scala-lang" % "scala-compiler" % "2.12.8" % "provided",
    "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.5",
    "commons-codec" % "commons-codec" % "1.10",
    "org.ow2.asm" % "asm-all" % "5.0.4",
    "org.picocontainer" % "picocontainer" % "2.13.6",
    "org.parboiled" %% "parboiled" % "2.1.3",
    "com.typesafe" % "config" % "1.3.1",
    "net.lingala.zip4j" % "zip4j" % "1.3.2")


