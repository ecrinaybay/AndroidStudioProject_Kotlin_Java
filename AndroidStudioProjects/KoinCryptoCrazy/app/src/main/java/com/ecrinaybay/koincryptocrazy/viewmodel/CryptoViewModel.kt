package com.ecrinaybay.koincryptocrazy.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ecrinaybay.koincryptocrazy.model.CryptoModel
import com.ecrinaybay.koincryptocrazy.repository.CryptoDownload
import com.ecrinaybay.koincryptocrazy.service.CryptoAPI
import com.ecrinaybay.koincryptocrazy.util.Resource
import com.ecrinaybay.koincryptocrazy.view.RecyclerViewAdapter
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CryptoViewModel (
    private val cryptoDownloadRepository : CryptoDownload
) : ViewModel() {

    val cryptoList = MutableLiveData<Resource<List<CryptoModel>>>()
    val cryptoError = MutableLiveData<Resource<Boolean>>()
    val cryptoLoading = MutableLiveData<Resource<Boolean>>()

    private var job : Job? = null

    val exceptionHandler = CoroutineExceptionHandler { coroutineContext, throwable ->
        println("Error: ${throwable.localizedMessage}")
        cryptoError.value = Resource.error(throwable.localizedMessage ?: "error", data = true)
    }

    fun getDataFromAPI(){
        cryptoLoading.value = Resource.loading(data = true)


        /*viewModelScope.launch(Dispatchers.IO + exceptionHandler) {}*/

        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            val resource = cryptoDownloadRepository.downloadCryptos()

            withContext(Dispatchers.Main){
                resource.data?.let {
                    cryptoList.value = resource
                    cryptoLoading.value = Resource.loading(data = false)
                    cryptoError.value = Resource.error("",data = false)
                }
            }
        }
    }

    override fun onCleared() {
        super.onCleared()
        job?.cancel()
    }

}






































































