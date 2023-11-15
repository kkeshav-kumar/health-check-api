package com.example.healthcheckapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class HealthCheckApiApplication

fun main(args: Array<String>) {
	runApplication<HealthCheckApiApplication>(*args)
}
