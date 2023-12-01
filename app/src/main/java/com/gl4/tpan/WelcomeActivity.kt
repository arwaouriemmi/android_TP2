package com.gl4.tpan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.EditText
import android.widget.TextView

class WelcomeActivity : AppCompatActivity() {
    lateinit var txtWelcome  : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val email = intent.getStringExtra("email")

         txtWelcome = findViewById(R.id.txtWelcome)
        var message:String= "Bienvenue $email"
        val editableText = Editable.Factory.getInstance().newEditable(message)
        txtWelcome.text = editableText


    }
}