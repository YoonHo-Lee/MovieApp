package yoonho.test.movieapp.ui.componets.dialog

import androidx.compose.runtime.Composable
import yoonho.test.movieapp.ui.models.dialog.DialogButton
import yoonho.test.movieapp.ui.models.dialog.DialogContent
import yoonho.test.movieapp.ui.models.dialog.DialogText
import yoonho.test.movieapp.ui.models.dialog.DialogTitle

object DialogPopup

@Composable
fun DialogPopup.Default(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large(
            text = title
        ),
        dialogContent = DialogContent.Default(
            DialogText.Default(
                text = bodyText
            )
        ),
        dialogButtons = buttons
    )
}