package com.example.class360.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.class360.MainActivity
import com.example.class360.R

class LoginActivity : AppCompatActivity() {

    private lateinit var submit_btn : Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        submit_btn = findViewById(R.id.submit_btn)

        submit_btn.setOnClickListener {

            val intent : Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}