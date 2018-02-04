package com.example.xinguo.kttest.network

import okhttp3.*
import java.io.IOException

class OkHttpNetworkClient: NetworkClient {
  private val client = OkHttpClient()

  override fun get(url: String, completion: (String) -> Unit) {
    val request = Request.Builder()
        .url(url)
        .build()

    client.newCall(request).enqueue(object : Callback {
      override fun onFailure(call: Call?, e: IOException?) {
        e?.printStackTrace()
      }
      override fun onResponse(call: Call?, response: Response?) {
        completion(response?.body()!!.string())
      }
    })
  }

  override fun post(url: String, parameter: Map<String, Any>, completion: (String) -> Unit) {
    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
  }
}