package com.bright.listofmessages.ui.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bright.listofmessages.model.Program
import com.bright.listofmessages.ui.theme.ListOfMessagesTheme

@Composable
fun Conversation(programs: List<Program>) {
    LazyColumn {
        items(programs) { message -> ProgramCard(message)}
    }
}

@Preview(showBackground = true)
@Composable
fun ConversationPreview() {
    ListOfMessagesTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Conversation(
                listOf(
                    Program("author1", "The conversation is getting more interesting. It's time to play with animations! You will add the ability to expand a message to show a longer one, animating both the content size and the background color."),
                    Program("author2", "Composable functions can store local state in memory by using remember, and track changes to the value passed to mutableStateOf. Composables (and their children) using this state will get redrawn automatically when the value is updated. "),
                    Program("author3", "Android Compose revolutionizes the way developers create user interfaces for Android applications. With its declarative syntax, developers can describe UI components in a more intuitive and concise manner, focusing on what should be displayed rather than how it should be rendered. "),
                    Program("author4", "By encapsulating mutable state within composable functions, Compose ensures that UI components automatically update when the underlying state changes, eliminating the need for manual synchronization and reducing the risk of bugs. ")
                )
            )
        }
    }
}
