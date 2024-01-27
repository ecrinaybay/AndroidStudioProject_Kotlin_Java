package com.ecrinaybay.cleanmovieapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ecrinaybay.cleanmovieapp.presentation.movie_detail.views.MovieDetailScreen
import com.ecrinaybay.cleanmovieapp.presentation.movies.views.MovieScreen
import com.ecrinaybay.cleanmovieapp.presentation.ui.CleanMovieAppTheme
import com.ecrinaybay.cleanmovieapp.util.Constants.IMDB_ID
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CleanMovieAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = Screen.MovieScreen.route){
                        composable(route=Screen.MovieScreen.route){
                            MovieScreen(navController = navController)
                        }
                        composable(route=Screen.MovieDetailScreen.route + "/{${IMDB_ID}}"){
                            MovieDetailScreen()
                        }
                    }
                }
            }
        }
    }
}


























































