package com.example.postportal.presentation.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.postportal.domain.model.Post
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

// Компонент для отображения одного поста

@Composable
fun PostItem(post: Post) {
    Column(modifier = Modifier.padding(8.dp)) {
        Text(text = post.title, style = MaterialTheme.typography.bodyLarge)
        Text(text = "by ${post.author}", style = MaterialTheme.typography.bodyMedium)
        Text(text = post.content, style = MaterialTheme.typography.bodySmall)
        Text(
            text = SimpleDateFormat("dd.MM.yyyy HH:mm", Locale.getDefault()).format(Date(post.timestamp)),
            style = MaterialTheme.typography.displayMedium
        )
        Divider(modifier = Modifier.padding(vertical = 8.dp))
    }
}