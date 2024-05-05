package yoonho.test.movieapp.ui.componets.dialog

import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import yoonho.test.movieapp.R
import yoonho.test.movieapp.ui.models.dialog.DialogButton
import yoonho.test.movieapp.ui.models.dialog.DialogContent
import yoonho.test.movieapp.ui.models.dialog.DialogText
import yoonho.test.movieapp.ui.models.dialog.DialogTitle

@Composable
fun DialogPopup.Rating(
    title: String,
    score: Float,
    buttons: List<DialogButton>
) {
    BaseDialogPopup(
        dialogTitle = DialogTitle.Large("Rate your score!"),
        dialogContent = DialogContent.Rating(
            DialogText.Rating(
                text = title,
                rating = score
            )
        ),
        dialogButtons = buttons
    )
}