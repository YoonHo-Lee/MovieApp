package yoonho.test.movieapp.features.common.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import yoonho.test.movieapp.features.common.network.api.IMovieAppNetworkApi
import yoonho.test.movieapp.features.common.network.api.MovieAppNetworkApi
import yoonho.test.movieapp.features.common.repository.IMovieDataSource
import yoonho.test.movieapp.features.common.repository.MovieRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class MovieDataModule {

    @Singleton
    @Binds
    abstract fun bindMovieRepository(movieRepository: MovieRepository): IMovieDataSource
    // MovieRepository를 IMovieDataSource에 바인딩 해 줌.

    @Singleton
    @Binds
    abstract fun bindNetwork(networkApi: MovieAppNetworkApi): IMovieAppNetworkApi
    // MovieAppNetworkApi를 IMovieAppNetworkApi에 바인딩 해 줌.

}