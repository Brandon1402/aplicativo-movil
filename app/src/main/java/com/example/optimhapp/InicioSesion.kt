package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicioSesion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_sesion)
        iniEvent()
        crearCuen()
        instruc()
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button4)
        Button.setOnClickListener {
            val intent = Intent(this, OlvidoContrasena::class.java)
            startActivity(intent)
        }
    }
    fun crearCuen() {

        val Button = findViewById<Button>(R.id.button5)
        Button.setOnClickListener {
            val intent = Intent(this, CreacCuenta::class.java)
            startActivity(intent)
        }
    }
    fun instruc() {

        val Button = findViewById<Button>(R.id.button3)
        Button.setOnClickListener {
            val intent = Intent(this, Instrucciones::class.java)
            startActivity(intent)
        }
    }
}