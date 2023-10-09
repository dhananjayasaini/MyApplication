package com.dhananjaysaini.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_page)

        var spButton = findViewById<Button>(R.id.spButton)
        spButton.setOnClickListener {
           val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
    }
}