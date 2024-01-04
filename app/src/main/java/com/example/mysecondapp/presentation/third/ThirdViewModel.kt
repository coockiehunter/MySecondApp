package com.example.mysecondapp.presentation.third

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.mysecondapp.domain.animal.AnimalUseCase
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class ThirdViewModel : ViewModel() {

    val useCase = AnimalUseCase

    val strLd = MutableLiveData<String>()

    val isLoadingLd = MutableLiveData<Boolean>()


    fun loadStrData() {
        viewModelScope.launch {

            isLoadingLd.postValue(true)
            //
            //        useCase.getAnimal()
            delay(600)

            strLd.postValue(System.currentTimeMillis().toString())
            //
            isLoadingLd.postValue(false)

        }
    }


}