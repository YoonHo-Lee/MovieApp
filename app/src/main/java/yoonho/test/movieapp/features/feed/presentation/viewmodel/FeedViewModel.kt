package yoonho.test.movieapp.features.feed.presentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import yoonho.test.movieapp.features.common.repository.IMovieDataSource
import yoonho.test.movieapp.features.common.repository.MovieRepository
import javax.inject.Inject

@HiltViewModel
class FeedViewModel @Inject constructor(
    private val movieRepository: IMovieDataSource
): ViewModel() {

    fun getMovies() {
        viewModelScope.launch {
            movieRepository.getMovieList()
        }
    }
}