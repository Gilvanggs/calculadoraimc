package com.comunidadedevspace.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Recuperar os componentes EditText
        // Criar uma variavel e associar o compponente de UI<EditText>
        // Recuperar o botão da tela

        val edittextPeso = findViewById<TextInputEditText>(R.id.edittext_peso)
        val edittextAltura = findViewById<TextInputEditText>(R.id.edittext_altura)

        val btnCalcular = findViewById<Button>(R.id.btn_calcular)

        btnCalcular.setOnClickListener {
            val peso = edittextPeso.text
            val altura = edittextAltura.text

            println("Gilvan acertou" + peso + altura)
        }
    }
}