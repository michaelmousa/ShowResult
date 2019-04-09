package com.treehouse.showresult

import android.app.Application
import com.treehouse.showresult.retofit.AppComponent
import com.treehouse.showresult.retofit.DaggerAppComponent

class App : Application() {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder().build();
    }
    fun getComponent() = appComponent
}