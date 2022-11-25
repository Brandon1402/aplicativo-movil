package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Recomendaciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recomendaciones)
        iniEvent()
    }

    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button44)
        Button.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}