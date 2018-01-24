package com.example.demo.controller

import com.example.demo.bean.request.GetUserRequest
import com.example.demo.entity.User
import com.example.demo.service.GetUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/getUser")
class GetUserController {
    @Autowired
    lateinit var service: GetUserService

    @GetMapping
    fun getUserByName(@RequestParam("name") name: String): List<User> = service.getUserByName(name)

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    fun getUserById(@RequestBody body: GetUserRequest): User {
        return service.getUserById(body.id)
    }
}