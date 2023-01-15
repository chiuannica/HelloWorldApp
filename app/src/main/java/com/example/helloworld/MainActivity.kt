package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import android.view.View.OnLongClickListener




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.helloButton)
        button.setOnClickListener {
            Toast.makeText(this, "Hello World", Toast.LENGTH_SHORT).show()

        }

        button.setOnLongClickListener(OnLongClickListener {
            Toast.makeText(this, "Hellllloooooooo Clicked ", Toast.LENGTH_SHORT).show()
            true
        })
    }
}