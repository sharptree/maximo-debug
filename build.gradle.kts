plugins {
    kotlin("jvm") version "1.8.0"
}

group = "io.sharptree"
version = "1.0"

val vendor = "Sharptree"
val product = "maximo-debug"

repositories {
    mavenCentral()
}

dependencies {
    compileOnly(fileTree( "libs") { listOf("*.jar") })
}

tasks.test {
    useJUnitPlatform()
}

kotlin {
    jvmToolchain(8)
}