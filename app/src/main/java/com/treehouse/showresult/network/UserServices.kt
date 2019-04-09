package com.treehouse.showresult.network

import com.treehouse.showresult.model.UserDat
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface UserServices {
    @GET(END_POINT)
    fun getUserDetails(): Observable<List<UserDat>>
}