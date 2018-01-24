package com.example.demo.bean.request

import com.fasterxml.jackson.annotation.JsonCreator

data class GetUserRequest @JsonCreator constructor(
        val id: String = "",
        val name: String = ""
)