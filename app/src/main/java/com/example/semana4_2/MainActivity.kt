package com.example.semana4_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txtNum1:EditText=findViewById(R.id.txtN1)
        val txtNum2:EditText=findViewById(R.id.txtN2)
        val btnSuma:Button=findViewById(R.id.btnSuma)
        val btnResta:Button=findViewById(R.id.btnResta)
        val txtRes:TextView=findViewById(R.id.txtRes)

        btnSuma.setOnClickListener(){
            var N1=0
            var N2=0
            var suma=0

            N1=txtNum1.text.toString().toInt()
            N2=txtNum2.text.toString().toInt()
            suma=N1+N2
            txtRes.text="El resultado es: "+suma.toString()
        }

        btnResta.setOnClickListener(){
            var N1=0
            var N2=0
            var suma=0

            N1=txtNum1.text.toString().toInt()
            N2=txtNum2.text.toString().toInt()
            suma=N1-N2
            txtRes.text="El resultado es: "+suma.toString()
        }
    }





}