package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class CreacCuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_creac_cuenta)
        iniEvent()
        cuentaCre()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button8)
        Button.setOnClickListener {
            val intent = Intent(this, InicioSesion::class.java)
            startActivity(intent)
        }
    }
    fun cuentaCre() {

        val Button = findViewById<Button>(R.id.button9)
        Button.setOnClickListener {
            val intent = Intent(this, InicioSesion::class.java)
            startActivity(intent)
        }
    }

}