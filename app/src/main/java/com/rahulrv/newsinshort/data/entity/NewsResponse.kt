package com.rahulrv.newsinshort.data.entity

/**
 * Created by  rahulramanujam On 1/20/24
 *
 */
data class NewsResponse (
    val status:String,
    val totalResults:Int,
    val articles: List<Article>
)

data class Article(
    val author:String,
    val title:String,
    val description:String,
    val ur:String,
    val urlToImage: String,
    val publishedAt:String,
    val content:String,
    val source: Source
)

data class Source(
    val id:String,
    val name:String
)