package com.example.postportal.domain.repository

import com.example.postportal.domain.model.Post

// интерфейс репозитория
interface PostRepository{
    suspend fun getPost(): List<Post>
}