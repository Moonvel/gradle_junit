plugins {
    id("java")
}

group = "ru"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation ("org.junit.jupiter:junit-jupiter-api:5.10.2")
    testImplementation ("org.junit.jupiter:junit-jupiter-engine:5.10.2")
}

tasks.test {
    testLogging {
        events ("passed", "skipped", "failed", "standardOut", "standardError")
    }
    useJUnitPlatform {
        val tag = project.properties["tag"] as? String
        if (!tag.isNullOrBlank()) {
            includeTags(tag)
        }
        doFirst {
            if (!tag.isNullOrBlank()) {
                println("Running with tags: $tag")
            }
        }
    }
}

