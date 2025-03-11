package com.bitinovus.tripapp.presentation.components.placebox

import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import coil.compose.AsyncImage

@Composable
fun PlaceBox(
    image: String,
    isSelected: Boolean, // like logic here
) {
    Box(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxSize()
            .clip(shape = RoundedCornerShape(10.dp))
    ) {
        AsyncImage(
            modifier = Modifier.animateContentSize(),
            model = image,
            contentScale = ContentScale.Fit,
            contentDescription = null,
        )
        Box(
            modifier = Modifier
                .padding(top = 10.dp, end = 10.dp)
                .matchParentSize(),
            contentAlignment = Alignment.TopEnd
        ) {
            Box(
                modifier = Modifier
                    .background(
                        color = Color.White,
                        shape = CircleShape,
                    ),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    modifier = Modifier.padding(4.dp),
                    imageVector = if (isSelected) Icons.Default.Favorite
                    else Icons.Default.FavoriteBorder,
                    contentDescription = null,
                )
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PlaceBoxPreview() {
    PlaceBox(
        isSelected = false,
        image = "https://www.pokemon.com/static-assets/content-assets/cms2/img/pokedex/full/001.png"
    )
}