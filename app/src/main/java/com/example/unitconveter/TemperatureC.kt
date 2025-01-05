package com.example.unitconveter

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class TemperatureC : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_temperature_c)


        val edt : EditText = findViewById<EditText>(R.id.editTextNumberDecimal3)
        val btn : Button = findViewById(R.id.button10)
        val btn2 : Button = findViewById(R.id.button11)
        val resultText : TextView = findViewById(/* id = */ R.id.textView7)

        btn.setOnClickListener(){
            val celcius: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToKelvin(celcius))

        }

        btn2.setOnClickListener(){
            val celcius: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToFh(celcius))

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun convertToKelvin(celcius: Double):Double{
        var  kelvin = celcius*274.15
        return kelvin
    }

    fun convertToFh(celcius: Double):Double{
        var  Fhh = celcius*33.8
        return Fhh
    }
}