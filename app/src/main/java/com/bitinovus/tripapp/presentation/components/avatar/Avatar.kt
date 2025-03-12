package com.bitinovus.tripapp.presentation.components.avatar

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.zIndex

@Composable
fun Avatar(
    image: String,
) {
    Box(
        modifier = Modifier
            .size(200.dp)
    ) {
        AsyncImage(
            modifier = Modifier
                .size(200.dp)
                .clip(shape = CircleShape),
            model = image,
            contentScale = ContentScale.Crop,
            contentDescription = "avatar"
        )
        Box(
            modifier = Modifier
                .padding(end = 18.dp)
                .matchParentSize(),
            contentAlignment = Alignment.TopEnd
        ) {
            Box(
                modifier = Modifier
                    .clip(shape = CircleShape)
                    .border(width = 5.dp, color = Color.White, shape = CircleShape)
            ) {
                Icon(
                    Icons.Filled.AddCircle,
                    contentDescription = null,
                    tint = Color(0xFF202020),
                    modifier = Modifier
                        .size(44.dp) // Define a proper size for visibility
                )
            }

        }
    }
}

@Preview
@Composable
fun AvatarPreview() {
    Avatar(
        image = "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/001.png"
    )
}