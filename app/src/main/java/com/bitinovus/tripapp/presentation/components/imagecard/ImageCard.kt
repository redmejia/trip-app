package com.bitinovus.tripapp.presentation.components.imagecard

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage

@Composable
fun ImageCard(
    imageURL: String,
    placeName: String,
    textStyle: TextStyle = LocalTextStyle.current,
) {
    Column {
        AsyncImage(
            modifier = Modifier.clip(shape = RoundedCornerShape(10.dp)),
            model = imageURL,
            contentScale = ContentScale.Crop,
            contentDescription = null
        )
        Text(
            modifier = Modifier.padding(top = 10.dp),
            text = placeName,
            style = textStyle
        )
    }
}