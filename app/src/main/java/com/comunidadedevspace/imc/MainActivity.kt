package com.comunidadedevspace.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.snackbar.Snackbar
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


            val pesoStr: String = edittextPeso.text.toString()
            val alturaStr: String = edittextAltura.text.toString()
            if (pesoStr == "" || alturaStr == ""){
                //Mostrar mensagem para o usuario
                Snackbar.make(
                    edittextPeso,
                    "Preencha todos os campos",
                    Snackbar.LENGTH_LONG
                ).show()

        }else{
            val peso = edittextPeso.text.toString().toFloat()
            val altura = edittextAltura.text.toString().toFloat()

            val alturaQ2 = altura * altura
            val resultado = peso / alturaQ2
                // Navegar para proxima tela
                // Criar o layout da proxima tela
                // Passar dados para proxima tela

                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra(KEY_RESUT_IMC, resultado)
                startActivity(intent)

                // Cores
                // EditText background + icone
                // Gradiente + icone + titulo + descrição

            }



        }
    }
}