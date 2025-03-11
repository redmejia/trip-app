package com.bitinovus.tripapp.presentation.screens.wishlist

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.bitinovus.tripapp.data.models.Place
import com.bitinovus.tripapp.presentation.components.placebox.PlaceBox

@Composable
fun Wishlist() {

    // Test data user selected favorite place from travel screen
    val wishList = listOf(
        Place(
            id = 1,
            image = "https://picsum.photos/id/17/5000",
            isSelected = true,
            description = ""
        ),
        Place(
            id = 3,
            image = "https://picsum.photos/id/70/5000",
            isSelected = true,
            description = ""
        ),
        Place(
            id = 4,
            image = "https://picsum.photos/id/83/5000",
            isSelected = true,
            description = ""
        ),
        Place(
            id = 8,
            image = "https://picsum.photos/id/120/5000",
            isSelected = true,
            description = ""
        ),
        Place(
            id = 10,
            image = "https://picsum.photos/id/165/5000",
            isSelected = true,
            description = ""
        ),
        Place(
            id = 11,
            image = "https://picsum.photos/id/184/5000",
            isSelected = true,
            description = ""
        )
    )
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn {
            items(
                items = wishList,
                key = { it.id }) { place ->
                PlaceBox(
                    isSelected = place.isSelected,
                    image = place.image
                )
            }
        }
    }
}