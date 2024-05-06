package yoonho.test.movieapp.ui.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Shapes
import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.SideEffect
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat
import yoonho.test.movieapp.ui.theme.color.ColorSet
import yoonho.test.movieapp.ui.theme.color.MyColors

private val LocalColors = staticCompositionLocalOf { ColorSet.Red.LightColors }

@Composable
fun MovieAppTheme(
    myColors:ColorSet = ColorSet.Red,
    typography: Typography = Typography,
    shapes: Shapes = Shapes,
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme:MyColors = when {
//        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
//            val context = LocalContext.current
//            if (darkTheme)
//                MyColors(material = dynamicDarkColorScheme(context))
//            else
//                MyColors(material = dynamicLightColorScheme(context))
////            val context = LocalContext.current
////            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
//        }

        darkTheme -> myColors.DarkColors
        else -> myColors.LightColors
    }
//    val view = LocalView.current
//    if (!view.isInEditMode) {
//        SideEffect {
//            val window = (view.context as Activity).window
//            window.statusBarColor = colorScheme.primary.toArgb()
//            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
//        }
//    }

    CompositionLocalProvider(LocalColors provides colorScheme) {
        MaterialTheme(
            colorScheme = colorScheme.material,
            typography = typography,
            content = content,
            shapes = shapes
        )
    }

//    MaterialTheme(
//        colorScheme = colorScheme.material,
//        typography = Typography,
//        content = content,
////        shapes = Shapes()
//    )
}

/**
 * Material1기준으로 MaterialTheme.colorScheme을 사용했지만,
 * Material3에서 MaterialTheme.color가 colorScheme으로 바뀌면서
 * MaterialTheme.current로 명명.
 */
val MaterialTheme.current: MyColors
    @Composable
    @ReadOnlyComposable
    get() = LocalColors.current