# Testing locally

* using Giter8

```shell script
g8 file://zio-scala3-quickstart.g8/ --name=foo --force
cd foo
sbt clean test
```

* using SBT

This way is not ideal (e.g. no complains on unescaped $)

```shell script
sbt g8Test
cd target/sbt-test/zio-scala3-quickstart/scripted
sbt clean test
```
