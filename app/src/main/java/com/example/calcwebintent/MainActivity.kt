package com.example.calcwebintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var buttontocalculator: Button
    lateinit var buttontoweb: Button
    lateinit var buttontointent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttontocalculator = findViewById(R.id.btn_Calc)
        buttontocalculator.setOnClickListener {
            val intent = Intent(this, Calculator::class.java)
            startActivity(intent)
        }

        buttontoweb = findViewById(R.id.btn_Web)
        buttontoweb.setOnClickListener {
            val intent = Intent(this, Web::class.java)
            startActivity(intent)
        }

        buttontointent = findViewById(R.id.btn_intent)
        buttontointent.setOnClickListener {
            val intent = Intent(this, com.example.calcwebintent.Intent::class.java)
            startActivity(intent)
        }
    }
}