plugins {
	`java-library` // Adds tasks from the Java Library plug-in
	kotlin("jvm") version "1.3.50" // Adds the Kotlin plug-in to Gradle
}

repositories {
	jcenter()
}

dependencies {
	implementation(kotlin("stdlib")) // Adds the Kotlin standard library to the project at compile time
}
