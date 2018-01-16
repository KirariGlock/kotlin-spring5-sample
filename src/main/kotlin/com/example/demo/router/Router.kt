package com.example.demo.router

import com.example.demo.handler.Handler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.http.MediaType
import org.springframework.web.reactive.function.server.router

@Configuration
class Router(private val handler: Handler) {
    @Bean
    fun apis() = router {
        (accept(MediaType.APPLICATION_JSON)).nest {
            GET("/", handler::getJson)
        }
    }
}