package com.example.composebirthdaycardapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebirthdaycardapp.R
import com.example.composebirthdaycardapp.ui.theme.ComposeBirthdayCardAppTheme


@Composable
fun BirthDayCard(name: String, from: String) {
    val image = painterResource(id = R.drawable.androidparty)
    Box() {
        Image(
            image,
            contentDescription = null,
            Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            contentScale = ContentScale.Crop

        )
        BirthDayGreetingsWithText(name, from)
    }
}

@Composable
fun BirthDayGreetingsWithText(name: String, from: String) {
    Column {
        Row(Modifier.padding(bottom = 10.dp)) {
            Text(
                text = stringResource(R.string.mr_string),
                Modifier
                    .padding(12.dp)
                    .background(color = Color.DarkGray)
                    .rotate(-45f),

                fontSize = 48.sp,
                color = Color.Red,
            )
            Text(
                text = "Hello $name!",
                Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(Alignment.Start)
                    .padding(start = 12.dp)
                    .background(color = Color.Blue),

                fontSize = 48.sp,
            )
        }
        Text(
            text = "-from $from!",
            Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(end = 12.dp)
                .background(color = Color.Red),
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )
        Button(
            onClick = ::println,
            Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, end = 10.dp)
                .background(color = Color.Green)
        ) {
            Text(text = "Button")

        }
    }
}

//
//@Preview(
//    name = "Preview Window",
//    showBackground = true,
//    showSystemUi = true
//)
//@Composable
//fun BirthDayCardPreview2() {
//    ComposeBirthdayCardAppTheme {
//        BirthDayCard("Yusuf", "Uğur")
//    }
//}