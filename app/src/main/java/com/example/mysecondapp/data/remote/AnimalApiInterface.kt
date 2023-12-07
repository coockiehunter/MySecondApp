package com.example.mysecondapp.data.remote

import com.example.mysecondapp.data.remote.model.AnimalApi

class AnimalApiInterface {

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
            AnimalApi(
                "dfghjkl",
                "Jack",
                "Jack's description from inet",
                System.currentTimeMillis(),
                null
            ),
            AnimalApi(
                "wertyui",
                "Rex",
                "Rex's description from inet",
                System.currentTimeMillis(),
                null
            ),
            AnimalApi(
                "xcvbnm",
                "Amy",
                "Amy's description from inet",
                System.currentTimeMillis(),
                null
            ),
        )

    }


}