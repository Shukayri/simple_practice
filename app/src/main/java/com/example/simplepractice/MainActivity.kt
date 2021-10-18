package com.example.simplepractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var tv: TextView
    lateinit var ed: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button = findViewById(R.id.button)
        tv = findViewById(R.id.textView)
        ed = findViewById(R.id.editTextTextPersonName)

        button.setOnClickListener {
            val text = ed.text.toString()
            tv.text = "$text"
        }
    }
}