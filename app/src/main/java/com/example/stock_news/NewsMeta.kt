package com.example.stock_news

import com.squareup.moshi.Json

class NewsMeta (
    @Json(name = "found")
    val found: Int,
    @Json(name = "limit")
    val limit: Int,
    @Json(name = "page")
    val page: Int,
    @Json(name = "returned")
    val returned: Int
)
