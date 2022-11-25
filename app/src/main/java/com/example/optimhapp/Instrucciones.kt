package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Instrucciones : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_instrucciones)
        iniEvent()
        val bundle = intent.extras
        val dato = bundle?.getString("datos")
        val reco = findViewById<TextView>(R.id.textView29)
        reco.text = "¡Bienvenid@, " + dato.toString() + "!"
    }
    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button7)
        Button.setOnClickListener {
            val intent = Intent(this, Menu::class.java)
            startActivity(intent)
        }
    }
}