package yoonho.test.movieapp.features.common.repository

import timber.log.Timber
import yoonho.test.movieapp.features.common.network.api.IMovieAppNetworkApi
import yoonho.test.movieapp.library.network.model.ApiResponse
import javax.inject.Inject

// DI(Dependency Injection)로 네트워크 통신을 하는 API를 가져오는 역할
class MovieRepository @Inject constructor(
    private val movieNetworkApi: IMovieAppNetworkApi
): IMovieDataSource {
    override suspend fun getMovieList() {
        val data = movieNetworkApi.getMovies().response

        if (data is ApiResponse.Success) {
            val movieList = data.data
        }
    }
}