package com.bitinovus.tripapp.presentation.components.option

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun Option(
    modifier: Modifier = Modifier,
    leadingIcon: @Composable () -> Unit = {},
    trailingIcon: @Composable () -> Unit = {},
    title: String,
    titleStyle: TextStyle = LocalTextStyle.current,
    elevation :  CardElevation = CardDefaults.cardElevation(),
    colors: CardColors = CardDefaults.cardColors()
) {
    Card(
        colors = colors,
        elevation = elevation,
    ) {
        Row(
            modifier = modifier,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ){
            Row (horizontalArrangement = Arrangement.spacedBy(8.dp)){
                leadingIcon()
                Text(text = title, style = titleStyle)
            }
            trailingIcon()
        }
    }

}