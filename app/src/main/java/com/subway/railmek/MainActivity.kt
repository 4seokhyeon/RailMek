package com.subway.railmek

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.subway.railmek.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        //Component 네비게이션 바텀 하단바 적용
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.my_nav_host) as NavHostFragment?
        val navController = navHostFragment!!.navController
        setupWithNavController(_binding!!.myBottomNav, navController)
        setContentView(binding.root)
    }
}