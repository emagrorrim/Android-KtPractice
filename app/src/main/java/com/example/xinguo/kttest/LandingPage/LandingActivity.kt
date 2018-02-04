package com.example.xinguo.kttest.LandingPage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import com.example.xinguo.kttest.Network.NetworkClient
import com.example.xinguo.kttest.Network.OkHttpNetworkClient
import com.example.xinguo.kttest.R

class LandingActivity : AppCompatActivity() {
  private val client: NetworkClient = OkHttpNetworkClient()

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    setupSearchView()
  }

  private fun setupSearchView() {
    val searchView = findViewById<SearchView>(R.id.landing_search_view)

  }

  private fun fetchData() {
//    client.get(url = "https://api.douban.com/v2/user/xxx") {
//      val textView = findViewById<TextView>(R.id.text_view)
//      textView.text = it
//    }
  }
}
