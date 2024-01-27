package com.ecrinaybay.artbooktesting.model

import android.icu.lang.UCharacter.EastAsianWidth
import com.google.gson.annotations.SerializedName

data class ImageResult(
    val comments: Int,
    val downloads: Int,
    val favorites: Int,
    val id: Int,
    val imageHeight: Int,
    val imageSize: Int,
    val imageWidth : Int,
    val largeImageURL: String,
    val likes: Int,
    val pageURL : String,
    val previewHeight: Int,
    val previewURL: String,
    val previewWidth:Int,
    val tags: String,
    val type: String,
    val user: String,
    @SerializedName("user_id")
    val userId : Int,
    val userImageURL: String,
    val views : Int,
    val webformatHeight: Int,
    val webformatURL: String,
    val webformatWidth: Int
)
/*
data class ImageResult(
    val comments: Int,
    val downloads: Int,
    val favorites: Int,
    val id: Int,
    val imageHeight:Int,
    val imageSize:Int,
    val imageWidth: Int,
    val largeImageURL: String,
    val likes:Int,
    val pageUrl : String,
    val previewHeight: Int,
    val previewURL: String,
    val previewWidth: Int,
    val tags: String,
    val type: String,
    val user: String,
    @SerializedName("user_id")
    val userId: Int,
    val userImageURL: String,
    val views: Int,
    val webformatHeight: Int,
    val webfromatURL: String,
    val webformatWidth:Int
)

 */









































































