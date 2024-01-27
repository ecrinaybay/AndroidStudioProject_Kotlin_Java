package com.ecrinaybay.moviekmm.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.request.HttpRequestBuilder
import io.ktor.client.request.parameter
import io.ktor.http.*
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json

//https://api.themoviedb.org/3/movie/550?api_key=2c0005c7638d9981c07d0028b0f45284

private const val BASE_URL ="https://api.themoviedb.org"
private const val API_KEY = "2c0005c7638d9981c07d0028b0f45284"

internal abstract class KtorApi {

    val client = HttpClient{
        install(ContentNegotiation){
            json(Json {
                ignoreUnknownKeys = true //bilinmeyen key'leri göz ardı ediyor
                useAlternativeNames = false

            })
        }
    }

    fun HttpRequestBuilder.pathUrl(path: String){
        url {
            takeFrom(BASE_URL)
            path("3",path)
            parameter("api_key", API_KEY)
        }
    }

}




























































