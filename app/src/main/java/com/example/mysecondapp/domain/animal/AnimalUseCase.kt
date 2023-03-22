package com.example.mysecondapp.domain.animal

import com.example.mysecondapp.data.AnimalRepository
import com.example.mysecondapp.data.local.model.AnimalEntity
import com.example.mysecondapp.domain.animal.model.Animal
import kotlinx.coroutines.delay
import java.text.SimpleDateFormat
import java.util.*

object AnimalUseCase {

    private val repo = AnimalRepository

    suspend fun getAnimal(): List<Animal> {
        val dataFromRepo = repo.getAnimalList()
        val data = ArrayList<Animal>()
        dataFromRepo.forEach {
            data.add(mapEntityToDomain(it))
        }
        delay(200)
        return data
    }

    fun mapEntityToDomain(data: AnimalEntity): Animal {
        val date = Date(data.createDate)
        val dateStr = SimpleDateFormat("dd MMMM yyyy", Locale.getDefault()).format(date)
        return Animal(
            data.id,
            data.name,
            data.decs,
            dateStr,
            data.picture
        )

    }


}