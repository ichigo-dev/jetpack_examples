package com.example.jetbmicalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetbmicalculator.components.LabeledTextField
import com.example.jetbmicalculator.ui.theme.JetBMICalculatorTheme

class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetBMICalculatorTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent(viewModel)
                }
            }
        }
    }
}

@Composable
fun MainContent( viewModel: MainViewModel ) {
    Column(
        horizontalAlignment = Alignment.Start,
        modifier = Modifier
            .background(Color.White)
            .padding(20.dp),
    ) {
        Text(
            text = "BMI計算",
            fontSize = 26.sp,
            fontWeight = FontWeight.ExtraBold,
        )
        Spacer(modifier = Modifier.height(30.dp))

        LabeledTextField(
            value = viewModel.height,
            onValueChange = { viewModel.height = it },
            label = "身長(cm)",
            placeholder = "170",
        )
        Spacer(modifier = Modifier.height(20.dp))

        LabeledTextField(
            value = viewModel.weight,
            onValueChange = { viewModel.weight = it },
            label = "体重(kg)",
            placeholder = "65",
        )
        Spacer(modifier = Modifier.height(30.dp))

        Button(
            onClick = { viewModel.calculateBmi() },
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFF85F6A),
            ),
            shape = RoundedCornerShape(5.dp),
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Text(
                text = "計算する",
                color = Color.White,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
            )
        }
        Spacer(modifier = Modifier.height(20.dp))

        //  結果
        if( viewModel.bmi > 0f ) {
            Text(
                text = "あなたのBMIは${viewModel.bmi}です",
                fontSize = 20.sp,
                fontWeight = FontWeight.ExtraBold,
                color = Color.Gray,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth(),
            )
        }
    }
}