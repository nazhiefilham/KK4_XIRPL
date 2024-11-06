package com.example.kk4_xirpl

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btnKembaliKalkulator)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var variable1 = "Ini adalah variable 1"
        variable1 = "Ini mengubah isi variable"

        var TextView1 : TextView = findViewById(R.id.TextView1)
        var btnTombol1 : Button = findViewById(R.id.btnTombol1)
        var txtInput : EditText = findViewById(R.id.txtInput)

        TextView1.text = "Ini isinya langsung ketik aja disini"

        btnTombol1.setOnClickListener(){
            //Toast.makeText(this, "Pop up iemah" , Toast.LENGTH_LONG).show()
            TextView1.text = " Ahlan Wasahlan " + txtInput.text
        }
    }
}