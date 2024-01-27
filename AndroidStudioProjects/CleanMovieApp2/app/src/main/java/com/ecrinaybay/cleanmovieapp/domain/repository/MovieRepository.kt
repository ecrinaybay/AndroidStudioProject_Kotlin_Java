package com.ecrinaybay.cleanmovieapp.domain.repository

import com.ecrinaybay.cleanmovieapp.data.remote.dto.MovieDetailDto
import com.ecrinaybay.cleanmovieapp.data.remote.dto.MoviesDto
import com.ecrinaybay.cleanmovieapp.data.remote.dto.Search
import com.ecrinaybay.cleanmovieapp.domain.model.MovieDetail

interface MovieRepository {

    suspend fun getMovies(search: String) : MoviesDto
    suspend fun getMovieDetail(imdbId: String) : MovieDetailDto


}





























































