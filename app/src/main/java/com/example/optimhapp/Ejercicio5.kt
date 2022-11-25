package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Ejercicio5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio5)
        iniEvent()
    }

    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button39)
        Button.setOnClickListener {
            val intent = Intent(this, Ejercicio6::class.java)
            startActivity(intent)
        }
    }
}