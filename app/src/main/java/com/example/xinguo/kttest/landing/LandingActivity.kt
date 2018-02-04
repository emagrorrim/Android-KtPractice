package com.example.xinguo.kttest.landing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.xinguo.kttest.R
import com.example.xinguo.kttest.landing.interfaces.LandingPresenter
import com.example.xinguo.kttest.landing.interfaces.LandingView

class LandingActivity : AppCompatActivity(), LandingView {
  private var presenter: LandingPresenter? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    presenter = LandingPresenterImpl(this, LandingInteractorImpl())
  }
}
