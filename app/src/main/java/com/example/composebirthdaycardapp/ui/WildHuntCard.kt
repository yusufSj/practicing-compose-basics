package com.example.composebirthdaycardapp.ui

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebirthdaycardapp.R

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun WildHuntCardPreview() {
    WildHuntCard()
}

@Composable
fun WildHuntCard() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),

        verticalArrangement = Arrangement.Center,
    ) {
        Card(
            modifier = Modifier
                .background(Color.White)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .background(
                        brush = Brush.horizontalGradient(
                            listOf(
                                Color.Red, Color.White, Color.Black, Color.White, Color.Red
                            )
                        )
                    ), verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.wild_hunt),
                    contentDescription = null,
                    modifier = Modifier
                        .width(477.dp)
                        .height(523.dp)
                        .border(
                            2.dp, Color.Black, RoundedCornerShape(10.dp)
                        )
                        .align(Alignment.CenterHorizontally)
                )
                Text(
                    text = "Wild Hunt",
                    textAlign = TextAlign.Center,
                    fontSize = 36.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp)
                        .border(2.dp, Color.Black)
                        .clickable {
                            Toast
                                .makeText(context, "Winter is coming!", Toast.LENGTH_LONG)
                                .show()
                        },
                    color = Color.Red
                )
            }
        }
    }
}