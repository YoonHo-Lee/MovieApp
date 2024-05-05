package yoonho.test.movieapp.ui.componets.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import yoonho.test.movieapp.R
import yoonho.test.movieapp.ui.models.buttons.LeadingIconData
import yoonho.test.movieapp.ui.theme.MovieAppTheme
import yoonho.test.movieapp.ui.theme.Paddings
import yoonho.test.movieapp.ui.theme.button
import yoonho.test.movieapp.ui.theme.current

private val LEADING_ICON_SIZE: Dp = 24.dp

@Composable
fun PrimaryButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null, //@StringRes는 리소스의 타입이 문자인 경우만 받을 수 있게 한다.
    text: String = "",
    leadingIconData: LeadingIconData? = null,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.current.primary,
            contentColor = MaterialTheme.current.onPrimary,
            disabledContainerColor = MaterialTheme.current.background,
            disabledContentColor = MaterialTheme.current.disabledSecondary,
        )
    ) {
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
            leadingIconData?.let {
                Icon(
                    modifier = Modifier.size(LEADING_ICON_SIZE),
                    painter = painterResource(id = it.iconDrawable),
                    contentDescription = it.iconContentDescription?.let { desc -> stringResource(id = desc) }
                )
                Spacer(modifier = Modifier.width(Paddings.small))
            }
            Text(
                text = id?.let { stringResource(id = id) } ?: text,
                style = MaterialTheme.typography.button,
                modifier = Modifier.padding(Paddings.small)
            )
        }
    }
}

@Composable
@Preview
fun PrimaryButtonPreview() {
    MovieAppTheme {
        PrimaryButton(
            modifier = Modifier.width(150.dp),
            text = "PreviewButton",
            id = R.string.app_name,
            onClick = {}
        )
    }
}