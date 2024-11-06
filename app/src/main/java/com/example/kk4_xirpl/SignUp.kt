package com.example.kk4_xirpl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_sign_up)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var txtUsernameSignUp : EditText = findViewById(R.id.txtUsernameSignUp)
        var txtEmail : EditText = findViewById(R.id.txtEmail)
        var txtPasswordSignUp : EditText = findViewById(R.id.txtPasswordSignUp)
        var btnSignUp : Button = findViewById(R.id.btnSignUp)

        btnSignUp.setOnClickListener(){
            var Username = txtUsernameSignUp.text.toString()
            var Email = txtEmail.text.toString()
            var Password = txtPasswordSignUp.text.toString()
            var actLogin = Intent(this, Login::class.java)
            actLogin.putExtra("Username", Username)
            actLogin.putExtra("Email", Email)
            actLogin.putExtra("Password", Password)
            startActivity(actLogin)
            finish()
        }
    }
}