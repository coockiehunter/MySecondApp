package com.example.mysecondapp.presentation.second

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysecondapp.domain.animal.AnimalUseCase
import com.example.mysecondapp.domain.animal.model.Animal
import kotlinx.coroutines.launch

class SecondViewModel : ViewModel() {

    private val animalUseCase = AnimalUseCase

    val animalListLd = MutableLiveData<List<Animal>>()
    val isLoading = MutableLiveData<Boolean>()

    init {
        getAnimalList()
    }

    fun getAnimalList() {
        viewModelScope.launch {
            isLoading.postValue(true)
            val data = animalUseCase.getAnimal()
            animalListLd.postValue(data)
            isLoading.postValue(false)
        }

    }


}