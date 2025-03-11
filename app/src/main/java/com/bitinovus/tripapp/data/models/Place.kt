package com.bitinovus.tripapp.data.models

data class Place(
    val id: Int,
    val image: String,
    val isSelected: Boolean = false,
    val description: String,
)

