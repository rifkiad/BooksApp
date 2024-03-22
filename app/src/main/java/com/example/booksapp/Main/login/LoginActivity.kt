package com.example.booksapp.Main.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.R
import com.example.booksapp.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}