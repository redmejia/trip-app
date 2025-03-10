package com.bitinovus.tripapp.presentation.screens.travel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bitinovus.tripapp.presentation.components.header.Header
import com.bitinovus.tripapp.presentation.components.imagecard.ImageCard

@Composable
fun Travel() {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        LazyColumn {
            item {
                Header(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 8.dp),
                    title = "Split your time between Lake and Mountains",
                    style = TextStyle(
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Medium
                    )
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        ImageCard(
                            imageURL = "https://picsum.photos/id/16/311/310",
                            placeName = "A Lake's Embrace",
                            textStyle = TextStyle(
                                fontSize = 13.sp
                            )
                        )
                        ImageCard(
                            imageURL = "https://picsum.photos/id/29/311/310",
                            placeName = "Serenity in the Mountains",
                            textStyle = TextStyle(
                                fontSize = 13.sp
                            )
                        )
                    }

                    Spacer(Modifier.height(20.dp))
                }
            }
            items(100) {
                Text("Hello")
            }
        }

    }
}