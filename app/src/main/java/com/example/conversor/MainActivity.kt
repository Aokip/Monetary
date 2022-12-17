package com.example.conversor

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {
    lateinit var resultado: TextView

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        resultado = findViewById<EditText>(R.id.textResultado)
        val btResultado = findViewById<Button>(R.id.botaoConverter)
        btResultado.setOnClickListener {


            Converter()

        }

    }

    private fun Converter() {

        val radius = findViewById<RadioGroup>(R.id.grupo_de_botoes)
        val checar = radius.checkedRadioButtonId


        val conversaodeValor = when (checar) {
            R.id.USD_BT -> 5.31
            R.id.EUR_BT -> 5.62
            else -> 0.06
        }
        var dadosinseridos = findViewById<EditText>(R.id.editTextNumber)
        val coletadeDados = dadosinseridos.text.toString()

        if (coletadeDados.isEmpty()) {

            return

        } else {

            val resultadoMulti =
                ((coletadeDados.toDouble() / conversaodeValor) * 100.0).roundToInt() / 100.0
            val toString = resultadoMulti.toBigDecimal()

            resultado.text = ("R$ $toString")
            resultado.visibility = View.VISIBLE


        }

    }
}

