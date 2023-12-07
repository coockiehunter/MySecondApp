package com.example.mysecondapp

data class Book(
    val name: String,
    val author: String,
    val year: Int = 0
) {

    fun read(number: Int): Boolean {
        //
        return true
    }


}
