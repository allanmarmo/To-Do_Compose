package br.com.webmarmo.to_docompose.navigation

import androidx.navigation.NavHostController
import br.com.webmarmo.to_docompose.util.Action
import br.com.webmarmo.to_docompose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
    val list: (Action) -> Unit = { action ->
        navController.navigate(route = "list/${action.name}") {
            popUpTo(LIST_SCREEN) { inclusive = true }
        }
    }
    val task: (Int) -> Unit = { taskId ->
        navController.navigate(route = "task/$taskId")
    }
}