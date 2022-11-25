package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class AgregarOptica : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_agregar_optica)
        iniEvent()
    }

    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button34)
        Button.setOnClickListener {
            var nombre = findViewById<EditText>(R.id.editTextTextPersonName3)
            var direccion = findViewById<EditText>(R.id.editTextTextPostalAddress)
            var numero = findViewById<EditText>(R.id.editTextPhone)
            var horario = findViewById<EditText>(R.id.editTextTextPersonName4)
            var enviar = Intent(this,OpticasFavoritas::class.java)
            enviar.putExtra("nombre", nombre.text.toString())
            enviar.putExtra("direccion",direccion.text.toString())
            enviar.putExtra("numero",numero.text.toString())
            enviar.putExtra("horario",horario.text.toString())
            startActivity(enviar)
        }
    }
}