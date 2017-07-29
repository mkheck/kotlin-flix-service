package com.example.kotlinflixservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinFlixServiceApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinFlixServiceApplication::class.java, *args)
}
