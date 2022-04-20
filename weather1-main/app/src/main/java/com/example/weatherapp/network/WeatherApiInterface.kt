package com.example.weatherapp.network

import com.example.weatherapp.data.ModelClass
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherApiInterface {

    @GET("weather")
    fun getCurrentWeatherData(
        @Query("lat") latitude: String,
        @Query("lon") longitude: String,
        @Query("appid") api_key: String,
    ):Call<ModelClass>

    @GET("weather")
    fun getCityWeatherData(
        @Query("q") cityName: String,
        @Query("appid") api_key: String,
    ):Call<ModelClass>
}