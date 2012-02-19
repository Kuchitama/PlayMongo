import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "PlayMongo"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
      "com.mongodb.casbah" % "casbah_2.9.0-1" % "2.1.5.0",
      "com.novus" %% "salat-core" % "0.0.8-SNAPSHOT",
      "org.mockito" % "mockito-core" % "1.8.5" % "test->default"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = SCALA).settings(
      // Add your own project settings here
      resolvers += "repo.novus rels" at "http://repo.novus.com/releases/",
      resolvers += "repo.novus snaps" at "http://repo.novus.com/snapshots/"
    )
    
}
