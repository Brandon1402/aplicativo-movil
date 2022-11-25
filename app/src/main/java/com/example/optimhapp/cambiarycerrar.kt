package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class cambiarycerrar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cambiarycerrar)
        iniEvent()
        cambiar()
        cerrar()
    }

    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button30)
        Button.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }

    fun cambiar() {

        val Button = findViewById<Button>(R.id.button28)
        Button.setOnClickListener {
            val intent = Intent(this, InicioSesion::class.java)
            startActivity(intent)
        }
    }

    fun cerrar() {

        val Button = findViewById<Button>(R.id.button29)
        Button.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

}