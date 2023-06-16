package com.example.testeprojetofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Tela4Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela4)

        var contador = intent.getIntExtra("contador", 0)

        val buttonRobocop = findViewById<Button>(R.id.button6)
        val buttonHomemDeFerro2 = findViewById<Button>(R.id.button7)
        val buttonMissaoImpossivel = findViewById<Button>(R.id.button8)
        val buttonVingadoresUltimato = findViewById<Button>(R.id.button9)

        buttonRobocop.setOnClickListener {
            val intent = Intent(this, Tela5Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonHomemDeFerro2.setOnClickListener {
            val intent = Intent(this, Tela5Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonMissaoImpossivel.setOnClickListener {
            val intent = Intent(this, Tela5Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonVingadoresUltimato.setOnClickListener {
            contador++
            val intent = Intent(this, Tela5Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }
    }
}