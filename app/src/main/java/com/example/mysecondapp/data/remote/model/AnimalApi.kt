package com.example.mysecondapp.data.remote.model

data class AnimalApi(
    val externalId: String,
    val animalName: String,
    val decs: String,
    val createDate: Long, // time in millis
    val picture: String?, // link to picture
    val someApiData: String? = null, // link to picture
)