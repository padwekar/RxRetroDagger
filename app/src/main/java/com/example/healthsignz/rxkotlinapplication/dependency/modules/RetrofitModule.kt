package com.example.healthsignz.rxkotlinapplication.dependency.modules

import com.example.healthsignz.rxkotlinapplication.operation.TestDataOperation
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


@Module
class RetrofitModule {

    @Provides
    fun retrofit() : Retrofit {
        return   Retrofit.Builder()
                .baseUrl("https://jsonplaceholder.typicode.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
    }

    @Provides
    fun testDataInstance(retrofit: Retrofit) : TestDataOperation {
        return retrofit.create(TestDataOperation::class.java)
    }

}