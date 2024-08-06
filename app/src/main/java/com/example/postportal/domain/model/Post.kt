package com.example.postportal.domain.model

// Доменная модель
data class Post(
    val id: Int,
    val title: String,
    val content: String,
    val author: String,
    val timestamp: Long
)