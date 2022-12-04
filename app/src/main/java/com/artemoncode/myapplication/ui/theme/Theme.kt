package com.artemoncode.myapplication.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = MyColors.Orange,
    primaryVariant = MyColors.White,
    secondary = MyColors.LightGray,
    secondaryVariant = MyColors.DarkGray,
    background = MyColors.Black,
    surface = MyColors.Gray,
    onPrimary = MyColors.White,
    onSurface = MyColors.White,
    onBackground = MyColors.TextGray
)

private val LightColorPalette = lightColors(
    primary = MyColors.Orange,
    primaryVariant = MyColors.White,
    secondary = MyColors.LightGray,
    secondaryVariant = MyColors.DarkGray,
    background = MyColors.Black,
    surface = MyColors.Gray,
    onPrimary = MyColors.White,
    onSurface = MyColors.White,
    onBackground = MyColors.TextGray
)

@Composable
fun VkCupDzenTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}