package com.ecrinaybay.cleanmovieapp.presentation.movie_detail.views

import com.ecrinaybay.cleanmovieapp.domain.model.Movie
import com.ecrinaybay.cleanmovieapp.domain.model.MovieDetail

data class MovieDetailState (
    val isLoading : Boolean = false,
    val movie : MovieDetail? = null,
    val error : String = ""
)































































