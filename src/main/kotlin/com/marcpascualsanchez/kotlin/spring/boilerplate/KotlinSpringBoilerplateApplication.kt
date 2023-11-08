package com.marcpascualsanchez.kotlin.spring.boilerplate

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinSpringBoilerplateApplication

fun main(args: Array<String>) {
    runApplication<KotlinSpringBoilerplateApplication>(*args)
}
