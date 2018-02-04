package com.example.xinguo.kttest.network

class NetworkConfiguration(
    val host: String?,
    val version: String?,
    val services: Map<String, Any>
) {
  companion object {
    val default: NetworkConfiguration = NetworkConfiguration(
        host = "https://api.douban.com",
        version = "2",
        services = mapOf(
            "book" to mapOf<String, Any>(
                "search" to "/book/search"
            )
        )
    )
  }

//  fun prefix() : String {
//
//  }
//
//  fun searchBookURL() : String {
//    val uri = (services["book"] as? Map<*, *>)
//    return "$host/v$version/$uri"
//  }
}
