plugins {
    kotlin("jvm") version "1.9.20" apply false
}

group = "funny.buildapp.bluetooth"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        mavenCentral()
        google()
    }
}

