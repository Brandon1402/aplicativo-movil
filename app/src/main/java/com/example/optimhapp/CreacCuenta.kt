package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

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
            var nombre = findViewById<EditText>(R.id.editTextTextPersonName2)
            var enviar = Intent(this,Instrucciones::class.java)
            enviar.putExtra("datos", nombre.text.toString())
            startActivity(enviar)
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