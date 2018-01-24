package com.example.demo

import org.springframework.boot.WebApplicationType
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.runApplication

@SpringBootApplication
private class DemoApplication

fun main(args: Array<String>) {
    runApplication<DemoApplication>(*args)
}
