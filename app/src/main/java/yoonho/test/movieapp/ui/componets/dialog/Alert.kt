package yoonho.test.movieapp.ui.componets.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import yoonho.test.movieapp.R
import yoonho.test.movieapp.ui.models.dialog.DialogButton
import yoonho.test.movieapp.ui.models.dialog.DialogContent
import yoonho.test.movieapp.ui.models.dialog.DialogText
import yoonho.test.movieapp.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Alert(
    title: String,
    bodyText: String,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Header(
            text = title
        ),
        dialogContent = DialogContent.Large(
            DialogText.Default(bodyText)
        ),
        dialogButtons = buttons
    )
}