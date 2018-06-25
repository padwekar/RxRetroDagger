package com.example.healthsignz.rxkotlinapplication.operation

import com.example.healthsignz.rxkotlinapplication.model.TestPogo
import retrofit2.Call
import retrofit2.http.GET

interface TestDataOperation {
    @GET("posts/1")
    fun getTestData() : Call<TestPogo>
}