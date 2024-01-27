package com.ecrinaybay.cleanmovieapp.data.dependencyinjection

import com.ecrinaybay.cleanmovieapp.data.remote.MovieAPI
import com.ecrinaybay.cleanmovieapp.data.repository.MovieRepositoryImpl
import com.ecrinaybay.cleanmovieapp.domain.repository.MovieRepository
import com.ecrinaybay.cleanmovieapp.util.Constants.BASE_URL
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

    @Provides
    @Singleton
    fun provideMovieApi() : MovieAPI{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(MovieAPI::class.java)
    }

    @Provides
    @Singleton
    fun provideMovieRepository(api : MovieAPI) : MovieRepository{
        return MovieRepositoryImpl(api = api)
    }


}























































