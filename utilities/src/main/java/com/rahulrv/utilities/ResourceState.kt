package com.rahulrv.utilities

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
sealed class ResourceState<T> {

    class  Loading<T> : ResourceState<T>()
    data class Success<T> (val data:T): ResourceState<T>()
    data class Error<T>(val error: String):ResourceState<T>()
}