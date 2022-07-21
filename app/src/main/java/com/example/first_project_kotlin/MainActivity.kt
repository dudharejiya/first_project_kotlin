package com.example.first_project_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        println("onStart method is called")
    }

    override fun onResume() {
        super.onResume()
        println("onResume method is called")
    }

    override fun onPause() {
        super.onPause()
        println("onPause method is called")
    }

    override fun onStop() {
        super.onStop()
        println("onStop method is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy method is called")
    }

    override fun onRestart() {
        super.onRestart()
    }

}
