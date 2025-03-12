package com.bitinovus.tripapp.presentation.screens.app

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.expandVertically
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.shrinkVertically
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.TransformOrigin
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.bitinovus.tripapp.presentation.navigation.AppNavigation
import com.bitinovus.tripapp.presentation.navigation.BottomTab
import com.bitinovus.tripapp.presentation.viewmodels.navigationviewmodel.NavigationViewmodel

@Composable
fun App() {
    val navHostController = rememberNavController()

    val navigationState: NavigationViewmodel = viewModel()
    val isBottomNavigation = navigationState.isScrollable.collectAsState().value

    Scaffold { innerPadding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding),
            contentAlignment = Alignment.Center
        ) {
            AppNavigation(
                navHostController = navHostController,
                navigationViewmodel = navigationState
            )

            Box(
                modifier = Modifier
                    .matchParentSize()
                    .padding(bottom = 10.dp),
                contentAlignment = Alignment.BottomCenter
            ) {
                AnimatedVisibility(
                    visible = isBottomNavigation,
                    enter =
                        slideInVertically(
                            initialOffsetY = { it }
                        ) +
                                expandVertically(expandFrom = Alignment.Top) +
                                scaleIn(transformOrigin = TransformOrigin(0.5f, 0f)) +
                                fadeIn(initialAlpha = 0.3f),
                    exit = slideOutVertically(
                        targetOffsetY = { it }
                    ) + shrinkVertically() + fadeOut()
                ) {
                    BottomTab(navHostController)
                }

            }
        }
    }
}