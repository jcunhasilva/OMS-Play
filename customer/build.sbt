name := "customer"

version := "1.0"

organization := "com.portotechcenter.oms"

//resolvers += Resolver.file("Local repo", "/home/joseasilva/.ivy2/local"))(Resolver.ivyStylePatterns)

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"
libraryDependencies += "org.webjars" % "bootstrap" % "3.3.4"

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator

// sub-project this depends on
val coreModule = RootProject(file("../core"))

lazy val myProject = (project in file("."))
  .enablePlugins(PlayJava, PlayEbean)
  .dependsOn(coreModule)

EclipseKeys.projectFlavor := EclipseProjectFlavor.Java           // Java project. Don't expect Scala IDE
EclipseKeys.createSrc := EclipseCreateSrc.ValueSet(EclipseCreateSrc.ManagedClasses, EclipseCreateSrc.ManagedResources)  // Use .class files instead of generated .scala files for views and routes 
EclipseKeys.preTasks := Seq(compile in Compile)                  // Compile the project before generating Eclipse files, so that .class files for views and routes are present
