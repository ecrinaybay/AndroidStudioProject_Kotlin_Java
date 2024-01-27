package com.ecrinaybay.retrofitcompose.service

import android.telecom.Call
import retrofit2.http.GET
import com.ecrinaybay.retrofitcompose.model.CryptoModel

interface CryptoAPI {

    //https://raw.githubusercontent.com/atilsamancioglu/K21-JSONDataSet/master/crypto.json

    @GET
    fun getData() : retrofit2.Call<List<CryptoModel>>

}