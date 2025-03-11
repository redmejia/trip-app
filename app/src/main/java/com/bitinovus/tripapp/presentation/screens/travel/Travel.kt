package com.bitinovus.tripapp.presentation.screens.travel

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bitinovus.tripapp.data.models.Place
import com.bitinovus.tripapp.presentation.components.header.Header
import com.bitinovus.tripapp.presentation.components.imagecard.ImageCard
import com.bitinovus.tripapp.presentation.components.placebox.PlaceBox

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Travel() {

    // test data
    val placesList = listOf(
        Place(
            id = 1,
            image = "https://picsum.photos/id/17/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 2,
            image = "https://picsum.photos/id/66/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 3,
            image = "https://picsum.photos/id/70/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 4,
            image = "https://picsum.photos/id/83/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 5,
            image = "https://picsum.photos/id/110/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 6,
            image = "https://picsum.photos/id/116/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 7,
            image = "https://picsum.photos/id/118/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 8,
            image = "https://picsum.photos/id/120/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 9,
            image = "https://picsum.photos/id/110/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 10,
            image = "https://picsum.photos/id/165/5000",
            isSelected = false,
            description = ""
        ),
        Place(
            id = 11,
            image = "https://picsum.photos/id/184/5000",
            isSelected = false,
            description = ""
        )
    )
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
                    val bannersList = listOf(
                        Place(
                            image = "https://picsum.photos/id/16/200",
                            isSelected = false,
                            id = 1,
                            description = "A Lake's Embrace"
                        ),
                        Place(
                            image = "https://picsum.photos/id/29/200",
                            isSelected = false,
                            id = 1,
                            description = "Serenity in the Mountains"
                        ),

                        )
                    FlowRow(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        maxItemsInEachRow = 2
                    ) {
                        repeat(bannersList.size) { index ->
                            ImageCard(
                                imageURL = bannersList[index].image,
                                placeName = bannersList[index].description,
                                textStyle = TextStyle(
                                    fontSize = 13.sp
                                )
                            )
                        }
                    }
                    Spacer(Modifier.height(20.dp))
                }
                Spacer(Modifier.height(30.dp))
            }
            items(
                items = placesList,
                key = { it.id }) { place ->
                PlaceBox(
                    isSelected = place.isSelected,
                    image = place.image
                )
            }
        }

    }
}