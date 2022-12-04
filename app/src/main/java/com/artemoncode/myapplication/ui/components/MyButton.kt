package com.artemoncode.myapplication.ui.components

import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun MyButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    text: String? = null,
    enabled: Boolean = true,
    isDark: Boolean = true
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = if (isDark) MaterialTheme.colors.secondaryVariant else MaterialTheme.colors.primaryVariant
        )
    ) {
        if (!text.isNullOrBlank()) {
            Text(
                text = text,
                textAlign = TextAlign.Center,
                style = MaterialTheme.typography.h2,
                color = MaterialTheme.colors.onPrimary
            )
        }
    }
}