package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.fooddelivery.databinding.ActivityStartBinding

class StartActivityAfterSplash : AppCompatActivity() {

    private lateinit var goLoginPage: AppCompatButton

    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLoginPage.setOnClickListener {
            val intent = Intent(this@StartActivityAfterSplash, LoginActivity::class.java)

            startActivity(intent)
            finish()
        }
    }
}