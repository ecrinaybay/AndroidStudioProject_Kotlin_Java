package com.ecrinaybay.kotlincountries.service

import com.ecrinaybay.kotlincountries.model.Country
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.POST

interface CountryAPI {

    //GET, POST

    //https://raw.githubusercontent.com/atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //BASE URL ->atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json
    //EXT -> https://raw.githubusercontent.com/


    @GET("atilsamancioglu/IA19-DataSetCountries/master/countrydataset.json")
    fun getCountries():Single<List<Country>>



}
























































