package com.ecrinaybay.cleanmovieapp.presentation.movies.views

import com.ecrinaybay.cleanmovieapp.data.remote.dto.Search
import com.ecrinaybay.cleanmovieapp.domain.model.Movie

data class MoviesState (
    val isLoading : Boolean = false,
    val movies : List<Movie> = emptyList(),
    val error : String = "",
    val search: String = "batman"
)























































