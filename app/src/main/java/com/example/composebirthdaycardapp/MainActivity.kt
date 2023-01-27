package com.example.composebirthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import com.example.composebirthdaycardapp.ui.*
import com.example.composebirthdaycardapp.ui.theme.ComposeBirthdayCardAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeBirthdayCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    WildHuntCard()
//                      Quadrant()
//                      TaskManager()
//                      ComposeArticle()
//                      BirthDayCard(name = "Yusuf", from = "Uğur")
                }
            }
        }
    }
}



