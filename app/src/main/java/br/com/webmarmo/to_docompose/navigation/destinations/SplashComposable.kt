package br.com.webmarmo.to_docompose.navigation.destinations

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import br.com.webmarmo.to_docompose.ui.screens.splash.SplashScreen
import br.com.webmarmo.to_docompose.util.Constants.SPLASH_SCREEN

fun NavGraphBuilder.splashComposable(
    navigateToListScreen: () -> Unit,
) {
    composable(
        route = SPLASH_SCREEN,
    ) {
        SplashScreen(
            navigateToListScreen = navigateToListScreen
        )
    }
}