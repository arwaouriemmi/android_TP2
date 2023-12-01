package com.gl4.tpan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var txtEmail : EditText
    lateinit var txtPwd : EditText
    lateinit var btnLogin : Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btnLogin = findViewById(R.id.btnlogin)
        btnLogin.setOnClickListener { view ->
            txtEmail = findViewById(R.id.editEmail)
            var email = txtEmail.text.toString()

            txtPwd = findViewById(R.id.editPassword)
            var pwd = txtPwd.text.toString()
            var answer:String=""
            val intent = Intent(this, WelcomeActivity::class.java)
            intent.putExtra("email", email)
            if (email!="Gl4@insat.tn"){
                answer="Email $email ou mot de passe: $pwd  sont incorrectes"
                Toast.makeText(this, answer, Toast.LENGTH_SHORT).show()
            }
        else{
                startActivity(intent)

            }


        }




    }
}