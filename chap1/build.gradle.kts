buildscript {
	repositories {
		mavenCentral()
	}
	dependencies {
		classpath(kotlin("gradle-plugin", version = "1.3.50"))
	}
}

plugins {
	kotlin("jvm")
}
