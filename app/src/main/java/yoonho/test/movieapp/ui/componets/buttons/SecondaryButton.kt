package yoonho.test.movieapp.ui.componets.buttons

import androidx.annotation.StringRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yoonho.test.movieapp.ui.theme.MovieAppTheme
import yoonho.test.movieapp.ui.theme.Paddings
import yoonho.test.movieapp.ui.theme.button
import yoonho.test.movieapp.ui.theme.current

@Composable
fun SecondaryButton(
    modifier: Modifier = Modifier,
    @StringRes id: Int? = null, //@StringRes는 리소스의 타입이 문자인 경우만 받을 수 있게 한다.
    text: String = "",
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        shape = MaterialTheme.shapes.large,
        onClick = onClick,
        border = BorderStroke(
            width = 2.dp,
            color = MaterialTheme.current.secondary
        ),
        colors = ButtonDefaults.buttonColors(
            containerColor = MaterialTheme.current.background,
            contentColor = MaterialTheme.current.secondary,
            disabledContainerColor = MaterialTheme.current.background,
            disabledContentColor = MaterialTheme.current.disabledSecondary,
        )
    ) {
        Row (
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ){
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
fun SecondaryButtonPreview() {
    MovieAppTheme {
        SecondaryButton(
            modifier = Modifier.width(250.dp),
            text = "SecondaryButton",
            onClick = {}
        )
    }
}