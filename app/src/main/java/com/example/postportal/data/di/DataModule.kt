package com.example.postportal.data.di

/* Модуль для Dependency Injection*/


import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import com.example.postportal.presentation.ui.PostFeedScreen
import com.example.postportal.presentation.viewmodel.PostFeedViewModel

@Composable
fun MyApp(viewModel: PostFeedViewModel) {
    MaterialTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            PostFeedScreen(viewModel = viewModel)
        }
    }
}