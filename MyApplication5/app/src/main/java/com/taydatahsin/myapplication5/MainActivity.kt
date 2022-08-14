package com.taydatahsin.myapplication5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun goPanel(view: View){
        var data =goData.text.toString()
        var intent =Intent(applicationContext,MainActivity2::class.java)
        intent.putExtra("gelenVeri",data)
        startActivity(intent)
        finish()
    }
}