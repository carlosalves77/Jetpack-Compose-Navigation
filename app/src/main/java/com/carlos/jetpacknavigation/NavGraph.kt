package com.carlos.jetpacknavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Preview(device = "id:pixel_7")
@Composable
fun NavGraph() {

 val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Screen A") {

        composable(route = "Screen A") {
            ScreenA(navController)
        }
        composable(route = "Screen B") {
            ScreenB(navController)
        }
        composable(route = "Screen B") {
            ScreenC(navController)
        }
    }

}