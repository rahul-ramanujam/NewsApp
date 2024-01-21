package com.rahulrv.newsinshort.data.datasource

import com.rahulrv.newsinshort.data.entity.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
interface NewsDataSource {
    suspend fun getNewsHeadline(country: String): Response<NewsResponse>
}