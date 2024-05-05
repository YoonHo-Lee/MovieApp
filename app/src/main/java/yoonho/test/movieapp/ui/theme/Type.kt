package yoonho.test.movieapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.sp
import yoonho.test.movieapp.R


private val spoqaBold = FontFamily(
    Font(R.font.spoqa_han_sans_neo_bold, FontWeight.Bold)
)
private val spoqaRegular = FontFamily(
    Font(R.font.spoqa_han_sans_neo_regular, FontWeight.Normal)
)
private val spoqaThin = FontFamily(
    Font(R.font.spoqa_han_sans_neo_thin, FontWeight.Thin)
)

fun Typography.defaultFontFamily(fontFamily: FontFamily) : Typography {
    return this.copy(
        displayLarge = this.displayLarge.copy(fontFamily = fontFamily),
        displayMedium = this.displayMedium.copy(fontFamily = fontFamily),
        displaySmall = this.displaySmall.copy(fontFamily = fontFamily),
        headlineLarge = this.headlineLarge.copy(fontFamily = fontFamily),
        headlineMedium = this.headlineMedium.copy(fontFamily = fontFamily),
        headlineSmall = this.headlineSmall.copy(fontFamily = fontFamily),
        titleLarge = this.titleLarge.copy(fontFamily = fontFamily),
        titleMedium = this.titleMedium.copy(fontFamily = fontFamily),
        titleSmall = this.titleSmall.copy(fontFamily = fontFamily),
        bodyLarge = this.bodyLarge.copy(fontFamily = fontFamily),
        bodyMedium = this.bodyMedium.copy(fontFamily = fontFamily),
        bodySmall = this.bodySmall.copy(fontFamily = fontFamily),
        labelLarge = this.labelLarge.copy(fontFamily = fontFamily),
        labelMedium = this.labelMedium.copy(fontFamily = fontFamily),
        labelSmall = this.labelSmall.copy(fontFamily = fontFamily)
    )
}

// Set of Material typography styles to start with
val Typography = Typography(
    displayLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 57.sp,
        lineHeight = 64.sp
    ),
    displayMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 45.sp,
        lineHeight = 52.sp
    ),
    displaySmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 36.sp,
        lineHeight = 44.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 32.sp,
        lineHeight = 40.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 28.sp,
        lineHeight = 36.sp
    ),
    headlineSmall = TextStyle(
        fontFamily = spoqaBold,
        fontSize = 24.sp,
        lineHeight = 32.sp
    ),
    titleLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 22.sp,
        lineHeight = 28.sp
    ),
    titleMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    titleSmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 16.sp,
        lineHeight = 24.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    bodySmall = TextStyle(
        fontFamily = spoqaRegular,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    labelLarge = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 14.sp,
        lineHeight = 20.sp
    ),
    labelMedium = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 12.sp,
        lineHeight = 16.sp
    ),
    labelSmall = TextStyle(
        fontFamily = spoqaThin,
        fontSize = 11.sp,
        lineHeight = 16.sp
    )
).defaultFontFamily(spoqaRegular)

// 기존의 스타일과 연동된 새로운 스타일을 만드는 방법
// 기존의 스타일의 값이 바뀌면 새로운 스타일의 값도 자동적으로 바뀌게 copy를 사용하는 게 좋다.
val Typography.bodyLargeBold: TextStyle
    @Composable get() = bodyLarge.copy(
        fontFamily = spoqaBold
    )

val Typography.dialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        fontSize = 18.sp
    )

val Typography.underlinedDialogButton: TextStyle
    @Composable get() = labelLarge.copy(
        textDecoration = TextDecoration.Underline
    )

val Typography.underlinedButton: TextStyle
    @Composable get() = bodyLarge.copy(
        fontFamily = spoqaBold,
        textDecoration = TextDecoration.Underline
    )

val Typography.button: TextStyle
    @Composable get() = bodyLarge.copy(
        fontFamily = spoqaBold
    )

//val Typography = Typography(
//    defaultFontFamily = spoqaRegular,
//    h1 = TextStyle(
//        fontFamily = spoqaBold,
//        fontSize = 60.sp,
//    ),
//    h2 = TextStyle(
//        fontFamily = spoqaBold,
//        fontSize = 32.sp,
//    ),
//    h3 = TextStyle(
//        fontFamily = spoqaBold,
//        fontSize = 24.sp
//    ),
//    h4 = TextStyle(
//        fontFamily = spoqaThin,
//        fontSize = 32.sp
//    ),
//    h5 = TextStyle(
//        fontFamily = spoqaBold,
//        fontSize = 18.sp
//    ),
//    button = TextStyle(
//        fontFamily = spoqaBold,
//        fontSize = 18.sp,
//    ),
//    h6 = TextStyle(
//        fontFamily = spoqaRegular,
//        fontSize = 15.sp
//    ),
//    subtitle1 = TextStyle(
//        fontFamily = spoqaRegular,
//        fontSize = 18.sp,
//    ),
//    subtitle2 = TextStyle(
//        fontFamily = spoqaRegular,
//        fontSize = 14.sp
//    ),
//    body1 = TextStyle(
//        fontFamily = spoqaBold,
//        fontSize = 15.sp
//    ),
//    body2 = TextStyle(
//        fontFamily = spoqaRegular,
//        fontSize = 15.sp,
//    ),
//    caption = TextStyle(
//        fontFamily = spoqaRegular,
//        fontSize = 14.sp
//    )
//)

//val kotlin.text.Typography.h5Title: TextStyle
//    @Composable get() = h5.copy(
//        fontSize = 24.sp
//    )
//
//val kotlin.text.Typography.dialogButton: TextStyle
//    @Composable get() = button.copy(
//        fontSize = 18.sp
//    )
//
//val kotlin.text.Typography.underlinedDialogButton: TextStyle
//    @Composable get() = button.copy(
//        textDecoration = TextDecoration.Underline
//    )
//
//val kotlin.text.Typography.underlinedButton: TextStyle
//    @Composable get() = button.copy(
//        textDecoration = TextDecoration.Underline
//    )

