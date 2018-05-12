
name := "$name$"

resolvers += Resolver.mavenLocal

lazy val commonSettings = Seq(
  organization := "$organization$",
  version := "$version$",
  scalaVersion := "$scalaVersion$"
)

javacOptions ++= Seq("-encoding", "UTF-8")

lazy val api = (project in file("$name$-api"))
  .settings(
    commonSettings,
    name := "$name$-api",
    libraryDependencies ++= Seq(
      "com.github.dapeng" % "dapeng-client-netty" % "$dapengVersion$"
    )
  ).enablePlugins(ThriftGeneratorPlugin)


lazy val service = (project in file("$name$-service"))
  .dependsOn( api )
  .settings(
    commonSettings,
    name := "$name$_service",
    libraryDependencies ++= Seq(
      "com.github.dapeng" % "dapeng-spring" % "$dapengVersion$",
      "com.github.wangzaixiang" %% "scala-sql" % "2.0.6",
      "org.slf4j" % "slf4j-api" % "1.7.13",
      "ch.qos.logback" % "logback-classic" % "1.1.3",
      "ch.qos.logback" % "logback-core" % "1.1.3",
      "org.codehaus.janino" % "janino" % "2.7.8", //logback (use if condition in logBack config file need this dependency)
      "mysql" % "mysql-connector-java" % "5.1.36",
      "com.alibaba" % "druid" % "1.0.17",
      "org.springframework" % "spring-context" % "4.3.5.RELEASE",
      "org.springframework" % "spring-tx" % "4.3.5.RELEASE",
      "org.springframework" % "spring-jdbc" % "4.3.5.RELEASE",
      "com.github.dapeng" % "dapeng-client-netty" % "$dapengVersion$"
    )).enablePlugins(ImageGeneratorPlugin)
    .enablePlugins(DbGeneratePlugin)
  .enablePlugins(RunContainerPlugin)
