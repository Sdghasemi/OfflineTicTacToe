package com.hirno.game.navigation

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.hirno.chat.model.ConversationModel
import com.hirno.chat.model.MessageModel
import com.hirno.game.navigation.GameDestinations.ARG_CONVERSATION_ID
import com.hirno.game.navigation.GameDestinations.BLUETOOTH_SEARCH_ROUTE
import com.hirno.game.navigation.GameDestinations.HOME_ROUTE
import com.hirno.chat.ui.bluetooth.BluetoothScreen
import com.hirno.chat.ui.conversations.ConversationsScreen
import com.hirno.chat.viewmodel.BluetoothViewModel
import com.hirno.game.ui.screen.WaitingScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GameNavGraph() {
    val navController = rememberNavController()
    val navigationActions = remember(navController) {
        GameNavigationActions(navController)
    }
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE
    ) {
        composable(HOME_ROUTE) {
            WaitingScreen(
                onStopClick = {

                }
            )
        }
        composable(
            route = GameDestinations.TIC_TAC_TOE_ROUTE,
            arguments = listOf(
                navArgument(ARG_CONVERSATION_ID) {
                    type = NavType.StringType
                }
            ),
        ) {

        }
        composable(GameDestinations.TIC_TAC_TOE_ROUTE) {
            val bluetoothViewModel = viewModel(
                modelClass = BluetoothViewModel::class.java
            )
            BluetoothScreen(
                viewModel = bluetoothViewModel,
                navigationActions = navigationActions,
            )
        }
        composable(BLUETOOTH_SEARCH_ROUTE) {

        }
    }
}