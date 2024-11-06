package com.example.kk4_xirpl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var btnActKalkulator : Button = findViewById(R.id.btnActKalkulator)

        btnActKalkulator.setOnClickListener() {
            var actKalkulator = Intent(this, KalkulatorSederhana::class.java)
            startActivity(actKalkulator)
            this.finish()
        }

        var btnBiodata : Button = findViewById(R.id.btnBiodata)

        btnBiodata.setOnClickListener() {
            var Biodata = Intent(this, Biodata::class.java)
            startActivity(Biodata)
            this.finish()
        }

        var btnLogout : Button = findViewById(R.id.btnLogout)

        btnLogout.setOnClickListener(){
            var Login = Intent(this, Login::class.java)
            startActivity(Login)
            this.finish()
        }

        var btnWeb : Button = findViewById(R.id.btnWeb)

        btnWeb.setOnClickListener(){
            var HalamanWeb = Intent(this, HalamanWeb::class.java)
            startActivity(HalamanWeb)
            this.finish()
        }

        var btnMainActivity : Button = findViewById(R.id.btnMainActivity)

        btnMainActivity.setOnClickListener(){
            var MainActivity = Intent(this, MainActivity::class.java)
            startActivity(MainActivity)
            this.finish()
        }
    }
}