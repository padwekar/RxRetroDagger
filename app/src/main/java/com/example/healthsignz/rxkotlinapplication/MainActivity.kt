package com.example.healthsignz.rxkotlinapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.healthsignz.rxkotlinapplication.operation.TestManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        TestManager().getTestData().subscribe{
            print(it)
        }
    }
}
