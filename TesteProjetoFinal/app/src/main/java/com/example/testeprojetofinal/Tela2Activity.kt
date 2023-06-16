package com.example.testeprojetofinal

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Tela2Activity : AppCompatActivity() {
    private var contador: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teladois)


        val buttonVingadores = findViewById<Button>(R.id.button2)
        val buttonBastardos = findViewById<Button>(R.id.button3)
        val buttonInterestelar = findViewById<Button>(R.id.button4)
        val buttonCarros = findViewById<Button>(R.id.button5)

        buttonVingadores.setOnClickListener {
            val intent = Intent(this, Tela3Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonBastardos.setOnClickListener {
            contador++
            val intent = Intent(this, Tela3Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonInterestelar.setOnClickListener {
            val intent = Intent(this, Tela3Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }

        buttonCarros.setOnClickListener {
            val intent = Intent(this, Tela3Activity::class.java)
            intent.putExtra("contador", contador)
            startActivity(intent)
        }
    }
}
