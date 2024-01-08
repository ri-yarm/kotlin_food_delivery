package com.example.fooddelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.fooddelivery.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bottomNavView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)
        val navigationView = findNavController(R.id.fragment_container)

        bottomNavView.setupWithNavController(navigationView)

    }
}


// TODO: убрано логика смены фрагментов, из-за того что ломался imageSlider

//private lateinit var binding: ActivityMainBinding
//
//override fun onCreate(savedInstanceState: Bundle?) {
//    super.onCreate(savedInstanceState)
//    binding = ActivityMainBinding.inflate(layoutInflater)
//    setContentView(binding.root)
//
//    changeFragment(HomeFragment())
//
//    binding.bottomNavigationView.setOnItemSelectedListener {
//        when (it.itemId) {
//            R.id.menu_home -> {
//                changeFragment(HomeFragment())
//            }
//
//            R.id.menu_cart -> {
//                changeFragment(CartFragment())
//            }
//
//            R.id.menu_search -> {
//                changeFragment(SearchFragment())
//            }
//
//            R.id.menu_history -> {
//                changeFragment(HistoryFragment())
//            }
//
//            R.id.menu_profile -> {
//                changeFragment(ProfileFragment())
//            }
//        }
//
//        return@setOnItemSelectedListener true
//    }
//}
//
//private fun changeFragment(activity: Fragment) {
//    val fragmentManager = supportFragmentManager
//    val fragmentTransaction = fragmentManager.beginTransaction()
//
//    fragmentTransaction.replace(R.id.fragment_container, activity)
//    fragmentTransaction.commit()
//}