package com.example.mysecondapp.presentation.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysecondapp.domain.animal.AnimalUseCase
import com.example.mysecondapp.domain.animal.model.Animal
import com.example.mysecondapp.domain.weather.WeatherUseCase
import kotlinx.coroutines.launch

class SecondViewModel : ViewModel() {

    private val animalUseCase = AnimalUseCase
    private val weatherUseCase = WeatherUseCase

    val animalListLd = MutableLiveData<List<Animal>>()
    val weatherLd = MutableLiveData<String>()
    val isLoading = MutableLiveData<Boolean>()

    init {
        getAllData()
    }

//    fun getAnimalList() {
//        viewModelScope.launch {
////            isLoading.postValue(true)
//            val data = animalUseCase.getAnimal()
//            animalListLd.postValue(data)
////            isLoading.postValue(false)
//        }
//    }

    fun getAllData() {
        viewModelScope.launch {
            isLoading.postValue(true)

            val animalList = animalUseCase.getAnimal()
            animalListLd.postValue(animalList)

            val data = weatherUseCase.getWeather()
            weatherLd.postValue(data)

            isLoading.postValue(false)
        }
    }

    fun saveUserData(v1: String, v2: String, v3: Int) {
        //
    }


}