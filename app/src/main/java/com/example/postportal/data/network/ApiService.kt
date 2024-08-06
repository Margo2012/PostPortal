package com.example.postportal.data.network

import com.example.postportal.data.model.PostDataModel
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPosts(): List<PostDataModel>
}