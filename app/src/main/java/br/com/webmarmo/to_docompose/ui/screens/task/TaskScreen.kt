package br.com.webmarmo.to_docompose.ui.screens.task

import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import br.com.webmarmo.to_docompose.data.models.Priority
import br.com.webmarmo.to_docompose.data.models.ToDoTask
import br.com.webmarmo.to_docompose.util.Action

@Composable
fun TaskScreen(
    selectedTask: ToDoTask?,
    navigateToListScreen: (Action) -> Unit
) {
    Scaffold(
        topBar = {
            TaskAppBar(
                selectedTask = selectedTask,
                navigateToListScreen = navigateToListScreen
            )
        },
        content = {
            TaskContent(
                title = "",
                onTitleChange = {},
                description = "",
                onDescriptionChange = {},
                priority = Priority.LOW,
                onPrioritySelected = {}
            )
        }
    )
}