package com.example.mysecondapp.data.local

import com.example.mysecondapp.data.local.model.AnimalEntity

class AnimalDb {
    // simulation of database

    fun getAnimalList(): List<AnimalEntity> {
        // simulation of getting data from database
        return listOf(
            AnimalEntity(
                1,
                "dfghjkl",
                "Jack",
                "Jack's decription",
                System.currentTimeMillis(),
                null
            ),
            AnimalEntity(2, "wertyui", "Rex", "Rex's decription", System.currentTimeMillis(), null),
            AnimalEntity(3, "xcvbnm", "Amy", "Amy's decription", System.currentTimeMillis(), null),
        )
    }

    fun saveAnimalList(list: List<AnimalEntity>) {
        // simulation of saving to db
    }


}