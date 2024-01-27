package com.ecrinaybay.moviekmm.di

import com.ecrinaybay.moviekmm.data.remote.MovieService
import com.ecrinaybay.moviekmm.data.remote.RemoteDataSource
import com.ecrinaybay.moviekmm.data.repository.MovieRepositoryImpl
import com.ecrinaybay.moviekmm.domain.repository.MovieRepository
import com.ecrinaybay.moviekmm.domain.usecase.GetMovieUseCase
import com.ecrinaybay.moviekmm.domain.usecase.GetMoviesUseCase
import com.ecrinaybay.moviekmm.util.provideDispatcher
import org.koin.dsl.module

private val dataModule = module {
    factory { RemoteDataSource(get(),get()) }
    factory { MovieService() }
}

private val utilModule = module {
    factory { provideDispatcher() }
}

private val domainModule = module {
    factory { GetMovieUseCase() }
    factory { GetMoviesUseCase() }
    single<MovieRepository> { MovieRepositoryImpl(get()) }
}

private val sharedModules = listOf(dataModule, utilModule, domainModule)

fun getSharedModules() = sharedModules






























































