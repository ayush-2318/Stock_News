package com.example.stock_news

import com.squareup.moshi.Json

class NewsData(@Json(name = "description")
                 val description: String,
                @Json(name = "entities")
                 val entities: List<Any>,
                @Json(name = "image_url")
                 val imageUrl: String,
                @Json(name = "keywords")
                 val keywords: String,
                @Json(name = "language")
                 val language: String,
                @Json(name = "published_at")
                 val publishedAt: String,
                @Json(name = "relevance_score")
                 val relevanceScore: Any?,
//                @Json(name = "similar")
//                 val similar: List<NewsResponse.Data.Similar>,
                @Json(name = "snippet")
                 val snippet: String,
                @Json(name = "source")
                 val source: String,
                @Json(name = "title")
                 val title: String,
                @Json(name = "url")
                 val url: String,
                @Json(name = "uuid")
                 val uuid: String)
