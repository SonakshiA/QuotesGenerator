package com.example.quotesgenerator

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitObject {

    private val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://type.fit/api/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }

    val apiInterface by lazy{
        retrofit.create(ApiInterface::class.java)
    }
}