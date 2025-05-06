import com.vanniktech.maven.publish.SonatypeHost

plugins {
    kotlin("multiplatform") version "2.1.20"
    id("com.vanniktech.maven.publish") version "0.31.0"
}

repositories {
    mavenCentral()
}

group = "com.araksis"
version = "0.0.4"

kotlin {
    jvmToolchain(21)

    js(IR) {
        browser {}
        binaries.executable()
    }

    sourceSets {
        val jsMain by getting {
            dependencies {
                implementation(npm("@material/web", "2.3.0"))
            }
        }
    }
}

mavenPublishing {
    publishToMavenCentral(SonatypeHost.CENTRAL_PORTAL)
    signAllPublications()
    coordinates(group.toString(), "ktml", version.toString())

    pom {
        name = "Kotlin-HTML"
        description = "The library provides a convenient Kotlin DSL for creating HTML documents with support for Material Design components."
        inceptionYear = "2025"
        url = "https://github.com/k1ll1n/Kotlin-Material-HTML"
        licenses {
            license {
                name = "MIT"
                url = "https://github.com/k1ll1n/MaterialKot/blob/master/LICENSE"
            }
        }
        developers {
            developer {
                id = "k1ll1n"
                name = "k1ll1n"
                url = "https://github.com/k1ll1n"
            }
        }
        scm {
            url = "https://github.com/k1ll1n/Kotlin-Material-HTML"
            connection = "scm:git://github.com/k1ll1n/Kotlin-Material-HTML.git"
            developerConnection = "scm:ssh://github.com/k1ll1n/Kotlin-Material-HTML.git"
        }
    }
}