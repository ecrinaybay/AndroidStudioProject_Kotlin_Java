package com.ecrinaybay.artbooktesting.api

import android.app.appsearch.AppSearchBatchResult
import com.ecrinaybay.artbooktesting.model.ImageResponse
import com.ecrinaybay.artbooktesting.util.Util.API_KEY
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitAPI {
    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery: String,
        @Query("key") apiKey : String = API_KEY
    ) : Response<ImageResponse>
}
/*
interface RetrofitAPI {

    @GET("/api/")
    suspend fun imageSearch(
        @Query("q") searchQuery:String,
        @Query("key") apiKey: String = API_KEY
    ) : Response<ImageResponse>

}

 */





































































