package com.example.booksapp.SplashScreen

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.booksapp.Main.MainActivity
import com.example.booksapp.R
import com.example.booksapp.databinding.ActivitySplashScreenBinding

@SuppressLint("CustomSplashScreen")
class SplashScreenActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenBinding

    private val SPLASH_DELAY: Long = 2000 // DELAY 2 DETIK

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        startMainActivityWithDelay()
    }

    private fun startMainActivityWithDelay() {
        Handler().postDelayed(Runnable {
            startActivity(Intent(this@SplashScreenActivity, MainActivity::class.java))
        },SPLASH_DELAY)
    }
}