package com.example.booksapp.Main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.Main.login.LoginActivity
import com.example.booksapp.Main.register.RegisterActivity
import com.example.booksapp.R
import com.example.booksapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navigateToLogin()
        navigateToRegister()
    }

    private fun navigateToRegister() {
        binding.btnContinueWithoutLogin.setOnClickListener {
            startActivity(Intent(this@MainActivity, RegisterActivity::class.java))
        }
    }

    private fun navigateToLogin() {
        binding.btnTologin.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))
        }
    }
}