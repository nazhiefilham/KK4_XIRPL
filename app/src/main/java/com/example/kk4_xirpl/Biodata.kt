package com.example.kk4_xirpl

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Biodata : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_biodata)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var txtNameBiodata : EditText = findViewById(R.id.txtNameBiodata)
        var txtAddressBiodata : EditText = findViewById(R.id.txtAddressBiodata)
        var txtDateBiodata : EditText = findViewById(R.id.txtDateBiodata)
        var rgSex : RadioGroup = findViewById(R.id.rgSex)
        var rbMale : RadioButton = findViewById(R.id.rbMale)
        var rbFemale : RadioButton = findViewById(R.id.rbFemale)
        var swAbsent : Switch = findViewById(R.id.swAbsent)
        var btnSaveBio : Button = findViewById(R.id.btnSaveBio)

        btnSaveBio.setOnClickListener(){
            var NameBiodata = txtNameBiodata.text.toString()
            var AddressBiodata = txtAddressBiodata.text.toString()
            var DateBiodata = txtDateBiodata.text.toString()
            var sex = ""
            if (rbMale.isChecked) sex = "Male"
            else if (rbFemale.isChecked) sex = "Female"
            else sex = "Please Select Sex"
            Toast.makeText(this, sex, Toast.LENGTH_LONG).show()
            var absent = ""
            if (swAbsent.isChecked) absent = "Present"
            else if (!swAbsent.isChecked) absent = "Absent"

            var actViewBio = Intent(this, ViewBiodata::class.java)
            actViewBio.putExtra("Name", NameBiodata)
            actViewBio.putExtra("Address", AddressBiodata)
            actViewBio.putExtra("Date", DateBiodata)
            actViewBio.putExtra("Sex", sex)
            actViewBio.putExtra("Absent", absent)
            startActivity(actViewBio)
            finish()
        }
    }
}