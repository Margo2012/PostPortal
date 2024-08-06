package com.example.postportal.domain.usecase

import com.example.postportal.domain.model.Post
import com.example.postportal.domain.repository.PostRepository

// Use Case для получения постов получает из репозитория
class GetPostsUseCase(private val repository: PostRepository){
    suspend fun execute(): List<Post>{
        return repository.getPost()
    }
}