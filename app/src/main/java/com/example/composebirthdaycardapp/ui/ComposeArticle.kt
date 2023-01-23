package com.example.composebirthdaycardapp.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composebirthdaycardapp.R

@Composable
fun ComposeArticle() {
    Column {
        Image(
            painterResource(id = R.drawable.compose_background),
            contentDescription = null,
            Modifier.fillMaxWidth()
        )
        Text(
            text = stringResource(id = R.string.jetpack_compose_tutorial_text),
            Modifier.padding(16.dp),
            fontSize = 24.sp,
        )
        Text(
            text = stringResource(id = R.string.introduction_text),
            Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = stringResource(id = R.string.paragraph_text),
            Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun ComposeArticlePreview() {
    ComposeArticle()
}