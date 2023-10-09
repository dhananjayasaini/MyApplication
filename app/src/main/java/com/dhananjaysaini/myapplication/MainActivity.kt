package com.dhananjaysaini.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = findViewById<EditText>(R.id.username)
        var password = findViewById<EditText>(R.id.password)
        var reset = findViewById<Button>(R.id.btn_click1)
        var submit = findViewById<Button>(R.id.btn_click2)


        reset.setOnClickListener{
            username.setText("")
            password.setText("")
            Toast.makeText(this, "reset is clicked", Toast.LENGTH_SHORT).show()
        }
        submit.setOnClickListener {
            val username1 = username.text
            val password1 = password.text
            val intent = Intent(this,SecondActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "submit is clicked", Toast.LENGTH_SHORT).show()
        }




    }
}
