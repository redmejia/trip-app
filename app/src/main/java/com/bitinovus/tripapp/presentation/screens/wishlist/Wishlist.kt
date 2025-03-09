package com.bitinovus.tripapp.presentation.screens.wishlist

import androidx.compose.foundation.background
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun Wishlist() {
    Box(
        modifier = Modifier
            .background(color = Color(0xFF8352b3))
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "I love this place",
            fontSize = 30.sp,
            color = Color.White
        )
    }
}