package com.example.mysecondapp.presentation.first

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class FirstViewModel : ViewModel() {

    val isLoading = MutableLiveData<Boolean>()


    fun loadData() {
        viewModelScope.launch {
            isLoading.postValue(true)
            //
            isLoading.postValue(false)

        }
    }

}