package com.example.musicapp

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface ApiInterface
{
    @Headers("X-RapidAPI-Key: 09e5e54676msh09934965c94a140p1fb435jsn5d01ad519196",
            "X-RapidAPI-Host: deezerdevs-deezer.p.rapidapi.com")
    @GET("search")
    fun getData(@Query("q") query: String) : Call<MyData>


}