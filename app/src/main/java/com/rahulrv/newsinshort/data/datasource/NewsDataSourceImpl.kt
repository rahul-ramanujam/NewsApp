package com.rahulrv.newsinshort.data.datasource

import com.rahulrv.newsinshort.data.api.ApiService
import javax.inject.Inject

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
class NewsDataSourceImpl @Inject constructor(
    private val apiService: ApiService
) : NewsDataSource {

    override suspend fun getNewsHeadline(country: String)  = apiService.getNewsHeadline(country)
}