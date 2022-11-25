package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AgregarOptica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_optica)
        iniEvent()
    }

    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button34)
        Button.setOnClickListener {
            val intent = Intent(this, OpticasFavoritas::class.java)
            startActivity(intent)
        }
    }
}