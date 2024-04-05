package com.example.historyapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    private var etPersonAge: EditText? = null
    private var tvDisplayAnswer: TextView? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etPersonAge = findViewById(R.id.etAge)
        tvDisplayAnswer = findViewById(R.id.txtAge)

        val btnGenerateHistory = findViewById<Button>(R.id.btnGenHis)
        btnGenerateHistory.setOnClickListener {
            generateHistory()
        }
        val btnClearScreen = findViewById<Button>(R.id.btnClear)
        btnClearScreen.setOnClickListener {

            btnClearScreen
        }

    }

    private fun generateHistory() {

        var intAge: Int = 0
        var strOutput = ""

        val strEnteredValue = etPersonAge?.text.toString().trim()

        if (strEnteredValue.isEmpty()) {

            etPersonAge?.error = "Enter an age"
            return
        }

        try {

            intAge = strEnteredValue.toInt()

            if (intAge < 20 || intAge > 100) {

                tvDisplayAnswer?.text = "Error, Invalid Age"
            } else {
                when (intAge) {

                    20 -> "XXXTENTACION has died a the age of 20"
                    21 -> "Juice Wrld has died at he age of 21"
                    22 -> "Aaliyah has died at the age of 22"
                    24 -> "The Notorious B.I.G has died at the age of 24"
                    25 -> "Corey La Barrie has died at the age of 25"
                    27 -> "Amy Winehouse has died at the age of 27"
                    30 -> "Lisa Lopes has died at the age of 30"
                    33 -> "Eva Braun has died at the age of 33"
                    35 -> "Mark Salling has died at the age of 35"
                    40 -> "John Lennon has died at the age of 40"
                    42 -> "Elvis Presley has died at the age of 42"
                    44 -> "Steve Irwin has died at the age of 44"
                    47 -> "Judy Garland has died at the age of 47"
                    50 -> "Michael Jackson has died at the age of 50"
                    55 -> "Kate Spade has died at the age of 55"
                    59 -> "Clark Gable has died at the age of 59"
                    60 -> "Garry Shandling has died at the age of 60"
                    62 -> "Toby Keith has died at the age of 62"
                    64 -> "Karl Marx has died at the age of 64"
                    70 -> "Dixie Carter has died at the age of 70"
                    72 -> "John Wayne has died at the age of 72"
                    80 -> "Marlon Brando has died at the age of 80"
                    90 -> "Don Rickles has died at the age of 90"

                    else -> {

                        strOutput = "Nothing in data set"
                    }


                }
            }
            tvDisplayAnswer?.text = strOutput


        } catch (e: NumberFormatException) {

            etPersonAge?.error = "Enter a valid number"
        }


    }
    private fun clearScreen() {



        etPersonAge?.text = null
        tvDisplayAnswer?.text = ""
        {
            
    }
}


        }



