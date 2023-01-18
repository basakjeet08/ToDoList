package com.anirban.to_dolist.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.anirban.to_dolist.R
import com.anirban.to_dolist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.bottomNavBar.itemIconTintList = null

        d("Main Activity" , "Before nav call")

        // Navigation Controller Setup
        val navHostFragmentContainer =supportFragmentManager.findFragmentById(R.id.navHostFragmentContainer) as NavHostFragment
        val navController = navHostFragmentContainer.navController
        binding.bottomNavBar.setupWithNavController(navController)


        d("Main Activity" , "After nav call")


//        code to change the Background Color of a textView
//        binding.textView.setBackgroundResource(R.drawable.corner_rounder_blue_background)

    }
}