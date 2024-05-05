package yoonho.test.movieapp.ui.componets.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import yoonho.test.movieapp.R
import yoonho.test.movieapp.ui.theme.MovieAppTheme
import yoonho.test.movieapp.ui.theme.Paddings
import yoonho.test.movieapp.ui.theme.color.ColorSet


private val ICON_SIZE = 12.dp
private val CARD_WIDTH = 150.dp

@Composable
fun MovieItem() {
    Column(
        modifier = Modifier
            .width(CARD_WIDTH)
            .padding(Paddings.large)
            .background(Color.White)
    ) {
        Poster(
            modifier = Modifier
                .width(CARD_WIDTH)
        )

        Text(
            text = "The Load of the Ring 1",
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(top = Paddings.large),
            style = MaterialTheme.typography.bodyMedium
        )

        Row(
            modifier = Modifier
                .padding(vertical = Paddings.large),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                modifier = Modifier
                    .padding(Paddings.small)
                    .size(ICON_SIZE),
                imageVector = ImageVector.vectorResource(id = R.drawable.ic_rating),
                contentDescription = "Movie items ranting star icon",
                tint = Color.Black.copy(
                    alpha = 0.5f
                )
            )
            Text(
                text = "9.0",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.primary.copy(
                    alpha = 0.5f
                )
            )
        }
    }
}

@Composable
fun Poster(modifier: Modifier) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        Box(
            modifier = Modifier.background(Color.Blue)
        ) {

        }
    }
}

@Preview
@Composable
fun MovieItemPreview() {
    MovieAppTheme {
        MovieItem()
    }
}
