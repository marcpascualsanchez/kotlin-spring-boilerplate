import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import Build_gradle.Versions.cucumber
import Build_gradle.Versions.junit
import Build_gradle.Versions.wiremock

plugins {
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
	kotlin("jvm") version "1.8.22"
	kotlin("plugin.spring") version "1.8.22"
	id("org.jetbrains.kotlin.plugin.jpa") version "1.7.10"
}

group = "com.marcpascualsanchez"
version = "0.0.1-SNAPSHOT"

object Versions {
	const val cucumber = "7.8.1"
	const val wiremock = "2.27.2"
	const val junit = "5.4.0"
}

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
	maven("https://packages.confluent.io/maven/")
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	implementation("org.jetbrains.kotlin:kotlin-reflect")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("com.github.tomakehurst:wiremock:$wiremock")
	testImplementation("io.cucumber:cucumber-java:$cucumber")
	testImplementation("io.cucumber:cucumber-junit:$cucumber")
	testImplementation("io.cucumber:cucumber-spring:$cucumber")
	testImplementation("org.junit.jupiter:junit-jupiter:$junit")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
