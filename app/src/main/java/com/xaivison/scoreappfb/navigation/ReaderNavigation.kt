package com.xaivison.scoreappfb.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import androidx.navigation.compose.rememberNavController
import com.xaivison.scoreappfb.screens.ReaderSplashScreen
import com.xaivison.scoreappfb.screens.details.BookDetailsScreen
import com.xaivison.scoreappfb.screens.home.Home
import com.xaivison.scoreappfb.screens.login.ReaderLoginScreen
import com.xaivison.scoreappfb.screens.search.SearchScreen
import com.xaivison.scoreappfb.screens.stats.ReaderStatsScreen
import com.xaivison.scoreappfb.screens.update.BookUpdateScreen


//CreateAccountScreen,





@Composable
fun ReaderNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController,
        startDestination = ReaderScreens.SplashScreen.name){
        composable(ReaderScreens.SplashScreen.name){
            ReaderSplashScreen(navController = navController)
        }

        composable(ReaderScreens.ReaderHomeScreen.name){
            Home(navController = navController)
        }

        composable(ReaderScreens.LoginScreen.name){
            ReaderLoginScreen(navController = navController)
        }
        composable(ReaderScreens.SearchScreen.name){
            SearchScreen(navController = navController)
        }
        composable(ReaderScreens.DetailScreen.name){
            BookDetailsScreen(navController = navController)
        }
        composable(ReaderScreens.UpdateScreen.name){
            BookUpdateScreen(navController = navController)
        }
        composable(ReaderScreens.ReaderStatsScreen.name
        ){
            ReaderStatsScreen(navController = navController)
        }


    }
}