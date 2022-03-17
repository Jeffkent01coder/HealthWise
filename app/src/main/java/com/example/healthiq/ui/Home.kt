package com.example.healthiq.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.healthiq.databinding.ActivityHomeBinding

class Home : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityHomeBinding.inflate(layoutInflater)
        supportActionBar?.hide()
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}