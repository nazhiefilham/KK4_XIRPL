package com.example.kk4_xirpl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class KalkulatorSederhana : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_kalkulator_sederhana)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnKembaliKalkulator)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var txtAngka1 : EditText = findViewById(R.id.txtAngka1)
        var txtAngka2 : EditText = findViewById(R.id.txtAngka2)
        var txtHasil : TextView = findViewById(R.id.txtHasil)
        var btnProses : Button = findViewById(R.id.btnProses)
        var spOperator : Spinner = findViewById(R.id.spOperator)

        btnProses.setOnClickListener() {

            var operator = spOperator.selectedItem.toString()

            if (operator == "+") {
                var hasil = txtAngka1.text.toString().toInt() +
                        txtAngka2.text.toString().toInt()
                txtHasil.text = hasil.toString()
            }

            if (operator == "-") {
                var hasil = txtAngka1.text.toString().toInt() -
                        txtAngka2.text.toString().toInt()
                txtHasil.text = hasil.toString()
            }

            if (operator == "x") {
                var hasil = txtAngka1.text.toString().toInt() *
                        txtAngka2.text.toString().toInt()
                txtHasil.text = hasil.toString()
            }

            if (operator == ":") {
                var hasil = txtAngka1.text.toString().toDouble() /
                        txtAngka2.text.toString().toDouble()
                txtHasil.text = hasil.toString()
            }

        }
        var btnKembaliKalkulator : Button = findViewById(R.id.btnKembaliKalkulator)

        btnKembaliKalkulator.setOnClickListener(){
            var actMain = Intent(this, MainMenu::class.java)
            startActivity(actMain)
        }
    }
}