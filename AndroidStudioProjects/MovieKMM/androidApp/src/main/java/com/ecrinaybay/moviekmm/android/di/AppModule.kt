package com.ecrinaybay.moviekmm.android.di

import com.ecrinaybay.moviekmm.android.detail.DetailViewModel
import com.ecrinaybay.moviekmm.android.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel{HomeViewModel(get())}
    viewModel{parametersHolder -> DetailViewModel(get(), movieId = parametersHolder.get()) }
}
















































