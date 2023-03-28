package com.example.buildresume

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.content.Intent

class splashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        supportActionBar?.hide()
        Handler().postDelayed({
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
            finish()
        },3000)
    }
}