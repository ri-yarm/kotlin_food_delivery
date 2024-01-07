package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fooddelivery.databinding.ActivityLoginBinding
import com.example.fooddelivery.databinding.ActivitySignUpUserBinding

class SignUpUserActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.jumpToLogin.setOnClickListener {
            val intent = Intent(this@SignUpUserActivity, LoginActivity::class.java)
            startActivity(intent)
        }

        binding.singUpBtn.setOnClickListener {
            val intent = Intent(this@SignUpUserActivity, LocationActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}