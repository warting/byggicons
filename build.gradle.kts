buildscript {
    repositories {
        maven {
            // until broken gradle plugin portal is fixed
            url = uri("https://premex.jfrog.io/artifactory/local-gradle-plugins/")
        }
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:8.0.2")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.8.22")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

task<Delete>("clean") {
    delete(rootProject.buildDir)
}