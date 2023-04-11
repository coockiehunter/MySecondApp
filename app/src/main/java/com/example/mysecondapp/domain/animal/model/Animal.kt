package com.example.mysecondapp.domain.animal.model

data class Animal(
    val dbIb: Long,
    val name: String,
    val decs: String,
    val createDate: String, // friday, 17:00
    val picture: Int?,
)
