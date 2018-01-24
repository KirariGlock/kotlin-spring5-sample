package com.example.demo.controller

import com.example.demo.entity.User
import com.example.demo.service.GetUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
class GetUserController {
    @Autowired
    lateinit var service: GetUserService

    @RequestMapping("/getUser")
    fun getUserByName(@RequestParam("name") name: String): List<User> = service.getUserByName(name)

    //@RequestMapping("/getUser")
    //fun getUserById(@RequestParam("id") id: String): User = service.getUserById(id)
}