package com.example.composebirthdaycardapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebirthdaycardapp.R
import com.example.composebirthdaycardapp.ui.theme.BusinessCardBackgroundColorBlue
import com.example.composebirthdaycardapp.ui.theme.BusinessCardTextWhite

@Composable
fun BusinessCard(name: String, title: String, phoneNumber: String, email: String, webSite: String) {

    Column(
        Modifier
            .background(color = BusinessCardBackgroundColorBlue)
    ) {

        Image(
            painterResource(id = R.drawable.android_logo), contentDescription = null,
            Modifier.padding(top = 200.dp, start = 120.dp, end = 120.dp),
        )
        Text(
            text = name,
            Modifier.align(Alignment.CenterHorizontally),
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            color = BusinessCardTextWhite,
            textAlign = TextAlign.Center,
        )
        Text(
            text = title,
            Modifier.align(Alignment.CenterHorizontally),
            fontSize = 24.sp,
            textAlign = TextAlign.End,
            color = Color.Green
        )
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(color = Color.White)
        )

        Row(Modifier.padding(bottom = 10.dp, start = 80.dp, top = 180.dp)) {
            Icon(
                painterResource(id = R.drawable.baseline_local_phone_24),

                contentDescription = null,
                Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 20.dp)

            )
            Text(text = phoneNumber, Modifier.padding(start = 20.dp), fontSize = 22.sp)
        }

        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(color = Color.White)

        )

        Row(Modifier.padding(bottom = 10.dp, start = 80.dp, end = 40.dp)) {
            Icon(
                painterResource(id = R.drawable.baseline_mail_24),
                contentDescription = null,
                Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 20.dp),
            )
            Text(text = email, Modifier.padding(start = 20.dp), fontSize = 22.sp)

        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(color = Color.White)

        )
        Row(Modifier.padding(start = 80.dp, bottom = 10.dp)) {
            Icon(
                painterResource(id = R.drawable.baseline_share_24),
                contentDescription = null,
                Modifier
                    .align(Alignment.CenterVertically)
                    .padding(start = 20.dp)
            )
            Text(text = webSite, Modifier.padding(start = 20.dp), fontSize = 22.sp)

        }
        Spacer(
            modifier = Modifier
                .fillMaxWidth()
                .height(2.dp)
                .background(color = Color.White)

        )


    }


}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCard(
        name = "Yusuf Uğur Duran",
        title = "Android Developer",
        phoneNumber = "444 44 44",
        email = "email@gmail.com",
        webSite = "www.google.com"
    )
}