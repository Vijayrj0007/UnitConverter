package com.example.unitconveter

import android.content.Intent
import android.os.Bundle
import android.os.Parcel
import android.os.Parcelable
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity() : AppCompatActivity(), Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainActivity> {
        override fun createFromParcel(parcel: Parcel): MainActivity {
            return MainActivity(parcel)
        }

        override fun newArray(size: Int): Array<MainActivity?> {
            return arrayOfNulls(size)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val btnIntent= findViewById<Button>(R.id.button)
        btnIntent.setOnClickListener{
            intent= Intent(applicationContext, LengthC::class.java)
            startActivity(intent)
        }

        val btnIntent2= findViewById<Button>(R.id.button2)
        btnIntent2.setOnClickListener {
            this.intent = Intent(applicationContext, WeightC::class.java)
            startActivity(intent)
        }

        val btnIntent3= findViewById<Button>(R.id.button3)
        btnIntent3.setOnClickListener {
            this.intent = Intent(applicationContext, TemperatureC::class.java)
            startActivity(intent)
        }

    }
}