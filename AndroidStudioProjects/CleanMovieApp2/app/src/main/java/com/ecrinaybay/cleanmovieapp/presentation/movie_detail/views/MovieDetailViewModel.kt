package com.ecrinaybay.cleanmovieapp.presentation.movie_detail.views

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ecrinaybay.cleanmovieapp.domain.uses_case.get_movie_detail.GetMovieDetailsUseCase
import com.ecrinaybay.cleanmovieapp.util.Constants.IMDB_ID
import com.ecrinaybay.cleanmovieapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MovieDetailViewModel @Inject constructor(
    private val getMovieDetailsUseCase : GetMovieDetailsUseCase,
    private val stateHandle : SavedStateHandle
):ViewModel() {

    private val _state = mutableStateOf<MovieDetailState>(MovieDetailState())
    val state : State<MovieDetailState> = _state

    init {
        stateHandle.get<String>(IMDB_ID)?.let {
            getMovieDetails(it)
        }

    }

    private fun getMovieDetails(imdbId : String){
        getMovieDetailsUseCase.executeGetMovieDetails(imdbId = imdbId).onEach {
            when(it){
                is Resource.Success ->{
                    _state.value = MovieDetailState(movie = it.data)
                }
                is Resource.Error ->{
                    _state.value = MovieDetailState(error = it.message ?: "Error!")
                }
                is Resource.Loading ->{
                    _state.value = MovieDetailState(isLoading = true)
                }
            }
        }.launchIn(viewModelScope)
    }

}



























































