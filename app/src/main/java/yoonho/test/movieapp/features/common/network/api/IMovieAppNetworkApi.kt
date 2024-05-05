package yoonho.test.movieapp.features.common.network.api

import yoonho.test.movieapp.features.common.network.model.MovieResponse
import yoonho.test.movieapp.library.network.model.ApiResult

interface IMovieAppNetworkApi {
    suspend fun getMovies(): ApiResult<List<MovieResponse>>
}