package com.example.demo.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "user")
data class User(
        @Id
        val id: String = "",

        @Column(name = "name")
        val name: String = ""
)