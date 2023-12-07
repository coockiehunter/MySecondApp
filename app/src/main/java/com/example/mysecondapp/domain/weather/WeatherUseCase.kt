package com.example.mysecondapp.domain.weather

import com.example.mysecondapp.data.WeatherRepository

object WeatherUseCase {

    private val repo = WeatherRepository

    suspend fun getWeather(lat: String = "48.0", lon: String = "35.0"): String {

        // convert data for comfortable format for view

        val v = repo.getWeather(lat, lon)
        return v.toString()

    }


}