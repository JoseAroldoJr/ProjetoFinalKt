package com.example.testeprojetofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Tela3Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela3)

        var contador = intent.getIntExtra("contador", 0)

        val buttonLigaDaJustica = findViewById<Button>(R.id.button10)
        val buttonCinderela = findViewById<Button>(R.id.button11)
        val buttonInterestelar2 = findViewById<Button>(R.id.button12)
        val buttonAOrigem = findViewById<Button>(R.id.button13)

        buttonLigaDaJustica.setOnClickListener {
            val intent = Intent(this, Tela4Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonCinderela.setOnClickListener {
            val intent = Intent(this, Tela4Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonInterestelar2.setOnClickListener {
            contador++
            val intent = Intent(this, Tela4Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonAOrigem.setOnClickListener {
            val intent = Intent(this, Tela4Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }
    }
}
