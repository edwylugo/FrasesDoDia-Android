package com.edwylugo.frasesdodia

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    lateinit var texto: TextView
    lateinit var botao: Button

    val frases = arrayOf(
        "frase 1",
        "frase 2",
        "frase 3",
        "frase 4"
       )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById(R.id.textView) as TextView //Em Kotlin
        botao = findViewById(R.id.button) as Button
    }

    fun gerarFrase(view: View){

        val totalIntensArray = frases.size
        val numeroAleatorio = Random().nextInt(totalIntensArray)
        texto.setText(frases [numeroAleatorio])
    }
}
