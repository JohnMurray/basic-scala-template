import sbt._
import Keys._
import spray.revolver.RevolverPlugin._
import org.scalastyle.sbt.ScalastylePlugin
 
object Resolvers {
}
 
object Dependencies {
   val appDependencies = Seq(
      "org.specs2" %% "specs2" % "2.3.10" % "test"
   )
}
 
object BuildSettings {
 
   val buildOrganization = "johnmurray.io"
   val appName = "CHANGE_ME"
   val buildVersion = "0.0.1-SNAPSHOT"
   val buildScalaVersion = "2.11.1"
   val buildScalaOptions = Seq("-unchecked", "-deprecation", "-encoding", "utf8")
 
   import Resolvers._
   import Dependencies._
 
   val buildSettings = Defaults.defaultSettings ++ Seq(
      organization         := buildOrganization,
      version              := buildVersion,
      scalaVersion         := buildScalaVersion,
      libraryDependencies ++= appDependencies,
      scalacOptions        := buildScalaOptions
   ) ++ Revolver.settings ++ ScalastylePlugin.Settings
}
 
object ApplicationBuild extends Build {
 
   import BuildSettings._
 
   lazy val main = Project(
      appName,
      file("."),
      settings = buildSettings)
}
