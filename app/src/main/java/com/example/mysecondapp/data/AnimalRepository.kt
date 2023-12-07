package com.example.mysecondapp.data

import com.example.mysecondapp.data.local.AnimalDb
import com.example.mysecondapp.data.local.model.AnimalEntity
import com.example.mysecondapp.data.remote.AnimalApiInterface
import com.example.mysecondapp.data.remote.model.AnimalApi

object AnimalRepository {

    private val animalDb = AnimalDb()
    private val api = AnimalApiInterface()

    fun getAnimalList(): List<AnimalEntity> {

        val dataFromInet: List<AnimalApi>? = api.getAnimalList()
        if (dataFromInet != null) {
            val dataFromCache = ArrayList<AnimalEntity>()
            dataFromInet.forEach {
                dataFromCache.add(mapApiToEntity(it))
            }
            animalDb.saveAnimalList(dataFromCache)
//            return dataFromCache
            return animalDb.getAnimalList()
        } else {
            return animalDb.getAnimalList()
        }

    }

    private fun mapApiToEntity(apiData: AnimalApi): AnimalEntity {
        return AnimalEntity(
            System.currentTimeMillis(),
            apiData.externalId,
            apiData.animalName,
            apiData.decs,
            apiData.createDate,
            null
        )
    }


}