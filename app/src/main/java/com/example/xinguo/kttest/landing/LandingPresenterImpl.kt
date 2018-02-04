package com.example.xinguo.kttest.landing

import com.example.xinguo.kttest.landing.interfaces.LandingInteractor
import com.example.xinguo.kttest.landing.interfaces.LandingPresenter
import com.example.xinguo.kttest.landing.interfaces.LandingView

class LandingPresenterImpl(_view: LandingView, _interactor: LandingInteractor) : LandingPresenter {
  private val view: LandingView = _view
  private val interactor: LandingInteractor = _interactor
}