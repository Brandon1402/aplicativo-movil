package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        iniEvent()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button10)
        Button.setOnClickListener {
            val intent = Intent(this, pregunta1::class.java)
            startActivity(intent)
        }
    }
}