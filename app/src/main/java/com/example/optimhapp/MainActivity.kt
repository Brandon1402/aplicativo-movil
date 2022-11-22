package com.example.optimhapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
       iniEvent()
         crearCuenta()
         olvidocontra()
    }

   fun iniEvent() {

        val Button = findViewById<Button>(R.id.button2)
        Button.setOnClickListener {
            val intent = Intent(this, InicioSesion::class.java)
            startActivity(intent)
        }
    }
        fun crearCuenta() {

            val Button = findViewById<Button>(R.id.button)
            Button.setOnClickListener {
                val intent = Intent(this, CreacCuenta::class.java)
                startActivity(intent)
            }

        }

      fun olvidocontra() {

        val Button = findViewById<Button>(R.id.button4)
        Button.setOnClickListener {
            val intent = Intent(this, OlvidoContrasena::class.java)
            startActivity(intent)
        }

    }

}