name := "scalavsjdk8"

version := "1.0"

scalaVersion := "2.11.6"

scalacOptions ++= Seq("-target:jvm-1.7", "-unchecked", "-feature")

libraryDependencies ++= Seq(
	"org.scalatest" %% "scalatest" % "2.2.4" % "test"
)
