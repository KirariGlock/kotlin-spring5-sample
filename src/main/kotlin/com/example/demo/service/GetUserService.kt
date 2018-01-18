package com.example.demo.service

import com.example.demo.entity.User
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class GetUserService {
    @Autowired
    lateinit var repository: UserRepository

    fun getUserById(id: String): User = repository.findById(id).get()

    fun getUserByName(name: String): List<User> = repository.findByName(name)
}