package com.example.unitconveter

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class WeightC : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_weight_c)

        val edt : EditText = findViewById<EditText>(R.id.editTextNumberDecimal2)
        val btn : Button = findViewById(R.id.button6)
        val btn2 : Button = findViewById(R.id.button7)
        val btn3 : Button = findViewById(R.id.button8)
        val btn4 : Button = findViewById(R.id.button9)

        val resultText : TextView = findViewById(R.id.textView6)

        btn.setOnClickListener(){
            val gram: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToPounds(gram))

        }

        btn2.setOnClickListener(){
            val gram: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToTonne(gram))

        }

        btn3.setOnClickListener(){
            val gram: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToOunce(gram))

        }

        btn4.setOnClickListener(){
            val gram: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToStone(gram))

        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


    }
    fun convertToPounds(gram: Double):Double{
        var Pounds = gram*0.00220462
        return Pounds
    }

    fun convertToTonne(gram: Double):Double{
        var tonne = gram*0.0000011023
        return tonne
    }
    fun convertToOunce(gram: Double):Double{
        var ounce = gram*0.035274
        return ounce
    }
    fun convertToStone(gram: Double):Double{
        var stone = gram*0.000157473
        return stone
    }
}