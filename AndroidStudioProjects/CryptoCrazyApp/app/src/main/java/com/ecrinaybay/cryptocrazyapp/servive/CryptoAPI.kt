package com.ecrinaybay.cryptocrazyapp.servive

import com.ecrinaybay.cryptocrazyapp.model.Crypto
import com.ecrinaybay.cryptocrazyapp.model.CryptoList
import com.ecrinaybay.cryptocrazyapp.model.CryptoListItem
import retrofit2.http.GET
import retrofit2.http.Query

interface CryptoAPI {
    //https://raw.githubusercontent.com/atilsamancioglu/IA32-CryptoComposeData/main/cryptolist.json

    @GET("pices")
    suspend fun getCryptoList(
        @Query("key") key : String
    ) : CryptoList

    @GET("currencies")
    suspend fun getCrypto(
        @Query("key") key: String,
        @Query("ids") id : String,
        @Query("attributes") attributes : String
    ): Crypto


}







































































