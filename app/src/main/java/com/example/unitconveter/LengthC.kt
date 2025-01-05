package com.example.unitconveter

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class LengthC : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_length_c)

        val edt : EditText = findViewById<EditText>(R.id.editTextNumberDecimal)
        val btn : Button = findViewById(R.id.button4)
        val btn2 : Button = findViewById(R.id.button5)
        val resultText : TextView = findViewById(R.id.textView5)

        btn.setOnClickListener(){
            val meter: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToKmm(meter))

        }
        btn2.setOnClickListener(){
            val meter: Double = edt.text.toString().toDouble()
            resultText.setText(""+convertToMiles(meter))

        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }


    }

    fun convertToMiles(meter: Double):Double{
        var miles = meter*0.000621371
        return miles
    }

    fun convertToKmm(meter: Double):Double{
        var kilometer = meter*1000
        return kilometer
    }


}


