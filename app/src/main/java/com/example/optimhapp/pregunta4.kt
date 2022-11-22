package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class pregunta4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pregunta4)
        iniEvent()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button20)
        Button.setOnClickListener {
            val intent = Intent(this, pregunta5::class.java)
            startActivity(intent)
        }
    }
}