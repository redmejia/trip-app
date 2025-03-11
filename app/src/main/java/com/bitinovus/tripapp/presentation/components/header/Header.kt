package com.bitinovus.tripapp.presentation.components.header

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

@Composable
fun Header(
    modifier: Modifier = Modifier,
    title: String,
    style: TextStyle = LocalTextStyle.current,
    content: @Composable () -> Unit = {},
) {
    Box(
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .background(
                color = Color.LightGray,
                shape = RoundedCornerShape(10.dp)
            ),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = modifier,
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                modifier = Modifier.padding(top = 20.dp),
                text = title,
                style = style
            )
            Spacer(Modifier.height(100.dp))
            content()
        }

    }
}

@Preview(showBackground = true)
@Composable
fun HeaderPreview() {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
//        Header("Find your place and enjoy.")
    }
}