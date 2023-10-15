package com.example.myapplication

import android.annotation.SuppressLint
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.ComponentActivity

class MainActivity : ComponentActivity() {
    lateinit var changeColorbtn: Button
    lateinit var Mylayout:LinearLayout
    private val colors = intArrayOf(R.color.white, R.color.red, R.color.green, R.color.blue)
    private var currentColorIndex = 0
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        changeColorbtn = findViewById(R.id.changeColorButton)
        Mylayout = findViewById(R.id.Mylayout)
        changeColorbtn.setOnClickListener{
            currentColorIndex = (currentColorIndex + 1) % colors.size
            val newColor = resources.getColor(colors[currentColorIndex], null)
            Mylayout.setBackgroundColor(newColor)
            }

    }
}

