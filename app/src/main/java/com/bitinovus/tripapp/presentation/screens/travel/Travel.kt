package com.bitinovus.tripapp.presentation.screens.travel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp

@Composable
fun Travel() {
    Box(
        modifier = Modifier
            .background(color = Color(0xFF693d95))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Find a place",
            fontSize = 30.sp,
            color = Color.White
        )
    }
}