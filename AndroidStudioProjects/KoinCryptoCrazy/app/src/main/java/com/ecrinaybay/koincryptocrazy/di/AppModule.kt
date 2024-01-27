package com.ecrinaybay.koincryptocrazy.di

import com.ecrinaybay.koincryptocrazy.repository.CryptoDownload
import com.ecrinaybay.koincryptocrazy.repository.CryptoDownloadImpl
import com.ecrinaybay.koincryptocrazy.service.CryptoAPI
import com.ecrinaybay.koincryptocrazy.viewmodel.CryptoViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {

    //singleton Scope
    single {
        val BASE_URL = "https://raw.githubusercontent.com/"

        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CryptoAPI::class.java)
    }

    single<CryptoDownload> {
        CryptoDownloadImpl(get())
    }

    viewModel {
        CryptoViewModel(get())
    }

    //factory -> everytime we inject -> new instance
    factory {

    }
}

















































