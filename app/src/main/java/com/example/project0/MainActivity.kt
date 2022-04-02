package com.example.project0

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle? ) {
        title= "Hello World!"

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}