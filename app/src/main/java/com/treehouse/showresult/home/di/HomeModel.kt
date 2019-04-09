package com.treehouse.showresult.home.di

import com.treehouse.showresult.home.HomeContract
import com.treehouse.showresult.home.HomePresenter
import com.treehouse.showresult.network.UserServices
import dagger.Module
import dagger.Provides

@Module
class HomeModule(private val view: HomeContract.View) {

    @HomeScope
    @Provides
    fun provideHomePresenter(UserServices: UserServices)
            : HomeContract.Presenter {
        return HomePresenter(UserServices, view)
    }
}