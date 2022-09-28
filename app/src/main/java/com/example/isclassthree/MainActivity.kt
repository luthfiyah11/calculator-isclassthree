package com.example.isclassthree

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnCalculator:Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnCalculator=findViewById(R.id.btn_calculator)
        btnCalculator.setOnClickListener(this)
    }

    override fun onClick(v:View?){
        if(v!=null){
            when(v.id){
                R.id.btn_calculator -> run{
                    val intentCalculator = Intent(this@MainActivity,KalkulatorActivity::class.java)
                    startActivity(intentCalculator)
                }
            }
        }
    }
}