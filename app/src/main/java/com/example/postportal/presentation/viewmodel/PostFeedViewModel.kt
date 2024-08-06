package com.example.postportal.presentation.viewmodel


import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.postportal.domain.model.Post
import com.example.postportal.domain.usecase.GetPostsUseCase
import kotlinx.coroutines.launch

class PostFeedViewModel (private val getPostsUseCase: GetPostsUseCase): ViewModel(){
    var posts by mutableStateOf<List<Post>>(emptyList())
        private set
    init {
        viewModelScope.launch {
            posts = getPostsUseCase.execute()
        }
    }
}