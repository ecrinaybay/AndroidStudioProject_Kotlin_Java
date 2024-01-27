package com.ecrinaybay.moviekmm.android.detail

import com.ecrinaybay.moviekmm.domain.model.Movie

data class DetailScreenState(
    var loading : Boolean = false,
    var movie: Movie? = null,
    var errorMessage : String? = null
)
































































