package com.treehouse.showresult.home.di

import com.treehouse.showresult.home.MainActivity
import com.treehouse.showresult.retofit.AppComponent

import dagger.Component

@Component(dependencies = [AppComponent::class], modules = [HomeModule::class])
@HomeScope
interface HomeComponent {
    fun inject(mainActivity: MainActivity)
}