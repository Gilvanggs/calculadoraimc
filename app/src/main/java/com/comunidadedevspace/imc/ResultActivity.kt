package com.comunidadedevspace.imc

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

const val KEY_RESUT_IMC = "ResultActivy.KEY_IMC"

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)
        val result = intent.getFloatExtra(KEY_RESUT_IMC, 0f)

        val tvResult = findViewById<TextView>(R.id.tv_result)
        val tvClassificacao = findViewById<TextView>(R.id.tv_classificacao)

        tvResult.text = result.toString()

        var classificacao: String? = null

        if (result <= 16f){
            classificacao = "MAGREZA GRAVE"
        } else if (result > 16f && result <= 16.9f){
           classificacao = "MAGREZA MODERADA"
        } else if (result > 17f && result <= 18.5f){
            classificacao = "MAGREZA LEVE"
        } else if (result > 18.6f && result <= 24.9f){
            classificacao = "PARABÉNS VOCÊ ESTÁ NO PESO IDEAL"
        } else if (result > 25f && result <= 29.9f){
            classificacao = "SOBREPESO"
        } else if (result > 30f && result <= 34.9f){
            classificacao = "OBESIDADE GRAU |"
        } else if ( result > 35f && result <= 39.9f){
            classificacao = "OBESIDADE GRAU ||"
        } else {
            classificacao = "OBESIDADE GRAU |||"
        }

        tvClassificacao.text = classificacao


        }
    }
