val zioVersion = "2.1.27"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScriptedPlugin) // workaround untill https://github.com/foundweekends/giter8/pull/1088
  .settings(
    name := "zio-scala3-quickstart",
    libraryDependencies ++= Seq(
      "dev.zio"        %% "zio"               % zioVersion,
      "dev.zio"        %% "zio-test"          % zioVersion % Test,
      "dev.zio"        %% "zio-test-sbt"      % zioVersion % Test,
      "dev.zio"        %% "zio-test-junit"    % zioVersion % Test,
      "dev.zio"        %% "zio-test-magnolia" % zioVersion % Test
    ),
    scriptedLaunchOpts ++= List("-Xms1024m", "-Xmx1024m", "-XX:ReservedCodeCacheSize=128m", "-Xss2m", "-Dfile.encoding=UTF-8")
  )
