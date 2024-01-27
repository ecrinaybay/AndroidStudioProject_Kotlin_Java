package com.ecrinaybay.kotlincountries.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.ecrinaybay.kotlincountries.model.Country

@Dao
interface CountryDao {

    //Data Access Object

    @Insert
    suspend fun insertAll(vararg contries: Country) : List<Long> //varargs gelecek objenin sayısnı bilmiyorsak kullanırız
    //Insert -> INSERT INTO
    //suspend -> coroutine, pause & resume
    //vararg -> multiple country objects
    //List<Long> -> primary keys

    @Query("SELECT * FROM country")
    suspend fun getAllCountries(): List<Country>

    @Query("SELECT * FROM  country WHERE uuid = :countryId")
    suspend fun getCountry(countryId: Int) : Country

    @Query("DELETE FROM country")
    suspend fun deleteAllCountries()

}





























































