package com.example.postportal.presentation.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.postportal.data.di.MyApp
import com.example.postportal.presentation.di.appModule
import com.example.postportal.presentation.viewmodel.PostFeedViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel
import org.koin.core.context.startKoin

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startKoin { modules(appModule) }

        val viewModel: PostFeedViewModel by viewModel()
        setContent {
            MyApp(viewModel)
        }
    }
}