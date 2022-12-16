package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val resultado = findViewById<TextView>(R.id.textResultado)
        val btResultado = findViewById<Button>(R.id.botaoConverter)
        btResultado.setOnClickListener {
            Converter()
        }

    }

    private fun Converter() {

        val radius = findViewById<RadioGroup>(R.id.grupo_de_botoes)
        val checar = radius.checkedRadioButtonId

        val conversaodeValor = when(checar){
            R.id.USD_BT -> "USD"
            R.id.EUR_BT -> "EUR"
            else -> "CLP"
        }
        val dadosinseridos = findViewById<EditText>(R.id.editTextNumber)
        val coletadeDados = dadosinseridos.text.toString()

        if (coletadeDados.isEmpty()) {
            return
        }



    }
}