package com.ecrinaybay.retrofitkotlincoroutines.services

import android.telecom.Call
import com.ecrinaybay.retrofitkotlincoroutines.model.CryptoModel
import io.reactivex.Observable
import okhttp3.Response
import retrofit2.http.GET

interface CryptoAPI {

    @GET("atilsamancioglu/K21-JSONDataSet/master/crypto.json")
    suspend fun getData(): retrofit2.Response<List<CryptoModel>>



}




































