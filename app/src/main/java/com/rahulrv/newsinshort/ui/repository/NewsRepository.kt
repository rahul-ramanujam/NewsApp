package com.rahulrv.newsinshort.ui.repository

import com.rahulrv.newsinshort.data.datasource.NewsDataSource
import com.rahulrv.newsinshort.data.entity.NewsResponse
import com.rahulrv.utilities.ResourceState
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
class NewsRepository @Inject constructor(
    private val newsDataSource: NewsDataSource
) {
    suspend fun getNewsHeadline(country:String) : Flow<ResourceState<NewsResponse>> {
        return flow {
            emit(ResourceState.Loading())

            val response = newsDataSource.getNewsHeadline(country)

            if(response.isSuccessful && response.body() != null) {
                emit(ResourceState.Success(response.body()!!))
            } else {
                println("Homescreen --> ${response.errorBody() ?: "error "}")
                emit(ResourceState.Error("Error fetching news data ${response.errorBody() ?: "error"}"))
            }
        }.catch { error ->
            emit(ResourceState.Error(error = error.localizedMessage ?: "Some error in flow"))
        }
    }
}