val zioVersion = "2.1.21"

lazy val root = project
  .in(file("."))
  .settings(
    name := "zio-scala3-quickstart",
    Test / test := {
      val _ = (Test / g8Test).toTask("").value
    },
    libraryDependencies ++= Seq(
      "dev.zio"        %% "zio"               % zioVersion,
      "dev.zio"        %% "zio-test"          % zioVersion % Test,
      "dev.zio"        %% "zio-test-sbt"      % zioVersion % Test,
      "dev.zio"        %% "zio-test-junit"    % zioVersion % Test,
      "dev.zio"        %% "zio-test-magnolia" % zioVersion % Test,
      "org.scala-lang" %% "scala3-library"    % "3.7.3" // trigger updates for Scala
    ),
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8"),
    resolvers += Resolver.url("typesafe", url("https://repo.typesafe.com/typesafe/ivy-releases/"))(Resolver.ivyStylePatterns)
  )
