package com.example.booksapp.Main.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.booksapp.R
import com.example.booksapp.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}