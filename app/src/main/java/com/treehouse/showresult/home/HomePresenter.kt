package com.treehouse.showresult.home

import com.treehouse.showresult.model.Address
import com.treehouse.showresult.model.UserDat
import com.treehouse.showresult.network.UserServices
import java.net.SocketException
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers

class HomePresenter  (

    private val userServices: UserServices,
    private val view: HomeContract.View): HomeContract.Presenter {

    private val compositeDisposable = CompositeDisposable()

    override fun getUserDetails(user:String) {

        compositeDisposable.add(userServices.getUserDetails()
            .subscribeOn(Schedulers.io())
            .map { it }
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({ view.showResults(it) },

                { failure ->
                    if (failure is SocketException) {
                        view.showError("Domain Error")
                    } else {
                        view.showError(failure?.message ?: "An unknown error happened")
                    }}))}}




