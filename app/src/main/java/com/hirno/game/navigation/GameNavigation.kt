package com.hirno.game.navigation

import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController

object GameDestinations {
    const val HOME_ROUTE = "Home"
    const val TIC_TAC_TOE_ROUTE = "TicTacToe"
}

class GameNavigationActions(private val navController: NavHostController) {
    val navigateToHome: () -> Unit = {
        navController.navigate(GameDestinations.HOME_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
    val navigateToTicTacToe: () -> Unit = {
        navController.navigate(GameDestinations.TIC_TAC_TOE_ROUTE) {
            popUpTo(navController.graph.findStartDestination().id) {
                saveState = true
            }
            launchSingleTop = true
            restoreState = true
        }
    }
}
