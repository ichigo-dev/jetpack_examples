package com.example.jetprofile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CompanySection() {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier.fillMaxWidth(),
    ) {
        Text(
            text = "Example Co., Ltd.",
            color = Color.Black,
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold,
        )
        Spacer(modifier = Modifier.height(10.dp))

        Text(
            text = "System Solution Division",
            color = Color.Gray,
            fontSize = 16.sp,
        )
        Spacer(modifier = Modifier.height(20.dp))

        //  メールアドレス
        Label(
            icon = Icons.Default.Email,
            text = "Email",
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "dev.honda.ichigo@gmail.com",
            fontSize = 16.sp,
            color = Color.Black,
        )
        Spacer(modifier = Modifier.height(5.dp))

        Divider(
            thickness = 2.dp,
            modifier = Modifier
                .clip(RoundedCornerShape(1000.dp))
        )
    }
}