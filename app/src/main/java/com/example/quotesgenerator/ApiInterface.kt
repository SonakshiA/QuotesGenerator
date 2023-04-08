package com.example.quotesgenerator

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ApiInterface {
    @GET("quotes")
    fun getData():Call<ResponseDataClass>
}