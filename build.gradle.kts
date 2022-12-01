plugins {
    kotlin("jvm") version "1.7.21"
}

repositories {
    mavenCentral()
}
dependencies {
    implementation("org.junit.jupiter:junit-jupiter:5.9.0")
}

tasks {
    sourceSets {
        main {
            java.srcDirs("src")
        }
    }

    wrapper {
        gradleVersion = "7.5.1"
    }
}
