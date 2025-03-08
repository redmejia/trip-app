package com.bitinovus.tripapp.presentation.screens.app

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.bitinovus.tripapp.presentation.navigation.AppNavigation
import com.bitinovus.tripapp.presentation.navigation.BottomTab

@Composable
fun App() {
    val navHostController = rememberNavController()

    Scaffold(
        bottomBar = {
            BottomTab(navHostController)
        }
    ) { innerPadding ->
        AppNavigation(
            modifier = Modifier.padding(innerPadding),
            navHostController = navHostController
        )
    }
}