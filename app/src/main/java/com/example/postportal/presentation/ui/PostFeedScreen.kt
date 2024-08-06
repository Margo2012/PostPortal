package com.example.postportal.presentation.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import com.example.postportal.domain.model.Post
import com.example.postportal.presentation.viewmodel.PostFeedViewModel

// Компонент экрана с лентой постов
@Composable
fun PostFeedScreen(viewModel: PostFeedViewModel){
    val posts = viewModel.posts

    PostFeed(posts = posts)
}

@Composable
fun PostFeed(posts: List<Post>) {
    LazyColumn {
        items(posts){post ->
            PostItem(post = post)
        }
    }

}
