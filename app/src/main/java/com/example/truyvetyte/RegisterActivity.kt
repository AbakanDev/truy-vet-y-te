package com.example.truyvetyte

import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.sign_in_screen)

        val btnBack = findViewById<ImageButton>(/* id = */ R.id.btnBack)
        btnBack.setOnClickListener {
            // Chuyển từ trang hiện tại (this) sang FriendActivity
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            overridePendingTransition(R.anim.slide_in_left, R.anim.slide_out_right)
        }
    }
}