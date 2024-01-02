package com.subway.railmek.login

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.subway.railmek.R
import com.subway.railmek.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private var _binding:ActivityLoginBinding?= null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}