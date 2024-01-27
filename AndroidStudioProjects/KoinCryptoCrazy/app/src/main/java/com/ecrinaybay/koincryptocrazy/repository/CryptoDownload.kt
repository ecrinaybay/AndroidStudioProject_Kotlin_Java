package com.ecrinaybay.koincryptocrazy.repository

import com.ecrinaybay.koincryptocrazy.model.CryptoModel
import com.ecrinaybay.koincryptocrazy.util.Resource

interface CryptoDownload {
    suspend fun downloadCryptos() : Resource<List<CryptoModel>>
}




























































