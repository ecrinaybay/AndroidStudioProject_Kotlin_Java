package com.ecrinaybay.cleanmovieapp.domain.uses_case.get_movies

import android.net.http.HttpException
import com.ecrinaybay.cleanmovieapp.data.remote.dto.toMovieList
import com.ecrinaybay.cleanmovieapp.domain.model.Movie
import com.ecrinaybay.cleanmovieapp.domain.repository.MovieRepository
import com.ecrinaybay.cleanmovieapp.util.Resource
import kotlinx.coroutines.flow.flow
import java.io.IOError
import java.util.concurrent.Flow
import javax.inject.Inject

class GetMovieUseCase @Inject constructor(private val repository: MovieRepository) {

    //: Flow<Resource<List<Movie>>>
    fun executeGetMovies(search : String) : kotlinx.coroutines.flow.Flow<Resource<List<Movie>>> = flow {

        try {
            emit(Resource.Loading())
            val movieList = repository.getMovies(search)
            if(movieList.Response.equals("True")){
                emit(Resource.Success(movieList.toMovieList()))
            }else{
                emit(Resource.Error(message = "No movie found!"))
            }

        }catch (e: IOError){
            emit(Resource.Error(message = "No internet connection"))
        }catch (e: retrofit2.HttpException){
            emit(Resource.Error(message = e.localizedMessage ?: "Error"))
        }
    }



}










































































