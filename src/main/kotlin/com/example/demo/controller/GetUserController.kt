package com.example.demo.controller

import com.example.demo.entity.User
import com.example.demo.service.GetUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/getUser")
class GetUserController {
    @Autowired
    lateinit var service: GetUserService

    @GetMapping(value = ["/{name}]"])
    fun getUserByName(@PathVariable name: String): List<User> = service.getUserByName(name)

    @GetMapping(value = ["/{id}]"])
    fun getUserById(@PathVariable id: String): User = service.getUserById(id)
}