package com.example.kk4_xirpl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var txtUsername :  EditText = findViewById(R.id.txtUsername)
        var txtPassword : EditText = findViewById(R.id.txtPassword)
        var btnLogin : Button = findViewById(R.id.btnLogin)

        val intent = getIntent();
        var UsernameSU = intent.getStringExtra("Username")
        var EmailSU = intent.getStringExtra("Email")
        var PasswordSU = intent.getStringExtra("Password")

        btnLogin.setOnClickListener(){
            var username = txtUsername.text.toString()
            var password = txtPassword.text.toString()
            if (username == "ilham" && password == "wastuteaz") {
                var actMain = Intent(this, MainMenu::class.java)
                startActivity(actMain)
                finish()
                Toast.makeText(this, "Ahlan Wasahlan" + username, Toast.LENGTH_LONG).show()
            }
            else if(username == UsernameSU && password == PasswordSU){
                var actMain = Intent(this, MainMenu::class.java)
                startActivity(actMain)
                finish()
                Toast.makeText(this, "Welcome " + username, Toast.LENGTH_LONG)
                    .show()
            }
            else{
                Toast.makeText(this, "Username atau password yang anda masukkan salah", Toast.LENGTH_LONG).show()
            }
        }

        var txtLinkSignUp : TextView = findViewById(R.id.txtLinkSignUp)
        txtLinkSignUp.setOnClickListener(){
            var actSignUp = Intent(this, SignUp::class.java)
            startActivity(actSignUp)
            finish()
        }
    }
}