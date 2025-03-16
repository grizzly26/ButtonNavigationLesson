package com.example.buttonnavigationlesson.buttom_navigation

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun Screens1() {
    Text(modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text ="screen1",
        textAlign = TextAlign.Center)
}

@Composable
fun Screens2() {
    Text(modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text ="screen2",
        textAlign = TextAlign.Center)
}

@Composable
fun Screens3() {
    Text(modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text ="screen3",
        textAlign = TextAlign.Center)
}

@Composable
fun Screens4() {
    Text(modifier = Modifier.fillMaxSize().wrapContentHeight(),
        text ="screen4",
        textAlign = TextAlign.Center)
}

