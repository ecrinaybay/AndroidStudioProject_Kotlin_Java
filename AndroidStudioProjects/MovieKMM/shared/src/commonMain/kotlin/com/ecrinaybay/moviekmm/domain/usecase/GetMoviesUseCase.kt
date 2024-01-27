package com.ecrinaybay.moviekmm.domain.usecase

import com.ecrinaybay.moviekmm.domain.model.Movie
import com.ecrinaybay.moviekmm.domain.repository.MovieRepository
import org.koin.core.component.KoinComponent
import org.koin.core.component.inject

class GetMoviesUseCase : KoinComponent {
    private val repository : MovieRepository by inject()

    //invoke yaptığımızda GetMoviesUsesCase'ten bir obje oluşturulduğunda direkt bu fonskiyon çağrılacak
    @Throws(Exception::class)
    suspend operator fun invoke(page : Int) : List<Movie>{
        return repository.getMovies(page = page
        )
    }


}

































































