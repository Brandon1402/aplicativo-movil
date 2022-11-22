package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pregunta1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta1)
        iniEvent()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button14)
        Button.setOnClickListener {
            val intent = Intent(this, pregunta2::class.java)
            startActivity(intent)
        }
    }
}