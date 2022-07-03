package com.example.buttoncolorchange

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    fun Int.Companion.randomColor(): Int
    {
        return Color.argb(255,
            Random.nextInt(256),
            Random.nextInt(256),
            Random.nextInt(256))
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val whiteSquare: Button = findViewById(R.id.button1)
        whiteSquare.setBackgroundColor(Color.RED)
        whiteSquare.setOnClickListener {
            changeColorRed()
        }


        val whiteSquare2: Button = findViewById(R.id.button2)
        whiteSquare2.setBackgroundColor(Color.WHITE)
        whiteSquare2.setTextColor(Color.BLACK)
        whiteSquare2.setOnClickListener {
            changeColorWhite()
        }


        val whiteSquare3: Button = findViewById(R.id.button3)
        whiteSquare3.setBackgroundColor(Color.BLUE)
        whiteSquare3.setOnClickListener{
            changeColorBlue()
        }
        val whiteSquare4: Button = findViewById(R.id.button4)
        whiteSquare4.setBackgroundColor(Color.BLACK)
        whiteSquare4.setOnClickListener {
            changeColorRandom()
        }



    }
    private fun changeColorRed() {
        val boxColor: TextView = findViewById(R.id.textView2)
        boxColor.setBackgroundColor(Color.RED)
    }

    private fun changeColorWhite() {
        val boxColor: TextView = findViewById(R.id.textView2)
        boxColor.setBackgroundColor(Color.WHITE)
    }

    private fun changeColorBlue() {
        val boxColor: TextView = findViewById(R.id.textView2)
        boxColor.setBackgroundColor(Color.BLUE)
    }

    private fun changeColorRandom() {
        val boxColor: TextView = findViewById(R.id.textView2)
        boxColor.setBackgroundColor(Int.randomColor())
    }


}