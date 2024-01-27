package com.ecrinaybay.cryptocrazyapp.viewmodel

import androidx.lifecycle.ViewModel
import com.ecrinaybay.cryptocrazyapp.model.Crypto
import com.ecrinaybay.cryptocrazyapp.repository.CryptoRepository
import com.ecrinaybay.cryptocrazyapp.util.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class CryptoDetailViewModel @Inject constructor(
    private val repository: CryptoRepository
) : ViewModel() {

    suspend fun getCrypto(id: String) : Resource<Crypto>{
        return repository.getCrypto(id)
    }

}




































































