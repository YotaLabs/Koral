package com.yotalabs.koral.ui.auth.registration.personal.confirmation

import com.arellomobile.mvp.MvpView
import com.arellomobile.mvp.viewstate.strategy.OneExecutionStateStrategy
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType
import com.yotalabs.koral.ui.mvp.ErrorView
import com.yotalabs.koral.ui.mvp.LoadingView

interface ConfirmationView : MvpView, ErrorView, LoadingView {

    @StateStrategyType(OneExecutionStateStrategy::class)
    fun onClickedApply()

}
