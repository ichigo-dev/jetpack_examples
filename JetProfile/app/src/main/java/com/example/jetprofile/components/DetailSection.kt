package com.example.jetprofile.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DetailSection() {
    Column(
    modifier = Modifier
    .fillMaxWidth()
    .clip(RoundedCornerShape(10.dp))
    .background(Color.LightGray.copy(alpha = 0.3f))
    .padding(horizontal = 10.dp, vertical = 20.dp)
    ) {
        Label(
            icon = Icons.Default.Favorite,
            text = "Hobbies: Playing shogi",
            color = Color.Gray,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Label(
            icon = Icons.Default.LocationOn,
            text = "Residence: Ishikawa Prefecture, Japan",
            color = Color.Gray,
        )
    }
}