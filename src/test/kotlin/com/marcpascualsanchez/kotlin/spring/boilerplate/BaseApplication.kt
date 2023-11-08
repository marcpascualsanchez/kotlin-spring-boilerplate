package com.marcpascualsanchez.kotlin.spring.boilerplate

import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration

@SpringBootTest(classes = [KotlinSpringBoilerplateApplication::class])
@ActiveProfiles("test")
@ContextConfiguration()
abstract class BaseApplication
