package com.artemoncode.myapplication.ui.screens

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TopicChooserScreen() {
    Surface(
        modifier = Modifier.padding(horizontal = 16.dp),
        color = MaterialTheme.colors.background
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            TopicHeader()
            TopicContent()
            TopicSubmit()
        }
    }
}

@Composable
fun TopicHeader() {
    Row(
        modifier = Modifier.padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {

    }
}

@Composable
fun TopicContent() {

}

@Composable
fun TopicSubmit() {

}