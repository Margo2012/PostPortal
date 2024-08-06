package com.example.postportal.data.repository

import com.example.postportal.data.model.PostDataModel
import com.example.postportal.data.network.ApiService
import com.example.postportal.domain.model.Post
import com.example.postportal.domain.repository.PostRepository

/* реализация репозитория*/
class PostRepositoryImpl(private val apiService: ApiService) : PostRepository {
    override suspend fun getPost(): List<Post> {
        return apiService.getPosts().map { it.toDomainModel() }
    }
}

fun PostDataModel.toDomainModel(): Post{
    return Post(id = id, title = title, content = content, author = author, timestamp = timestamp)
}