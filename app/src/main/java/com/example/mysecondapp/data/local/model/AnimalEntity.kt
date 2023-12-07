package com.example.mysecondapp.data.local.model

data class AnimalEntity(
    val id: Long,
    val externalId: String,
    val name: String,
    val decs: String,
    val createDate: Long, // 23456789765434567890L
    val picture: Int?, // resId R.id.img
)
