package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pregunta7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta7)
        iniEvent()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button26)
        Button.setOnClickListener {
            val intent = Intent(this, diagnostico::class.java)
            startActivity(intent)
        }
    }
}