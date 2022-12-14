package io.play.mvvmstudy.core.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import io.play.mvvmstudy.order_feature.presentation.OrderScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = ScreenRoutes.OrderScreen.route ) {
        composable(ScreenRoutes.OrderScreen.route) {
            OrderScreen(navController)
        }
    }
}

sealed class ScreenRoutes(val route:String) {
    object OrderScreen:ScreenRoutes("order_screen")
    object OrderChooseDelivererScreen:ScreenRoutes("order_choose_deliverer_screen")
    object OrderChooseProductsScreen:ScreenRoutes("order_choose_products_screen")

}