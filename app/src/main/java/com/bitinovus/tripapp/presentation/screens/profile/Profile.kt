package com.bitinovus.tripapp.presentation.screens.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.outlined.KeyboardArrowRight
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.bitinovus.tripapp.presentation.components.avatar.Avatar
import com.bitinovus.tripapp.presentation.components.option.Option
import com.bitinovus.tripapp.R

@Composable
fun Profile() {
    Scaffold(
        containerColor = Color.White
    ) { innerPadding ->
        val optionActionsList = listOf(
            OptionAction(
                leadingIcon = Icons.Default.Info,
                trailingIcon = Icons.Outlined.KeyboardArrowRight,
                optionTitle = "Information"
            ),
            OptionAction(
                leadingIcon = Icons.Default.Edit,
                trailingIcon = Icons.Outlined.KeyboardArrowRight,
                optionTitle = "Edit Profile"
            ),
            OptionAction(
                leadingIcon = Icons.Default.Lock,
                trailingIcon = Icons.Outlined.KeyboardArrowRight,
                optionTitle = "Change Password"
            ),
            OptionAction(
                leadingIcon = Icons.Default.Share,
                trailingIcon = Icons.Outlined.KeyboardArrowRight,
                optionTitle = "Share"
            ),
        )
        Surface(
            modifier = Modifier.padding(innerPadding),
            color = Color.White,
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 8.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                Column(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Avatar(
                        image = "https://picsum.photos/id/64/200"
                    )
                    Text(text = "Sofia Doe", modifier = Modifier.padding(vertical = 10.dp))
                }
                Column {
                    optionActionsList.forEach { action ->
                        Option(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(20.dp),
                            colors = CardDefaults.cardColors(
                                containerColor = Color.White
                            ),
                            elevation = CardDefaults.elevatedCardElevation(
                                defaultElevation = 10.dp
                            ),
                            leadingIcon = {
                                Icon(imageVector = action.leadingIcon, contentDescription = "")
                            },
                            trailingIcon = {
                                Icon(
                                    modifier = Modifier.clickable {},
                                    imageVector = action.trailingIcon, contentDescription = ""
                                )
                            },
                            title = action.optionTitle
                        )
                        Spacer(Modifier.height(30.dp))
                    }
                }

                Option(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = Color.White
                    ),
                    elevation = CardDefaults.elevatedCardElevation(
                        defaultElevation = 10.dp
                    ),
                    leadingIcon = {
                        Icon(
                            modifier = Modifier
                                .clickable {}
                                .align(alignment = Alignment.Start),
                            painter = painterResource(id = R.drawable.outline_logout),
                            contentDescription = ""
                        )
                    },
                    title = "Log out"
                )
            }
        }
    }
}

data class OptionAction(
    val leadingIcon: ImageVector,
    val trailingIcon: ImageVector,
    val optionTitle: String = "",
)
