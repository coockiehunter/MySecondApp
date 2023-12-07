package com.example.mysecondapp.domain.animal.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Animal(
    val dbIb: Long,
    val name: String,
    val decs: String,
    val createDate: String, // friday, 17:00
    val picture: Int?,
) : Parcelable
