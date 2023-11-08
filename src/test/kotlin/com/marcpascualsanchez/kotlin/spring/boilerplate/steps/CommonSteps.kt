package com.marcpascualsanchez.kotlin.spring.boilerplate.steps

import com.marcpascualsanchez.kotlin.spring.boilerplate.BaseApplication
import io.cucumber.java.en.Given
import io.cucumber.spring.CucumberContextConfiguration

@CucumberContextConfiguration
class CommonSteps : BaseApplication() {

    @Given("a POST is received with body {string}")
    fun `a POST is received with body`(fileName: String) {
        println(fileName)
    }
}