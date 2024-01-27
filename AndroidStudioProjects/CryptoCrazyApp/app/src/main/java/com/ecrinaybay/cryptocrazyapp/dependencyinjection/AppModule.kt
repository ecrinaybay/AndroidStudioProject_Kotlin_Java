package com.ecrinaybay.cryptocrazyapp.dependencyinjection

import com.ecrinaybay.cryptocrazyapp.repository.CryptoRepository
import com.ecrinaybay.cryptocrazyapp.servive.CryptoAPI
import com.ecrinaybay.cryptocrazyapp.util.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Singleton
    @Provides
    fun provideCryptoRepository(
        api: CryptoAPI
    ) = CryptoRepository(api)


    @Singleton
    @Provides
    fun provideCryproApi(): CryptoAPI {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(CryptoAPI::class.java)
    }

}































































