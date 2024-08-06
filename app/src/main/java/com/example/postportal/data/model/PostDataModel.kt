package com.example.postportal.data.model

// data model объект
data class PostDataModel(
    val id: Int,
    val title: String,
    val content: String,
    val author: String,
    val timestamp: Long
)