package com.ecrinaybay.artbooktesting.repo

import androidx.lifecycle.LiveData
import com.ecrinaybay.artbooktesting.model.ImageResponse
import com.ecrinaybay.artbooktesting.roomdb.Art
import com.ecrinaybay.artbooktesting.util.Resource

interface ArtRepositoryInterface {

    suspend fun insertArt(art : Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString : String) : Resource<ImageResponse>

}

/*

interface ArtRepositoryInterface {

    suspend fun insertArt(art: Art)

    suspend fun deleteArt(art: Art)

    fun getArt() : LiveData<List<Art>>

    suspend fun searchImage(imageString: String) : Resource<ImageResponse>


}


 */












































































