package com.example.testeprojetofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Tela5Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela5)

        val textViewCounter = findViewById<TextView>(R.id.textView7)
        val buttonTelaSurpresa = findViewById<Button>(R.id.button14)
        val buttonTelaInicial = findViewById<Button>(R.id.button15)
        var contador = intent.getIntExtra("contador", 0)

        textViewCounter.text = "$contador"

        buttonTelaSurpresa.setOnClickListener {
            if (contador >= 3) {
                val intent = Intent(this, Tela6Activity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Acerte todos os filmes para ver a tela extra", Toast.LENGTH_SHORT).show()
            }
        }

        buttonTelaInicial.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }
    }
}