package com.example.xinguo.kttest.Network

interface NetworkClient {
  fun get(url: String, completion: (String) -> Unit)
  fun post(url: String, parameter: Map<String, Any>, completion: (String) -> Unit)
}