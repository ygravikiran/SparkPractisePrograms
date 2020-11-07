name := "Hello"

version := "1.0"

scalaVersion := "2.12.3"

resolvers += "Typesafe Repository" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.0.1"

libraryDependencies +=    "org.scalatest" %% "scalatest" % "3.0.8" % Test

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.0.1" withSources() withJavadoc()

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.0.1" withSources() withJavadoc()

libraryDependencies += "com.databricks" %% "spark-xml" % "0.10.0" withSources() withJavadoc()

// https://mvnrepository.com/artifact/org.apache.spark/spark-avro
libraryDependencies += "org.apache.spark" %% "spark-avro" % "3.0.1" withSources() withJavadoc()

// https://mvnrepository.com/artifact/com.thoughtworks.xstream/xstream
libraryDependencies += "com.thoughtworks.xstream" % "xstream" % "1.4.13" withSources() withJavadoc()
