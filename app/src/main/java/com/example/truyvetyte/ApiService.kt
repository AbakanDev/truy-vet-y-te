package com.example.truyvetyte.network

import com.example.truyvetyte.model.RegisterRequest
import com.example.truyvetyte.model.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    // Đường dẫn API bạn đã viết bên Express
    @POST("api/auth/register")
    suspend fun registerUser(@Body request: RegisterRequest): Response<RegisterResponse>
}