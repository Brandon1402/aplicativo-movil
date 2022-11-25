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
        cerrar()
        opti()
        ejerci()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button10)
        Button.setOnClickListener {
            val intent = Intent(this, pregunta1::class.java)
            startActivity(intent)
        }
    }

    fun cerrar() {

        val Button = findViewById<Button>(R.id.button31)
        Button.setOnClickListener {
            val intent = Intent(this, cambiarycerrar::class.java)
            startActivity(intent)
        }
    }

    fun opti() {

        val Button = findViewById<Button>(R.id.button11)
        Button.setOnClickListener {
            val intent = Intent(this, OpticasFavoritas::class.java)
            startActivity(intent)
        }
    }

    fun ejerci() {

        val Button = findViewById<Button>(R.id.button12)
        Button.setOnClickListener {
            val intent = Intent(this, Ejercicio1::class.java)
            startActivity(intent)
        }
    }
}