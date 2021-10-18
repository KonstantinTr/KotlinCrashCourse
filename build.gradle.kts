import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

group = "org.some.domain"
version = "1.0-SNAPSHOT"

plugins {
    kotlin("jvm") version "1.5.31"
    id("com.github.johnrengelman.shadow") version "7.1.0"
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

tasks.test {
    useJUnitPlatform()
}
