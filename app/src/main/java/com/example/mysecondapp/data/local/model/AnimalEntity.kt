package com.example.mysecondapp.data.local.model

data class AnimalEntity(
    val id: Long,
    val externalId: String,
    val name: String,
    val decs: String,
    val createDate: Long,
    val picture: Int?, // resId R.id.img
)
