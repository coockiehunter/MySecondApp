package com.example.mysecondapp.data.remote

import com.example.mysecondapp.data.remote.model.AnimalApi

class Api {

    // simulation of internet

    fun getAnimalList(): List<AnimalApi>? {
        // randomizer
        if (System.currentTimeMillis() % 2 == 0L) {
            return generateAnimalList()
        } else {
            return null
        }
    }


    private fun generateAnimalList(): List<AnimalApi> {
        return listOf(
            AnimalApi("dfghjkl", "Jack", "Jack's decription", System.currentTimeMillis(), null),
            AnimalApi("wertyui", "Rex", "Rex's decription", System.currentTimeMillis(), null),
            AnimalApi("xcvbnm", "Amy", "Amy's decription", System.currentTimeMillis(), null),
        )

    }


}