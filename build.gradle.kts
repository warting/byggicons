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
        classpath("com.android.tools.build:gradle:7.3.1")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.21")
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