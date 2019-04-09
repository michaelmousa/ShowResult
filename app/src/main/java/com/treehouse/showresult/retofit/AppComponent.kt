package com.treehouse.showresult.retofit

import com.treehouse.showresult.network.UserServices
import dagger.Component
import javax.inject.Singleton

@Component(modules = [NetworkModule::class])
@Singleton
interface AppComponent {
    fun userServices(): UserServices
}