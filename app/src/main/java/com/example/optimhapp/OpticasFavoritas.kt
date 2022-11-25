package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class OpticasFavoritas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opticas_favoritas)
        iniEvent()
        agregarOpti()

    }

    fun iniEvent() {

        val ImageButton = findViewById<ImageButton>(R.id.imageButton)
        ImageButton.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
    fun agregarOpti() {
        val button = findViewById<Button>(R.id.button32)
        button.setOnClickListener {
            val intent = Intent(this, AgregarOptica::class.java)
            startActivity(intent)
        }
    }
}