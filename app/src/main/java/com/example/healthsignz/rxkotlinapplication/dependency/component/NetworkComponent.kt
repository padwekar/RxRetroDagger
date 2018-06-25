package com.example.healthsignz.rxkotlinapplication.dependency.component

import com.example.healthsignz.rxkotlinapplication.dependency.modules.RetrofitModule
import com.example.healthsignz.rxkotlinapplication.operation.TestManager
import dagger.Component


@Component(modules = [RetrofitModule::class])
interface NetworkComponent {
    fun inject(manager : TestManager)
}