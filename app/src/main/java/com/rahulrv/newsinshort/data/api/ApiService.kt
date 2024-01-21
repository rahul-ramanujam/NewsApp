package com.rahulrv.newsinshort.data.api

import com.rahulrv.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
interface ApiService {

    @GET("v2/top-headlines")
    fun getNewsHeadline(
        @Query("country") country: String,
        @Query("apiKey") apiKey: String = "4fdf10c4405643aaab19df38a4ef69a1"
    ): Response<NewsResponse>
}