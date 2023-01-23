package com.example.composebirthdaycardapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebirthdaycardapp.R

@Composable
fun TaskManager() {
    Column(
        Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painterResource(id = R.drawable.ic_task_completed), contentDescription = null)
        Text(
            text = stringResource(R.string.task_completed),
            Modifier.padding(top = 24.dp, bottom = 8.dp),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold

        )
        Text(text = stringResource(R.string.nice_work), fontSize = 16.sp)
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun TaskManagerPreview() {
    TaskManager()
}