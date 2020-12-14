package com.example.androidtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class success : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success)
        var button: Button = findViewById(R.id.buttonBack)
        button.setOnClickListener {
            intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}