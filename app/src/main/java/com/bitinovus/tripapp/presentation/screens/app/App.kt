package com.bitinovus.tripapp.presentation.screens.app

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.bitinovus.tripapp.presentation.navigation.AppNavigation
import com.bitinovus.tripapp.presentation.navigation.BottomTab

@Composable
fun App() {
    val navHostController = rememberNavController()

    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            AppNavigation(
                navHostController = navHostController
            )

            Box(
                modifier = Modifier
                    .matchParentSize()
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                BottomTab(navHostController)
            }
        }
    }
}