package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class OpticasFavoritas : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opticas_favoritas)
        iniEvent()

    }

    fun iniEvent() {

        val Button = findViewById<Button>(R.id.button32)
        Button.setOnClickListener {
            val intent = Intent(this, AgregarOptica::class.java)
            startActivity(intent)
        }
    }
}