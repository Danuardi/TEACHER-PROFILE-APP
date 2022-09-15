package com.example.teacherprofileapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnProfileguru = findViewById<Button>(R.id.buttonprofileguru)
        val btnrequestguru = findViewById<Button>(R.id.buttonrequestguru)
        val btnprofilesmk = findViewById<Button>(R.id.buttonprofilesmk)


        btnProfileguru.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

        btnrequestguru.setOnClickListener {
            val intent = Intent (this, ThirdActivity::class.java)
            startActivity(intent)
        }

        btnprofilesmk.setOnClickListener {
            val intent = Intent (this, FourthActivity::class.java)
            startActivity(intent)
        }
    }
}