package com.bitinovus.tripapp.presentation.navigation

import com.bitinovus.tripapp.R

sealed class BottomBarItem(
    val route: String,
    val title: String,
    val icon: Int,
) {
    object Travel : BottomBarItem(
        route = "Travel",
        title = "Travel",
        icon = R.drawable.outline_travel
    )

    object Wishlist : BottomBarItem(
        route = "Wishlist",
        title = "Wishlist",
        icon = R.drawable.outline_favorite
    )

    object Profile : BottomBarItem(
        route = "Profile",
        title = "Profile",
        icon = R.drawable.outline_person
    )
}