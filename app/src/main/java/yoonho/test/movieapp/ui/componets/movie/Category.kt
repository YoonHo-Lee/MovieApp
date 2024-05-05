package yoonho.test.movieapp.ui.componets.movie

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import yoonho.test.movieapp.ui.theme.MovieAppTheme
import yoonho.test.movieapp.ui.theme.Paddings
import yoonho.test.movieapp.ui.theme.Typography

@Composable
fun CategoryRow() {
    Column(
        modifier = Modifier
            .background(Color.White)
    ) {
        CategoryTitle("Action")
        LazyRow(
            contentPadding = PaddingValues(horizontal = Paddings.large)
        ) {
//            itemsIndexed()
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
            item {
                MovieItem()
            }
        }
    }
}

@Composable
fun CategoryTitle(title: String) {
//    Text(
//        text = title,
//        modifier = Modifier.padding(
//            Paddings.large
//        ),
//        fontSize = 57.sp,
////        style = Typography.displayLarge
////        style = MaterialTheme.typography.displayLarge
//    )
//
//    Text(
//        text = title,
//        modifier = Modifier.padding(
//            Paddings.large
//        ),
////        fontSize = 57.sp,
//        style = Typography.displayLarge
////        style = MaterialTheme.typography.displayLarge
//    )

    Text(
        text = title,
        modifier = Modifier.padding(
            Paddings.large
        ),
//        fontSize = 57.sp,
//        style = Typography.displayLarge
        style = MaterialTheme.typography.headlineSmall
    )
}

@Composable
@Preview
fun CategoryRowPreview() {
    // MaterialAppTheme로 하면 MaterialTheme.typography 가 기본 값이 적용 됨.
    // 내가 만든 테마를 적용하려면 꼭 앱의 테마를 넣자.
    MovieAppTheme {
        CategoryRow()
    }
}