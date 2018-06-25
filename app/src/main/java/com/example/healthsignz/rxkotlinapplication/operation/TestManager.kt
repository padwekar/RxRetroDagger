package com.example.healthsignz.rxkotlinapplication.operation

import com.example.healthsignz.rxkotlinapplication.dependency.component.DaggerNetworkComponent
import com.example.healthsignz.rxkotlinapplication.model.TestPogo
import io.reactivex.Observable
import retrofit2.*
import javax.inject.Inject

class TestManager {

    @Inject
    lateinit var testDataOperation: TestDataOperation

    init {
        DaggerNetworkComponent.builder().build().inject(this)
    }


    fun getTestData() : Observable<TestPogo>{
        return  Observable.create<TestPogo>{
            testDataOperation.getTestData().enqueue(object : Callback<TestPogo> {
                override fun onFailure(call: Call<TestPogo>?, t: Throwable?) {
                            it.onError(t!!)
                }

                override fun onResponse(call: Call<TestPogo>?, response: Response<TestPogo>?) {
                            it.onNext(response?.body()!!)
                }
            })
        }
    }

}