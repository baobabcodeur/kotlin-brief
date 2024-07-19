package com.example.todolist.ui.theme


import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme

import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable


private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDark,
    background = BackgroundDark

)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryDark,
    background = BackgroundDark

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

@Composable
fun TodoListTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+

    content: @Composable () -> Unit
) {
    val colorScheme = when {
       darkTheme -> DarkColorScheme
        else -> LightColorScheme
        }




    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}