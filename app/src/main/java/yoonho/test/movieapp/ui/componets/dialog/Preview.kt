package yoonho.test.movieapp.ui.componets.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import yoonho.test.movieapp.R
import yoonho.test.movieapp.ui.models.buttons.LeadingIconData
import yoonho.test.movieapp.ui.models.dialog.DialogButton
import yoonho.test.movieapp.ui.theme.MovieAppTheme

@Preview
@Composable
fun AlertPreview() {
    MovieAppTheme {
        DialogPopup.Alert(
            title = stringResource(id = R.string.app_name),
            bodyText = "This App is to build beautiful structure of Android app which uses Jetpack Compose",
            buttons = listOf(
                DialogButton.UnderlinedText("CLOSE"){}
            )
        )
    }
}

@Preview
@Composable
fun DefaultPreview() {
    MovieAppTheme {
        DialogPopup.Default(
            title = "Open IMDB",
            bodyText = "This will open the IMDB page in the external web browser. Are you okay?",
            buttons = listOf(
                DialogButton.Primary(title = "OPEN"){},
                DialogButton.SecondaryBorderless(title = "CANCEL"){}
            )
        )
    }
}

@Preview
@Composable
fun RatingPreview() {
    MovieAppTheme {
        DialogPopup.Rating(
            title = "Rate your score",
            score = 8.7f,
            buttons = listOf(
                DialogButton.Primary(
                    title = "Submit",
                    leadingIconData = LeadingIconData(
                        iconDrawable = R.drawable.ic_send,
                        iconContentDescription = null
                    )
                ){},
                DialogButton.SecondaryBorderless(title = "Cancel")
            )
        )
    }
}