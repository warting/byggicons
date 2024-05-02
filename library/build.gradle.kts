import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URL

plugins {
    id("com.android.library")
    id("kotlin-android")
    id("maven-publish")
    id("org.jetbrains.dokka") version "1.9.20"
    id("com.gladed.androidgitversion") version "0.4.14"
}

repositories {
    google()
    mavenCentral()
}



android {
    compileSdk = 32

    defaultConfig {
        minSdk = 21
    }

    buildTypes {
        named("release") {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
        freeCompilerArgs = listOf("-Xinline-classes", "-Xopt-in=kotlin.RequiresOptIn")
    }
}

dependencies {
    implementation("androidx.compose.ui:ui-tooling:1.6.7")
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.11.0")
}


androidGitVersion {
    tagPattern = "^v[0-9]+.*"
}

val libraryName = "byggicons"
val libraryGroup = "com.github.warting"
val libraryVersion = androidGitVersion.name().replace("v", "")

val androidJavadocJar by tasks.register<Jar>("androidJavadocJar") {
    dependsOn(tasks.dokkaJavadoc)
    from(tasks.dokkaJavadoc.flatMap { it.outputDirectory })
    archiveClassifier.set("javadoc")
}

val androidHtmlJar by tasks.register<Jar>("androidHtmlJar") {
    dependsOn(tasks.dokkaHtml)
    from(tasks.dokkaHtml.flatMap { it.outputDirectory })
    archiveClassifier.set("html-doc")
}

//val androidSourcesJar by tasks.register<Jar>("androidSourcesJar") {
//    archiveClassifier.set("sources")
//    from(android.sourceSets.getByName("main").java.srcDirs())
//}

publishing {
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/warting/byggicons")
            credentials {
                username = System.getenv("USERNAME")
                password = System.getenv("TOKEN")
            }
        }
    }
    publications {
        register<MavenPublication>("release") {

            artifactId = libraryName
            groupId = libraryGroup
            version = libraryVersion

            afterEvaluate { artifact(tasks.getByName("bundleReleaseAar")) }
            //artifact(tasks.getByName("androidJavadocJar"))
            //artifact(tasks.getByName("androidHtmlJar"))
            //artifact(tasks.getByName("androidSourcesJar"))

            pom {
                name.set(libraryName)
                description.set("Kotlin Lightweight Android permissions library that follows the best practices.")
                url.set("https://github.com/marcelpinto/permissions-ktx")

                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("marcelpinto")
                        name.set("Marcel Pinto")
                        email.set("marcel.pinto.biescas@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/marcelpinto/permissions-ktx.git")
                    developerConnection.set("scm:git:ssh://github.com/marcelpinto/permissions-ktx.git")
                    url.set("https://github.com/marcelpinto/permissions-ktx")
                }

                withXml {
                    fun groovy.util.Node.addDependency(dependency: Dependency, scope: String) {
                        appendNode("dependency").apply {
                            appendNode("groupId", dependency.group)
                            appendNode("artifactId", dependency.name)
                            appendNode("version", dependency.version)
                            appendNode("scope", scope)
                        }
                    }

                    asNode().appendNode("dependencies").let { dependencies ->
                        // List all "api" dependencies as "compile" dependencies
                        configurations.api.get().dependencies.forEach {
                            dependencies.addDependency(it, "compile")
                        }
                        // List all "implementation" dependencies as "runtime" dependencies
                        configurations.implementation.get().dependencies.forEach {
                            dependencies.addDependency(it, "runtime")
                        }
                    }
                }
            }

        }
    }
}