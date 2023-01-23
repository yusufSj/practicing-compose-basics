package com.example.composebirthdaycardapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun Quadrant() {
    Column() {
        Row(Modifier.weight(1f)) {
            Column(Modifier.weight(1f)) {
                Single(
                    color = Color.Green,
                    composableText = "Text composable",
                    description = "Displays text and follows Material Design guidelines."
                )
            }
            Column(Modifier.weight(1f)) {
                Single(
                    color = Color.Yellow,
                    composableText = "Image composable",
                    description = "Creates a composable that lays out and draws a given Painter class object."
                )
            }
        }
        Row(Modifier.weight(1f)) {
            Column(Modifier.weight(1f)) {
                Single(
                    color = Color.Gray,
                    composableText = "Row composable",
                    description = "A layout composable that places its children in a horizontal sequence."
                )
            }
            Column(Modifier.weight(1f)) {
                Single(
                    color = Color.Red,
                    composableText = "Column composable",
                    description = "A layout composable that places its children in a vertical sequence."
                )

            }
        }
    }
}

@Composable
fun Single(color: Color, composableText: String, description: String) {
    Column(
        Modifier
            .background(color = color)
            .padding(16.dp)
            .fillMaxSize(),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "$composableText",
            Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Justify,
        )
        Text(
            text = "$description",
            textAlign = TextAlign.Justify,
            fontFamily = FontFamily.Default
        )
    }
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun QuadrantPreview() {
    Quadrant()
}