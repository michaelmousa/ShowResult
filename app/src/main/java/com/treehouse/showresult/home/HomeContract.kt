package com.treehouse.showresult.home

import com.treehouse.showresult.model.UserDat


interface HomeContract{

    interface View {
        fun showResults(result: List<UserDat>)
        fun showError(message: String)
    }
    interface Presenter{
        fun getUserDetails(user:String)
    }
}