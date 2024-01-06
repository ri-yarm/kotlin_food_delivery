package com.example.fooddelivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton

class StartActivityAfterSplash : AppCompatActivity() {

    private lateinit var goLoginPage: AppCompatButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        goLoginPage = findViewById(R.id.button_login_page)

        goLoginPage.setOnClickListener {
            val intent = Intent(this@StartActivityAfterSplash, LoginActivity::class.java)

            startActivity(intent)
            finish()
        }
    }
}