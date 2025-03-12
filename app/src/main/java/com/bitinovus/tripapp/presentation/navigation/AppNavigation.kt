package com.bitinovus.tripapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.bitinovus.tripapp.presentation.screens.profile.Profile
import com.bitinovus.tripapp.presentation.screens.travel.Travel
import com.bitinovus.tripapp.presentation.screens.wishlist.Wishlist
import com.bitinovus.tripapp.presentation.viewmodels.navigationviewmodel.NavigationViewmodel

@Composable
fun AppNavigation(
    navigationViewmodel: NavigationViewmodel,
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
) {
    NavHost(
        modifier = modifier,
        navController = navHostController, startDestination = AppScreens.Travel.name
    ) {
        composable(route = AppScreens.Travel.name) {
            Travel(navigationViewmodel = navigationViewmodel)
        }
        composable(route = AppScreens.Wishlist.name) {
            Wishlist()
        }
        composable(route = AppScreens.Profile.name){
            Profile()
        }
    }

}