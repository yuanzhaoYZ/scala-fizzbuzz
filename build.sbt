name := "scala-fizzbuzz"

version := "0.9.3"

// http://www.scala-lang.org/
scalaVersion := "2.10.1"

/* https://github.com/KentBeck/junit */
/* https://github.com/szeiger/junit-interface/ */
libraryDependencies ++= Seq(
    "junit" % "junit" % "4.11" % "test",
    "com.novocode" % "junit-interface" % "0.10-M3" % "test"
)
