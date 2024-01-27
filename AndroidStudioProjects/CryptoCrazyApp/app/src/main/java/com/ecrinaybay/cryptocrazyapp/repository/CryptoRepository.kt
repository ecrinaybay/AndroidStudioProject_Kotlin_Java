package com.ecrinaybay.cryptocrazyapp.repository

import com.ecrinaybay.cryptocrazyapp.model.Crypto
import com.ecrinaybay.cryptocrazyapp.model.CryptoList
import com.ecrinaybay.cryptocrazyapp.servive.CryptoAPI
import com.ecrinaybay.cryptocrazyapp.util.Constants.API_KEY
import com.ecrinaybay.cryptocrazyapp.util.Constants.CALL_ATTRIBUTES
import com.ecrinaybay.cryptocrazyapp.util.Resource
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class CryptoRepository @Inject constructor(
    private val api : CryptoAPI
) {
    suspend fun getCryptoList() : Resource<CryptoList>{
        val response = try{
            api.getCryptoList(API_KEY)
        }catch (e: Exception){
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

    suspend fun getCrypto(id: String) : Resource<Crypto>{
        val response = try {
            api.getCrypto(API_KEY,id, CALL_ATTRIBUTES)
        }catch (e: Exception){
            return Resource.Error("Error.")
        }
        return Resource.Success(response)
    }

}
































































