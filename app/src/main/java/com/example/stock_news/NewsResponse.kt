package com.example.stock_news


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NewsResponse(
    @Json(name = "data")
    val `data`: List<NewsData>,
    @Json(name = "meta")
    val meta: NewsMeta
)// {
//    @JsonClass(generateAdapter = true)
   // data class Data(
//        @Json(name = "description")
//        val description: String,
//        @Json(name = "entities")
//        val entities: List<Any>,
//        @Json(name = "image_url")
//        val imageUrl: String,
//        @Json(name = "keywords")
//        val keywords: String,
//        @Json(name = "language")
//        val language: String,
//        @Json(name = "published_at")
//        val publishedAt: String,
//        @Json(name = "relevance_score")
//        val relevanceScore: Any?,
//        @Json(name = "similar")
//        val similar: List<Similar>,
//        @Json(name = "snippet")
//        val snippet: String,
//        @Json(name = "source")
//        val source: String,
//        @Json(name = "title")
//        val title: String,
//        @Json(name = "url")
//        val url: String,
//        @Json(name = "uuid")
//        val uuid: String
   // ) {
//        @JsonClass(generateAdapter = true)
//        data class Similar(
//            @Json(name = "description")
//            val description: String,
//            @Json(name = "entities")
//            val entities: List<Any>,
//            @Json(name = "image_url")
//            val imageUrl: String,
//            @Json(name = "keywords")
//            val keywords: String,
//            @Json(name = "language")
//            val language: String,
//            @Json(name = "published_at")
//            val publishedAt: String,
//            @Json(name = "relevance_score")
//            val relevanceScore: Any?,
//            @Json(name = "snippet")
//            val snippet: String,
//            @Json(name = "source")
//            val source: String,
//            @Json(name = "title")
//            val title: String,
//            @Json(name = "url")
//            val url: String,
//            @Json(name = "uuid")
//            val uuid: String
//        )
//    }

   // @JsonClass(generateAdapter = true)
//    data class Meta(
//        @Json(name = "found")
//        val found: Int,
//        @Json(name = "limit")
//        val limit: Int,
//        @Json(name = "page")
//        val page: Int,
//        @Json(name = "returned")
//        val returned: Int
//    )
//}