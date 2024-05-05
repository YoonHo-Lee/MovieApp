package yoonho.test.movieapp.features.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.compose.material3.Text
import androidx.compose.ui.platform.ComposeView
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import dagger.hilt.android.AndroidEntryPoint
import yoonho.test.movieapp.features.feed.presentation.viewmodel.FeedViewModel
import yoonho.test.movieapp.ui.theme.MovieAppTheme

@AndroidEntryPoint
class FeedFragment: Fragment() {

    private val viewModel: FeedViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel.getMovies()
        return ComposeView(requireContext()).apply {
            setContent {
                MovieAppTheme {
                    Text(text = "FeedFragment")
                }
            }
        }
    }
}