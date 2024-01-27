package com.ecrinaybay.moviekmm.data.repository

import com.ecrinaybay.moviekmm.data.remote.RemoteDataSource
import com.ecrinaybay.moviekmm.domain.model.Movie
import com.ecrinaybay.moviekmm.domain.repository.MovieRepository
import com.ecrinaybay.moviekmm.data.util.toMovie

internal class MovieRepositoryImpl(
    private val remoteDataSource: RemoteDataSource
) : MovieRepository {
    override suspend fun getMovies(page: Int): List<Movie> {
        return remoteDataSource.getMovies(page = page).results.map {
            it.toMovie()
        }
    }

    override suspend fun getMovie(movieId: Int): Movie {
        return remoteDataSource.getMovie(movieId = movieId).toMovie()
    }
}


















































































