package com.erenkara.kotlinretrofit.service

import com.erenkara.kotlinretrofit.model.CryptoModel
import io.reactivex.Observable
import retrofit2.http.GET

interface CryptoAPI {
    // GET, POST, UPDATE, DELETE
    // https://api.nomics.com/v1/prices?key=369500b607f141a49d61750374798f26380236a1

    @GET("prices?key=369500b607f141a49d61750374798f26380236a1")
    fun getData() : Observable<List<CryptoModel>>

    // fun getData(): Call<List<CryptoModel>>
}