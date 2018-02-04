package com.example.xinguo.kttest.LandingPage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.xinguo.kttest.R

class LandingActivity : AppCompatActivity() {
  private var presenter: LandingActivityPresenter? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    presenter = LandingActivityPresenter(this, LandingActivityInteractor())
  }
}
