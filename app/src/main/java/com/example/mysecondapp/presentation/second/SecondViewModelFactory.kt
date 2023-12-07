package com.example.mysecondapp.presentation.second

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class SecondViewModelFactory(private val ctx: Context) : ViewModelProvider.NewInstanceFactory() {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        ctx.applicationContext
        return when (modelClass) {
            SecondViewModel::class.java -> SecondViewModel() as T
            else -> super.create(modelClass)
        }
    }


}


