package com.example.myuas67.api

import com.example.myuas67.Model.Model
import retrofit2.Call
import retrofit2.http.GET

interface ApiEndpoint {
    @GET("data.php")
    fun data() : Call<Model>
}