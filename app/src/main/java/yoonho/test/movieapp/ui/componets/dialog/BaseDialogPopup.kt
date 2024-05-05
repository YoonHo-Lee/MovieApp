package yoonho.test.movieapp.ui.componets.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import yoonho.test.movieapp.ui.componets.dialog.components.button.DialogButtonsColumn
import yoonho.test.movieapp.ui.componets.dialog.components.content.DialogContentWrapper
import yoonho.test.movieapp.ui.componets.dialog.components.title.DialogTitleWrapper
import yoonho.test.movieapp.ui.models.dialog.DialogButton
import yoonho.test.movieapp.ui.models.dialog.DialogContent
import yoonho.test.movieapp.ui.models.dialog.DialogText
import yoonho.test.movieapp.ui.models.dialog.DialogTitle
import yoonho.test.movieapp.ui.theme.MovieAppTheme
import yoonho.test.movieapp.ui.theme.Paddings
import yoonho.test.movieapp.ui.theme.Shapes
import yoonho.test.movieapp.ui.theme.current

@Composable
fun BaseDialogPopup(
    dialogTitle: DialogTitle? = null,
    dialogContent: DialogContent? = null,
    dialogButtons:List<DialogButton>? = null
) {
    Card (
        modifier = Modifier
            .fillMaxWidth()
//            .background(MaterialTheme.current.background),
            .background(Color.Transparent), // Transparent가 맞지 않나?
        elevation = CardDefaults.cardElevation(Paddings.none),
        shape = Shapes.large
    ) {
        Column(
            modifier = Modifier.fillMaxWidth().background(MaterialTheme.current.background)
        ) {
            dialogTitle?.let{ DialogTitleWrapper(it) }
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Transparent)
                    .padding(
                        start = Paddings.xlarge,
                        end = Paddings.xlarge,
                        bottom = Paddings.xlarge
                    )
            ) {
                dialogContent?.let { DialogContentWrapper(it) }
                dialogButtons?.let { DialogButtonsColumn(it) }
            }
        }
    }
}

@Preview
@Composable
fun BaseDialogPopupPreview() {
    MovieAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Header("Title"),
            dialogContent = DialogContent.Large(
                DialogText.Default("This movie is amazing actor and fantastic story and high quality computer graphics!!!")
            ),
            dialogButtons = listOf(
                DialogButton.Primary(title = "Okay") {

                }
            )
        )
    }
}


@Preview
@Composable
fun BaseDialogPopupPreview2() {
    MovieAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("Title"),
            dialogContent = DialogContent.Default(
                DialogText.Default("This movie is amazing actor and fantastic story and high quality computer graphics!!!")
            ),
            dialogButtons = listOf(
                DialogButton.Secondary(title = "Okay") {},
                DialogButton.UnderlinedText(title = "Cancel") {},
            )
        )
    }
}


@Preview
@Composable
fun BaseDialogPopupPreview3() {
    MovieAppTheme {
        BaseDialogPopup(
            dialogTitle = DialogTitle.Large("Title"),
            dialogContent = DialogContent.Rating(
                DialogText.Rating(
                    text = "This movie is amazing actor and fantastic story and high quality computer graphics!!!",
                    rating = 3.5f)
            ),
            dialogButtons = listOf(
                DialogButton.Secondary(title = "Okay") {}
            )
        )
    }
}
