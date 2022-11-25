package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class OpticasFavoritas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opticas_favoritas)
        iniEvent()
        agregarOpti()
        val bundle = intent.extras
        val nombre = bundle?.getString("nombre")
        val direccion = bundle?.getString("direccion")
        val numero = bundle?.getString("numero")
        val horario = bundle?.getString("horario")
        val reco = findViewById<TextView>(R.id.textView25)
        reco.text = nombre.toString() + "\n" + direccion.toString() + "\n"+ numero.toString() + "\n" + horario.toString()

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