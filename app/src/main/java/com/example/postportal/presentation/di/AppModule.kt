package com.example.postportal.presentation.di

import com.example.postportal.data.network.ApiService
import com.example.postportal.data.repository.PostRepositoryImpl
import com.example.postportal.domain.repository.PostRepository
import com.example.postportal.domain.usecase.GetPostsUseCase
import com.example.postportal.presentation.viewmodel.PostFeedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    //single { ApiService.create() }

    single<PostRepository> { PostRepositoryImpl(get()) }
    single { GetPostsUseCase(get()) }
    viewModel { PostFeedViewModel(get()) }
}